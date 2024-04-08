<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
    p {
        color: red;
        font-weight: bold;
    }

    /* Adjust form border and position */
    form {
        border: 1px solid #ccc;
        border-radius: 8px;
        padding: 20px;
        max-width: 400px;
        margin: 50px auto; /* Center the form */
    }
</style>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h2 class="text-center">User Registration</h2>
            <form action="/userRegister" method="post">
                <div class="form-group">
                    <label for="userName">User Name:</label>
                    <input type="text" class="form-control" id="userName" name="userName">
                </div>
                <div class="form-group">
                    <label for="userPassword">Password:</label>
                    <input type="password" class="form-control" id="userPassword" name="userPassword">
                </div>
                <div class="form-group">
                    <label for="mobileNo">Mobile No:</label>
                    <input type="number" class="form-control" id="mobileNo" name="mobileNo">
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" class="form-control" id="email" name="email">
                </div>
                <button type="submit" class="btn btn-primary">Register</button>
                <button type="reset" class="btn btn-secondary">Clear</button>
            </form>
        </div>
    </div>
</div>
<!-- Bootstrap JS -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
