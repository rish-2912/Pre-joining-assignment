<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
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
    </style>
<body>
    <h2>Welcome, ${username}!</h2>
    <form action="logout" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>