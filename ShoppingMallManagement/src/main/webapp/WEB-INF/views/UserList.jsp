<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<meta  charset="ISO-8859-1">
<title>Customer details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<body>
<h1 style="text-align: left">CUSTOMER DETAILS</h1>
<form action="searchByName">
<div [hidden]="submitted" style="width: 400px;">
      <input type="text" placeholder="Search.." name="name">
      <button type="submit"  class="btn btn-primary">Search</button>
      </div>
 </form>
<table class="table table-bordered">
<thead>
<tr>
<th scope="col">Customer Id</th>
<th scope="col">Customer name</th>
<th scope="col">Customer Email</th>
<th scope="col">Customer Password </th>
<th scope="col">Customer Address </th>

</tr>
</thead>

<tbody>
<c:forEach items="${customers}" var="customer">
<tr class="">
<td>${customer.customerId}</td>
<td>${customer.name}</td>
<td>${customer.email}</td>
<td>${customer.password}</td>
<td>${customer.address}</td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="/getAdminMenu" class="btn btn-primary" role="button">Back</a>
</body>
</html>