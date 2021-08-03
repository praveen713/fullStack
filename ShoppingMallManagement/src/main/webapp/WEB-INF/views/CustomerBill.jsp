<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<body>
<h1 style="text-align: center">PRODUCT PURCHASE DETAILS</h1>
<table class="table table-bordered">
<thead>
<tr>
<th scope="col">Product Id</th>
<th scope="col">Product name</th>
<th scope="col">Product Catagoty</th>
<th scope="col">Product Price</th>
</tr>
</thead>

<tbody>
<tr class="">
<td>${product.productId}</td>
<td>${product.name}</td>
<td>${product.catagory}</td>
<td>${product.price}</td>

</tr>
</tbody>
</table>
<a href="/getCustomerMenu" class="btn btn-primary" role="button">Back</a>
</body>
</html>