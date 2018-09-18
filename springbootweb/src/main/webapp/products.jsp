<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html  xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>

	<!-- Access the bootstrap Css like this, 
		Spring boot will handle the resource mapping automcatically -->
	<!--link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" /-->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!--c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" /-->
	<style>
	.red{
		color: red;
	}
	.clickable{
		cursor: pointer;
	}
	</style>
	<script type="text/javascript">
    function logout() {
        $.post("/logout",function(){
        	console.log("Logout...")
        	window.location="/product/list";
        });
    }
	</script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Spring Boot</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4 red"><h4>Name</h4></div>
			<div class="col-md-8"><h4>Description</h4></div>
		</div>
		<c:forEach items="${products}" var="product">
		<div class="row">
			<div class="col-md-4">${product.name}</div>
			<div class="col-md-4">${product.description}</div>
		</div>
		</c:forEach>
	</div>
	
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<!--form action="/logout" method="post">
				<input type="submit" class="navbar-brand" value="Logout"/>
				</form-->
				<div class="navbar-brand clickable" onClick="logout()">Logout</div>
			</div>
		</div>
	</nav>		
	<!--script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script-->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>