<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <script src="login.js" defer></script>
    <style>
    	body{
    		height:100vh;
    		width:100vw;
    		margin:0;
    		padding:0;
    		display:flex;
    		justify-content:center;
    		align-items:center;
    		flex-direction:column;
    		text-align:center;
    	}
    	.form{
    		display:flex;
    		flex-direction:column;
    		align-items:flex-end;
    	}
    </style>
</head>
<body>
    <h2>Login</h2>
    <form name="loginForm" action="login" method="post" onsubmit="return validateLoginForm()">
    	<div class="form">
    		<div>
		        <label for="username">Username:</label>
		        <input type="text" id="username" name="username"><br><br>
		       </div>
		     <div>
		        <label for="password">Password:</label>
		        <input type="password" id="password" name="password"><br><br>
	        </div>
        </div>
        <input type="submit" value="Login">
        <br><br>
        <span style="color:red;">${message}</span>
    </form>
    <a href="register.jsp">New user? Register here</a>
</body>
</html>