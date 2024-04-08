<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.interview.model.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Salary and Attendance</title>

<style type="text/css">
body {
    background-color: #f8f9fa;
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

.container {
    max-width: 800px;
    margin: 50px auto;
    padding: 20px;
    background-color: #fff;
    border: 1px solid #ccc;
    border-radius: 5px;
}

h1 {
    color: #007bff;
    font-weight: bold;
    font-style: italic;
    text-align: center;
}

.form-container {
    background-color: #f2f2f2;
    padding: 20px;
    border-radius: 5px;
}

label {
    display: block;
    font-weight: bold;
}

input[type="number"],
select {
    width: calc(100% - 12px);
    padding: 6px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
}

input[type="submit"],
input[type="reset"] {
    background-color: #007bff;
    color: #fff;
    border: none;
    padding: 10px 20px;
    margin-top: 10px;
    cursor: pointer;
    border-radius: 4px;
}

input[type="submit"]:hover,
input[type="reset"]:hover {
    background-color: #0056b3;
}

.message {
    color: green;
    text-align: center;
    font-weight: bold;
}
</style>

<script type="text/javascript">
function calculate() {
    var gross = document.getElementById("gross").value;
    var basic = gross * 0.6;
    var HRA = basic * 0.4;
    var va = gross - basic - HRA;

    document.getElementById("basic").value = basic;
    document.getElementById("HRA").value = HRA;
    document.getElementById("va").value = va;
    document.getElementById("total").value = (parseFloat(gross) + basic + HRA).toFixed(2);
}
</script>
</head>
<body>

<div class="container">
    <h1>Calculate Employee Salary</h1>
    <div class="form-container">
        <form action="/saveSalary" method="post">
            <label for="employeeId">Select the Employee</label>
            <select id="employeeId" name="employeeId">
                <%
                List<Employee> employeeList = (List<Employee>) request.getAttribute("employeeList");
                for(Employee employee: employeeList){
                %>
                <option value="<%= employee.getEmployeeId()%>"><%=employee.getEmployeeName() %></option>
                <% } %>
            </select><br>
            <label for="gross">Gross</label>
            <input type="number" name="gross" id="gross" onblur="return calculate();" /><br>

            <label for="basic">Basic</label>
            <input type="number" name="basic" id="basic" /><br>

            <label for="HRA">HRA</label>
            <input type="number" name="HRA" id="HRA" /><br>

            <label for="va">Variable Allowance</label>
            <input type="number" name="va" id="va" /><br>

            <label for="total">Total</label>
            <input type="number" name="total" id="total" /><br>

            <input type="submit" value="Calculate" />
        </form>
        <p class="message">Successfully saved</p>
    </div>

    <h1>Employee Attendance</h1>
    <div class="form-container">
        <form action="/saveAttendance" method="post">
            <label for="employeeId">Select Employee</label>
            <select id="employeeId" name="employeeId">
                <% for(Employee e : employeeList) { %>
                <option value="<%= e.getEmployeeId()%>"><%=e.getEmployeeName() %></option>
                <% } %>
            </select><br>
            <label for="perDays">Per Days</label>
            <input type="number" id="perDays" name="perDays"><br>
            <input type="submit" value="Enter">
            <input type="reset" value="Clear">
        </form>
        <p class="message">Successfully saved</p>
    </div>

    <a href="/showinfo"><h4 style="color: orange;">Show Info</h4></a><br>
    <a href="/showexcel"><h4 style="color: orange;">Show Excel</h4></a>
</div>

</body>
</html>
