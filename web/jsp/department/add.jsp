<%--
  Created by IntelliJ IDEA.
  User: yunfei
  Date: 2017/2/10
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form id="saveForm" action="department_save" method="POST" namespace="/">
    名称：<s:textfield name="dname"></s:textfield>
    描述：<s:textfield name="ddesc"></s:textfield>
    <a href="javascript:document.getElementById('saveForm').submit()">提交</a>
    <a href="javascript:history.go(-1)">回退</a>
</s:form>
</body>
</html>
