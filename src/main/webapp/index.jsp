<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <base href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()%>/">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>后台管理系统</title>
    <base href="<%=request.getContextPath() %>/" />
    <!-- Bootstrap -->
    <link href="statics/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="statics/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="statics/css/nprogress.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="statics/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="login">
    <div class="login_wrapper">
      <h1>APP信息管理平台</h1>
      <div>
      <a href="userLoginController/login" class="btn btn-link">后台管理系统 入口</a>
      </div>
      <div>
      <a href="/doDevUser/jump" class="btn btn-link">开发者平台 入口</a>
      </div>
    </div>
  </body>
</html>