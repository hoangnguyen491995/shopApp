
var emailRegex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
var nameRegex = /^[a-zA-Z ]*$/
var phoneRegex = /^\d+$/
var passRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{1,}$/


function EditUserInternal(name_edit_error, phone_edit_error, email, redirect, api) {
    console.log(name_edit_error);
    console.log(phone_edit_error);
    console.log(email);

    fetch(api, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json",
            Authorization: "Bearer " + localStorage.token,
        },
        body: JSON.stringify({
            fullName: name_edit_error,
            phone: phone_edit_error,
            email: email,
        }),
    }).then(function (res) {
        location.replace(redirect);
        console.log(res.fullName);
        localStorage.setItem("name", response.userDomain.fullName);
        return res.json();
    })
        .catch((error) => {

        })
}

function addUserRegister(name_error, phone_error, email_error, pass_error, api, redirect) {

    fetch(api, {
        method: 'POST',
        headers: {
            "Content-Type": "application/json",
            Authorization: "Bearer" + localStorage.token,
        },
        contentType: "application/json; charset=utf-8"
        ,
        body: JSON.stringify(
            {
                fullName: name_error,
                phone: phone_error,
                email: email_error,
                password: pass_error,
            }
        )
    })
        .then(function (res) {
            // location.replace(redirect)
            console.log(res);
            return res.json()
        })
        .then()
}
function Validator(options) {

    var elementAdd = document.querySelector(options.Add)
    var elementNameAdd = document.querySelector(options.nameAdd)
    var elementEmailAdd = document.querySelector(options.emailAdd)
    var elementPhoneAdd = document.querySelector(options.phoneAdd)
    var elementPassAdd = document.querySelector(options.passAdd)
    var elementPass2Add = document.querySelector(options.pass2Add)
    var elementErrorAdd = document.querySelector(options.listErrorAdd)
    var api = options.api
    var redirect = options.redirect
    var name_error = $(options.nameAdd).val();
    var email_error = $(options.emailAdd).val();
    var phone_error = $(options.phoneAdd).val();
    var pass_error = $(options.passAdd).val();


    elementAdd.onclick = function () {

        var ArrayError = []
        if (elementNameAdd.value == "") {
            ArrayError.push({ error: "Vui l??ng nh???p T??n ?????y ????? c???a b???n !" })
        } else
        {
            if (elementNameAdd.value.length < 8) {
                ArrayError.push({ error: "T??n ph???i ch???a ??t nh???t 8 k?? t??? !" })
            }
            if(!nameRegex.set(elementNameAdd.value)){
                ArrayError.push({ error: "T??n kh??ng h???p l??? !" })
            }
        } 

        if (elementEmailAdd.value == "") {
            ArrayError.push({ error: "Vui l??ng nh???p Email !" })
        } else {
            if (!elementEmailAdd.value.includes("@")) {
                ArrayError.push({ error: "email ph???i ch???a k?? t??? @ !" })
            }
            if (elementEmailAdd.value.split(" ").length > 1) {
                ArrayError.push({ error: "Trong email kh??ng ???????c ch???a kho???ng tr???ng !" })
            }
            if (elementEmailAdd.value.split("@")[0] == "") {
                ArrayError.push({ error: "Email ph???i c?? ch???a local-part !" })
            }
            if (!emailRegex.test(elementEmailAdd.value)) {
                ArrayError.push({ error: "?????a ch??? email kh??ng h???p l??? !" })
            } 
        }

        if (elementPhoneAdd.value == "") {
            ArrayError.push({ error: "Vui l??ng nh???p s??? ??i???n tho???i !" })
        } else {
            if (elementPhoneAdd.value < 9) {
                ArrayError.push({ error: " S??? ??i???n tho???i ph???i ch???a t??? 9 ?????n 16 k?? t??? !" })
                if (!phoneRegex.test(elementPhoneAdd)) {
                    ArrayError.push({ error: " S??? ??i???n tho???i ch??? ch???a s??? v?? kh??ng ???????c ch???a kho???ng tr???ng!" })
                }
            }
        }

        if (elementPassAdd.value == "") {
            ArrayError.push({ error: "Vui l??ng nh???p m???t kh???u !" })
        } else {
            if (elementPassAdd.value.length < 7) {
                ArrayError.push({ error: "M???t kh???u kh???u ch???a t???i thi???u 8 k?? t??? !" })
            }
            if (!passRegex.test(elementPassAdd.value)) {
                ArrayError.push({ error: "M???t kh???u ph???i ch???a ch???,s??? v?? kh??ng ch???a kho???ng tr???ng !" })
            }
        }
        if (elementPass2Add.value == "") {
            ArrayError.push({ error: "Vui l??ng x??c nh???n l???i m???t kh???u !" })
        } else if (elementPass2Add.value != elementPassAdd.value && elementPassAdd.value != "") {
            ArrayError.push({ error: "M???t Kh???u kh??ng kh???p !" })
        }

        var htmls = ArrayError.map(function (error) {
            return `
                    <li> ${error.error}</li>
                   `
        })
        elementErrorAdd.innerHTML = htmls.join("")

        if (ArrayError.length == 0) {
            addUserRegister(name_error, phone_error, email_error, pass_error, api, redirect)
        } else if (ArrayError != 0) {
            console.log("c?? l???i");
        }

    }
    // edit  
    var elementEdit = document.querySelector(options.edit)
    var elementNameEdit = document.querySelector(options.nameEdit)
    var elementPhoneEdit = document.querySelector(options.phoneEdit)
    var elementErrorEdit = document.querySelector(options.listErrorEdit)

    elementEdit.onclick = function () {

        var name_edit_error = $(options.nameEdit).val();
        var phone_edit_error = $(options.phoneEdit).val();
        var email_edit_error = $(options.emailEdit).val();
      
        var ArrayError_edit = []
        if (elementNameEdit.value == "") {
            ArrayError_edit.push({ error: "Vui l??ng nh???p T??n ?????y ????? c???a b???n !" })
        }else
        {
            if (elementNameEdit.value.length < 8) {
                ArrayError_edit.push({ error: "T??n ph???i ch???a ??t nh???t 8 k?? t??? !" })
            }
            if(!nameRegex.test(elementNameEdit.value)){
                ArrayError_edit.push({ error: "T??n kh??ng h???p l??? !" })
            }
        } 

        if (elementPhoneEdit.value == "") {
            ArrayError_edit.push({ error: "Vui l??ng nh???p S??? ??i???n tho???i c???a b???n !" })
        }
        else {
            if (elementPhoneEdit.value < 9) {
                ArrayError_edit.push({ error: " S??? ??i???n tho???i ph???i ch???a t??? 9 ?????n 16 k?? t??? !" })
                if (!phoneRegex.test(elementPhoneEdit)) {
                    ArrayError_edit.push({ error: " S??? ??i???n tho???i ch??? ch???a s??? v?? kh??ng ???????c ch???a kho???ng tr???ng!" })
                }
            }
        }
        console.log(ArrayError_edit);
        var htmls_edit = ArrayError_edit.map(function (message) {

            return `
                   <li> ${message.error}</li>
                   `
        })
        elementErrorEdit.innerHTML = htmls_edit.join("")

        if (ArrayError_edit.length == 0) {

            EditUserInternal(name_edit_error, phone_edit_error, email_edit_error, pass_error, api, redirect)
        } else if (ArrayError_edit.length != 0) {
            console.log("c?? l???i");
        }
    }

}