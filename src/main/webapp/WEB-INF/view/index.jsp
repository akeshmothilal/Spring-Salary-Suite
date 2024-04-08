<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
body {
    background-color: #f2f2f2;
}

#form {
    background-color: #fff;
    border: 1px solid #ccc;
    border-radius: 5px;
    padding: 20px;
    margin-top: 50px;
    max-width: 400px;
    margin-left: auto;
    margin-right: auto;
}

.error-message {
    color: red;
    font-weight: bold;
}

.btn-register {
    background-color: #007bff;
    color: #fff;
    border: none;
    cursor: pointer;
}

.btn-register:hover {
    background-color: #0056b3;
}
</style>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div id="form">
                <form action="/userLogin" method="post">
                    <div class="form-group">
                        <label for="userName">User Name:</label>
                        <input type="text" class="form-control" name="userName" id="userName">
                    </div>
                    <div class="form-group">
                        <label for="userPassword">Password:</label>
                        <input type="password" class="form-control" name="userPassword" id="userPassword">
                    </div>
                    <input type="submit" class="btn btn-register" value="Login">
                </form>
                <p class="error-message">${message}</p>
                <a href="/showUserRegistration">Register as a User</a><br>
                <a href="/showEmployeeRegistration">Register as an Employee</a>
            </div>
        </div>
    </div>
</div>
<!-- Bootstrap JS -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
