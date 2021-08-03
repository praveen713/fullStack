<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<meta  charset="ISO-8859-1">
<title>Purchase details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<body>
<h1 style="text-align: center">Purchase DETAILS</h1>
<table class="table table-bordered">
<thead>
<tr>
<th scope="col">Purchase Id</th>
<th scope="col">Purchase date</th>
<th scope="col">Customer Id</th>
<th scope="col">Product Id</th>
<th scope="col">Product catagory</th>
<th scope="col">Action</th>

</tr>
</thead>

<tbody>
<c:forEach items="${purchases}" var="purchase">
<tr class="">
<td>${purchase.id}</td>
<td>${purchase.date}</td>
<td>${purchase.customer.id}</td>
<td>${purchase.products.id}</td>
<td>${purchase.products.catagory}</td>
<td><a href="/update/${purchase.id}" class="btn btn-info" role="button">Update</a>&nbsp
<a href="/delete/${purchase.id}" class="btn btn-danger" role="button">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="/getAdminMenu" class="btn btn-primary" role="button">Back</a>
</body>
</html>