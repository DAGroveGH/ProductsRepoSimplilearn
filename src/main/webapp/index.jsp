<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Products</title>
    </head>

    <body>
        <h1><%= "Products" %></h1>
        <br/>
        <form action="products">
            <input type="text" name="productId">
            <input type="submit" value="search">
        </form>
    </body>
</html>