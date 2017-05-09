<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="${basePath}/css/admin/htmleaf-demo.css">
	<link rel="stylesheet" type="text/css" href="${basePath}/css/admin/login.css">
	<script type="text/javascript" src="${basePath}/js/jquery-1.11.0.min.js"></script>
	<script type="text/javascript" src="${basePath}/js/admin/login.js"></script>
	<title>Administrator Login Page</title>
</head>
<body>
	<div class="htmleaf-container">
		
		<div class="demo form-bg">
	        <div class="container">
	            <div class="row">
	                <div class="col-md-offset-3 col-md-6">
	                    <form class="form-horizontal">
	                        <span class="heading">用户登录</span>
	                        <div class="form-group">
	                            <input type="text" class="form-control" id="account" placeholder="账户">
	                            <i class="fa fa-user"></i>
	                        </div>
	                        <div class="form-group help">
	                            <input type="password" class="form-control" id="password" placeholder="密码">
	                            <i class="fa fa-lock"></i>
	                            <a href="#" class="fa fa-question-circle"></a>
	                        </div>
	                        <div class="form-group">
	                            <div class="main-checkbox">
	                                <input type="checkbox" value="None" id="checkbox1" name="check"/>
	                                <label for="checkbox1"></label>
	                            </div>
	                            <span class="text">记住我</span>
	                            <button type="submit" class="btn btn-default" id="login">登录</button>
	                        </div>
	                    </form>
	                </div>
	            </div>
	        </div>
	    </div>
	</div>
</body>
</html>