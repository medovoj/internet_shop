<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/order" method="post">
    <input type="hidden" name="id_customer" value="<%= request.getParameter("idCustomer")%>">
    Product name: <input name="product"><br>
    Product count: <input name="count" type="number"><br>
    <input type="submit" value="Make order">

</form>
</body>
</html>