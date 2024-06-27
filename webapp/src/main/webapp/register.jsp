<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <script src="register.js" defer></script>
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
    	.submit{
    		text-align:center;
    	}
    	a{
    		margin-top:18px;
    	}
    	p{
    		margin:0;
    		font-size:12px;
    		
    	}
    	.constraints{
    		width:max-content;
    		text-align:left;
    		position:relative;
    		left:72px;
    		bottom:15px;
    	}
    	p{
    		color:red;
    	}
    </style>
</head>
<body>
    <h2>Register</h2>
    <form name="registerForm" action="register" method="post" onsubmit="return validateRegisterForm()">
    	<div class="form">
	    	<div>
	    		<label for="username">Username:</label>
	        	<input type="text" id="username" name="username"><br><br>
	    	</div>
	        <div>
	        	<label for="password">Password:</label>
	        	<input type="password" id="password" name="password" onChange="validatePassword()"><br><br>
	        	<div class="constraints">
	        		<p id="char">Atleast 8 characters</p>
	        		<p id="capital">Atleast 1 Capital letter</p>
	        		<p id="digit">Atleast 1 digit</p>
	        	</div>
	        </div>
	        
	        <div>
	        	<label for="password">Email:</label>
	        	<input type="email" id="email" name="email"><br><br>
	        </div>
	        
	      </div>
	      <div class="submit">
	        	<input type="submit" value="Register">
	       </div>
    </form>
    <a href="login.jsp">Already registered? Login here</a>
</body>
</html>