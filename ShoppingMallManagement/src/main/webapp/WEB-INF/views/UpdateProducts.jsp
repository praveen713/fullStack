<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Price</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<body>
<div class="row" style="padding-top:50px">
<div class="col-md-3"></div>
<div class="col-md-6">
<div class="container">
<h2>Update Price</h2>
<form action="/updatedPrice" method="put" name="registration">
<div class="form-group">
<label for="employeeName"> Product Name</label> <input type="text"
class="form-control" id="productName" name="name"
value="${product.name}" readonly="readonly">
</div>
<div class="form-group">
<label for="Age"> Product Catagory</label> <input type="text"
class="form-control" id="employeeAge" name="employeeAge"
value="${product.catagory}" readonly="readonly">
</div>
<div class="form-group">
<label for="price">Price</label> <input type="number"
class="form-control" id="price" name="price">
</div><br>
<button type="submit" class="btn btn-primary"  onclick="alert('updated successfully!')">Submit</button>
<a href="/home" class="btn btn-primary" role="button">Back</a>
</form>
</div>
</div>
</div>
</body>
</html>