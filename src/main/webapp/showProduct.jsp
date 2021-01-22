<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 1/21/2021
  Time: 9:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="entities.Product"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Product product = (Product)session.getAttribute("product");

    out.println(product);
%>
</body>
</html>

