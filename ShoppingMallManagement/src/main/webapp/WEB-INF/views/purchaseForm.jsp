<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchase product</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<body>
<div class="col-md-4 offset-md-4 form-div">
    <h3>Enter Billing details</h3>
	<form action="/insertPurchase" method="put" name="registration">
				<div class="form-group">
					<label for="email">Customer email to get bill</label> <input type="email"
						id="email" class="form-control" name="email">
				</div>
				<br>
				<div class="form-group">
				<button type="submit" class="btn btn-primary">Buy Now</button>
				<a href="/productListCustomer" class="btn btn-primary" role="button">Back</a>
				<div>
	</form>
	</div>
	
</body>
</html>