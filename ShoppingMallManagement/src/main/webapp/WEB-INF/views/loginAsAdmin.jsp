<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="ISO-8859-1">
<title>login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<body>
<form action="/getAdminMenu"method="post" name="registration">
<div class="col-md-4 offset-md-4 form-div">
<h3>Login</h3>
<div [hidden]="submitted" style="width: 400px;">
    <div class="form-group">
      <label for="email">Email</label>
      <input  type="text" class="form-control" name="email" value=''>
    </div>

    <div class="form-group">
      <label for="password">Password</label>
      <input  type="password" class="form-control"  name="password" required>
    </div>

    <button type="submit" class="btn btn-success" name="submit">Submit</button>
    <div class="col-md-4 offset-md-4 form-div">
    <div class="form-group">
      <label for="name">Dont have an account</label>
      <a href="/signInAdmin">sign in </a>
    </div>
  </form>
  
</body>
</html>