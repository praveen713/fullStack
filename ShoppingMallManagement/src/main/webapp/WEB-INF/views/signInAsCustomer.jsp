<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="ISO-8859-1">
<title>Sign In User</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<body>
<form action="addCustomer" method="post" name="registration">
<div class="col-md-4 offset-md-4 form-div">
<h3>Sign In User</h3>
<div [hidden]="submitted" style="width: 400px;">
    <div class="form-group">
      <label for="name">Customer Name</label>
      <input  type="text" class="form-control" name="name" required>
    </div>
    
     <div class="form-group">
      <label for="email">Email</label>
      <input  type="email" class="form-control"  name="email" required>
    </div>
    
    <div class="form-group">
      <label for="password">Password</label>
      <input  type="password" class="form-control"  name="password" required>
    </div>
    
     <div class="form-group">
      <label for="address">Address</label>
      <input  type="address" class="form-control"  name="address" required>
    </div>

   
    <button type="submit" class="btn btn-success" onclick="alert('signIn successfully!')">Submit</button>
    <div class="col-md-4 offset-md-4 form-div">
  </form>
</body>
</html>