<%--
  Created by IntelliJ IDEA.
  User: wade1
  Date: 2017-01-11
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<s:form action="employee_save" method="POST" namespace="/" theme="simple">
  <s:textfield name="username"/>
  <br>
  <s:textfield name="password"/>
  <br>
  <input type="submit" value="提交">
</s:form>
  </body>
</html>
