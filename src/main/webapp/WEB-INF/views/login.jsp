<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"--%>
         <%--pageEncoding="ISO-8859-1" isELIgnored="false"%>--%>
<%--<c:set var="contextPath" value="${pageContext.request.contextPath}"/>--%>
<!DOCTYPE html>
<html>
<head>
    <title>ShopApp</title>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="../css/index.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body class="align">

<header style="Width: 100%;height:100px;background-color:rgb(219, 189, 20);font-size:20px">
    <div class="nav__list" style="display: flex;color:#007bff " >
        <div class="nav_div_link">
            <a class="nav__link active-link" href="/home" onclick="route()">TRANG CHỦ</a>
        </div>
        <div class="nav_div_link">
            <a class="nav__link " onclick="route()">GIỚI THIỆU</a>
        </div>
        <div class="nav_div_link">
            <a class="nav__link" href="/product" >Sản Phẩm</a>
        </div>
        <div class="nav_div_link">
            <a class="nav__link "  onclick="route()">LIÊN HỆ</a>
        </div>
        <div class="nav_div_link " style="border:none ;">
            <a href="/login" onclick="route()">
                MyAccount
            </a>
            <img class="nav__link__img" src="../assets/img-icon/person-not-login-icon.png" alt="">
        </div>
    </div>
</header>

 <!-- form đăng nhập -->
<h3>Đăng nhập</h3>
<form method="post" action="${pageContext.request.contextPath}/checkLogin" id="login">

    <input name="email" type="text" class="form-control" placeholder="email"
           autofocus="true"/>

    <input name="password" type="password" class="form-control" placeholder="Password"/>

    <button class="btn btn-lg btn-primary btn-block" type="submit">Đăng nhập</button>
    <p style="color: blueviolet;">Bạn chưa có tài khoản ?
        <span id="loginHandle" style="color: rgb(243, 60, 60);">Đăng kí</span></p>
</form>

<svg xmlns="http://www.w3.org/2000/svg" class="icons">
    <symbol id="icon-arrow-right" viewBox="0 0 1792 1792">
        <path d="M1600 960q0 54-37 91l-651 651q-39 37-91 37-51 0-90-37l-75-75q-38-38-38-91t38-91l293-293H245q-52 0-84.5-37.5T128 1024V896q0-53 32.5-90.5T245 768h704L656 474q-38-36-38-90t38-90l75-75q38-38 90-38 53 0 91 38l651 651q37 35 37 90z" />
    </symbol>
    <symbol id="icon-lock" viewBox="0 0 1792 1792">
        <path d="M640 768h512V576q0-106-75-181t-181-75-181 75-75 181v192zm832 96v576q0 40-28 68t-68 28H416q-40 0-68-28t-28-68V864q0-40 28-68t68-28h32V576q0-184 132-316t316-132 316 132 132 316v192h32q40 0 68 28t28 68z" />
    </symbol>
    <symbol id="icon-user" viewBox="0 0 1792 1792">
        <path d="M1600 1405q0 120-73 189.5t-194 69.5H459q-121 0-194-69.5T192 1405q0-53 3.5-103.5t14-109T236 1084t43-97.5 62-81 85.5-53.5T538 832q9 0 42 21.5t74.5 48 108 48T896 971t133.5-21.5 108-48 74.5-48 42-21.5q61 0 111.5 20t85.5 53.5 62 81 43 97.5 26.5 108.5 14 109 3.5 103.5zm-320-893q0 159-112.5 271.5T896 896 624.5 783.5 512 512t112.5-271.5T896 128t271.5 112.5T1280 512z" />
    </symbol>
</svg>
 <!-- form đang kí -->

 <div id="register" class="grid show_form " style="margin: 30px">

    <form  method="POST" class="form login">

        <div class="form__field">
            </svg><span class="hidden">Tên đăng nhập</span></label>
            <input autocomplete="username" id="login__username" type="text" name="username" class="form__input" placeholder="Tên đăng nhập" required>
        </div>
        <div class="form__field">
            </svg><span class="hidden">Email</span></label>
            <input autocomplete="username" id="login__username" type="text" name="username" class="form__input" placeholder="Email" required>
        </div>
        <div class="form__field">
            </svg><span class="hidden">Số điện thoại</span></label>
            <input autocomplete="username" id="login__username" type="text" name="username" class="form__input" placeholder="Số điện thoại" required>
        </div>
        <div class="form__field">
            </svg><span class="hidden">Mật Khẩu</span></label>
            <input id="login__password" type="password" name="password" class="form__input" placeholder="Mật khẩu" required>
        </div>
        <div class="form__field">
            </svg><span class="hidden">Mật Khẩu</span></label>
            <input id="login__password" type="password" name="password" class="form__input" placeholder="Nhập lại Mật khẩu" required>
        </div>
        <div class="form__field">
            <input type="submit" value="Đăng Ký">
        </div>
         <p style="color: blueviolet;">Bạn đã có tài khoản ?
        <span id="registerHandle" style="color: rgb(243, 60, 60);">Đăng Nhập</span></p>
    </form>
</div>
<footer class="text-center text-white" style="background-color: #f1f1f1;width: 100%">
    <!-- Grid container -->
    <div class="container pt-4">
        <!-- Section: Social media -->
        <section class="mb-4">
            <!-- Facebook -->
            <a
                    class="btn btn-link btn-floating btn-lg  m-1"
                    href="#!"
                    role="button"
                    data-mdb-ripple-color="dark"
            ><i class=" text-dark fab fa-facebook-f"></i
            ></a>

            <!-- Twitter -->
            <a
                    class="btn btn-link btn-floating btn-lg text-dark m-1"
                    href="#!"
                    role="button"
                    data-mdb-ripple-color="dark"
            ><i class="fab fa-twitter"></i
            ></a>

            <!-- Google -->
            <a
                    class="btn btn-link btn-floating btn-lg text-dark m-1"
                    href="#!"
                    role="button"
                    data-mdb-ripple-color="dark"
            ><i class="fab fa-google"></i
            ></a>

            <!-- Instagram -->
            <a
                    class="btn btn-link btn-floating btn-lg text-dark m-1"
                    href="#!"
                    role="button"
                    data-mdb-ripple-color="dark"
            ><i class="fab fa-instagram"></i
            ></a>

            <!-- Linkedin -->
            <a
                    class="btn btn-link btn-floating btn-lg text-dark m-1"
                    href="#!"
                    role="button"
                    data-mdb-ripple-color="dark"
            ><i class="fab fa-linkedin"></i
            ></a>
            <!-- Github -->
            <a
                    class="btn btn-link btn-floating btn-lg text-dark m-1"
                    href="#!"
                    role="button"
                    data-mdb-ripple-color="dark"
            ><i class="fab fa-github"></i
            ></a>
        </section>
        <!-- Section: Social media -->
    </div>
    <!-- Grid container -->

    <!-- Copyright -->
    <div class="text-center text-dark p-3" style="background-color: rgba(0, 0, 0, 0.2);">
        © 2022 Copyright:
        <a class="text-dark" href="https://mdbootstrap.com/">shopApp.com</a>
    </div>
    <!-- Copyright -->
</footer>
<!--=============== MAIN JS ===============-->
<script src="../js/main.js"></script>
<script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
        crossorigin="anonymous"
></script>
<script
        src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
        integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
        crossorigin="anonymous"
        referrerpolicy="no-referrer"
></script>
<!--=============== API JS ===============-->
<script src="../js/api.js"></script>

</body>
</html>

