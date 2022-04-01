<%@ page import="model.Model" %><%--
  Created by IntelliJ IDEA.
  User: medovoy
  Date: 01.04.2022
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
model = ${model} <br>
model.list = ${model.list} <br>

foreach1=

<%
    Model model = (Model) request.getAttribute("model");
    for (String item : model.getList()) {
%>
<%=item %>||<%} %>
<br>

foreach2=

<%
    model = (Model) request.getAttribute("model");
    for (String item : model.getList()) {
        pageContext.setAttribute("item", item);
%>
${item }
||
<%} %>
<br>

foreach1=${model.data}<br>
