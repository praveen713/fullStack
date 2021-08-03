<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<meta  charset="ISO-8859-1">
<title>Product details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<body>
<h1 style="text-align: center">PRODUCT DETAILS</h1>
<table class="table table-bordered">
<thead>
<tr>
<th scope="col">Product Id</th>
<th scope="col">Product name</th>
<th scope="col">Product catagory</th>
<th scope="col">Price</th>
<th scope="col">Action</th>

</tr>
</thead>

<tbody>
<c:forEach items="${products}" var="product">
<tr class="">
<td>${product.productId}</td>
<td>${product.name}</td>
<td>${product.catagory}</td>
<td>${product.price}</td>
<td><a href="/buyNow/${product.productId}" class="btn btn-info" role="button">Buy Now</a>&nbsp

</tr>
</c:forEach>
</tbody>
</table>
<a href="/manageProducts" class="btn btn-primary" role="button">Back</a>
</body>
</html>