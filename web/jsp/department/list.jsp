<%--
  Created by IntelliJ IDEA.
  User: yunfei
  Date: 2017/2/6
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <s:iterator value="list" var="d">
        <tr>
            <td>
                <s:property value="#d.dname"/>
            </td>
        </tr>
    </s:iterator>
</table>
<table>
    <tr>
        <td>
            <span>
                第<s:property value="currPage"/>/<s:property value="totalPage"/>页
            </span>
            <s:if test="currPage !=1">
                <a href="${pageContext.request.contextPath}/department_findAll.action?currPage=1">首页</a>
                <a href="${pageContext.request.contextPath}/department_findAll.action?currPage=<s:property value="currPage-1"/>">上一页</a>
            </s:if>
            <s:if test="currPage != totalPage">
                <a href="${pageContext.request.contextPath}/department_findAll.action?currPage=<s:property value="currPage+1"/>">下一页</a>
                <a href="${pageContext.request.contextPath}/department_findAll.action?currPage=<s:property value="totalPage"/>">尾页</a>
            </s:if>
        </td>
    </tr>
</table>
</body>
</html>
