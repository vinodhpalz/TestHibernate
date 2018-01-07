<%@ page import="model.ProductDAO, java.util.List, model.Product" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Products List</h1>
<%
List<Product> lp = (List<Product>)request.getAttribute("products");
for(Product p: lp)
{
	out.println(p.getProductName());
}
%>


</body>
</html>