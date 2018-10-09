<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="js/bootstrap.css">
<script src="js/mainJS.js"></script> 
<title>Oi and Grid - Login Page</title>
</head>
<body>
	<div class="center">
	
	<font color="red">${errorMessage}</font>
    <form method="post", action="login">
	
		<pre><h1 style="padding-left: 75px;color: #b0aec4" >Please Login</h1></pre><br>
		<pre>
        Name	 :	<input type="text" name="name" required /><br>
        Password :	<input type="password" name="password" required/> <br><br>
		<input type="submit" value="Login"/> 	<input type="reset" value="Clear"/> 
		 
		</pre>
    </form>
	</div>
	<div class="footer">
		<h5>
			OI and Grid Project <br>
			Technical Univercity - Sofia<br>
			Petar Botanakov
		</h5>
	</div>
</body>
</html>