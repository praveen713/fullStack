<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="ISO-8859-1">
<title>add products</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>

<form action="insertProduct" method="post" name="registration">
<div class="col-md-4 offset-md-4 form-div">
<h3>Create product</h3>
<div [hidden]="submitted" style="width: 400px;">
    <div class="form-group">
      <label for="name">Product Name</label>
      <input  type="text" class="form-control" name="name" required>
    </div>

    <div class="form-group">
      <label for="catagory">Catagory</label>
      <input  type="text" class="form-control"  name="catagory" required>
    </div>

    <div class="form-group">
      <label for="price">Price</label>
      <input  type="number" class="form-control" name="price" required>
    </div><br>

    <button type="submit"  class="btn btn-primary" onclick="alert('submitted successfully!')">Submit</button>
  <a href="/manageProducts" class="btn btn-primary" role="button">Back</a>
  <div class="col-md-4 offset-md-4 form-div">
  </form>
</body>

</html>