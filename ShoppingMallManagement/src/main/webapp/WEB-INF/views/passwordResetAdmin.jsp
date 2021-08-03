<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta  charset="ISO-8859-1">
<title>change password</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<body>
<h1 style="text-align: center">CHANGE PASSWORD</h1>
<form action="/updatePassword" method="put" name="registration">
<div class="col-md-4 offset-md-4 form-div">
<div class="form-group">
<label for="name">Admin Name</label> 
 <input  type="text" class="form-control"  name="adminName" required>
</div>
<div class="form-group">
      <label for="password">Password</label>
      <input  type="password" class="form-control"  name="password" required>
    </div><br>
<button type="submit" class="btn btn-primary">Change</button>
<a href="/getAdminMenu" class="btn btn-primary" role="button">Back</a>
<div class="col-md-4 offset-md-4 form-div">
</form>
</body>
</html>