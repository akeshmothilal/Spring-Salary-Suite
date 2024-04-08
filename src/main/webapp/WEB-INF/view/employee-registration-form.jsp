<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Registration</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding: 20px;
        }

        h1 {
            color: #007bff;
            font-weight: bold;
            font-style: italic;
        }

        #message {
            color: green;
            font-weight: bold;
        }

        /* Adjust form elements */
        .form-control {
            margin-bottom: 10px;
        }

        /* Style submit button */
        .btn-register {
            background-color: #28a745;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
        }

        .btn-register:hover {
            background-color: #218838;
        }

        /* Add border to form */
        .custom-border {
            border: 1px solid #ccc; /* Set border color and style */
            border-radius: 5px; /* Add some border radius for a rounded look */
            padding: 20px; /* Add padding inside the border */
            background-color: #fff; /* Set background color for the form */
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="text-center mb-4">
                    <h1>Employee Registration</h1>
                </div>
                <form action="/employeeRegister" method="post" class="custom-border">
                    <div class="form-group">
                        <input type="text" class="form-control" name="employeeName" id="employeeName" placeholder="Enter User Name">
                    </div>

                    <div class="form-group">
                        <label>Gender:</label>
                        <div class="form-check">
                            <input type="radio" class="form-check-input" name="gender" id="male" value="male">
                            <label class="form-check-label" for="male">Male</label>
                        </div>
                        <div class="form-check">
                            <input type="radio" class="form-check-input" name="gender" id="female" value="female">
                            <label class="form-check-label" for="female">Female</label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Designation:</label>
                        <div class="form-check">
                            <input type="radio" class="form-check-input" name="designation" id="javaDeveloper" value="Java Developer">
                            <label class="form-check-label" for="javaDeveloper">Java Developer</label>
                        </div>
                        <div class="form-check">
                            <input type="radio" class="form-check-input" name="designation" id="phpDeveloper" value="Php Developer">
                            <label class="form-check-label" for="phpDeveloper">Php Developer</label>
                        </div>
                        <div class="form-check">
                            <input type="radio" class="form-check-input" name="designation" id="webDeveloper" value="Web Developer">
                            <label class="form-check-label" for="webDeveloper">Web Developer</label>
                        </div>
                    </div>

                    <div class="form-group">
                        <input type="number" class="form-control" name="mobileNo" id="mobileNo" placeholder="Enter Mobile No">
                    </div>

                    <div class="form-group">
                        <input type="email" class="form-control" name="email" id="email" placeholder="Enter Email">
                    </div>

                    <button type="submit" class="btn btn-register">Register</button>
                </form>
                <div class="text-center mt-3">
                    <p id="message">${message}</p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
