<%--
  Created by IntelliJ IDEA.
  User: wade1
  Date: 2017-01-11
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title></title>
</head>
<body>
<s:property value="#session.existEmployee.ename"/>

<s:form action="department_findAll" method="POST" namespace="/" theme="simple">
  <input type="submit" value="search">
</s:form>
</body>
</html>
