<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Simple Web App</title>
    <style>
      body {
        height: 100vh;
        width: 100vw;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        text-align: center;
      }
      div {
        display: flex;
        flex-direction: row;
      }
    </style>
  </head>
  <body>
    <h2>Welcome to Simple Web App</h2>
    <div>
      <a href="login.jsp">Login</a> | <a href="register.jsp">Register</a>
    </div>
  </body>
</html>
