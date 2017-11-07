<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注销</title>
  </head>  
  <body>
    <%
     response.setHeader("refresh","0;URL=../../login.jsp");
     session.invalidate();
   %>
  </body>
</html>
