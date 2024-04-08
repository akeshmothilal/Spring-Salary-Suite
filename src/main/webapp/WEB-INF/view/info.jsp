<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.interview.model.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Info</title>
<!-- Bootstrap CSS Link -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <h2 class="text-center">Employee Info</h2>
    <table class="table table-bordered">
        <thead class="thead-dark">
            <tr>
                <th>EMPLOYEE ID</th>
                <th>EMPLOYEE NAME</th>
                <th>PERDAYS</th>
                <th>GROSS</th>
                <th>BASIC</th>
                <th>HRA</th>
                <th>VA</th>
                <th>TOTAL</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Response> responses = (List<Response>) request.getAttribute("responseList");
                for(Response res : responses) {
            %>
            <tr>
                <td><%= res.getEmployeeId() %></td>
                <td><%= res.getEmployeeName() %></td>
                <td><%= res.getPerDays() %></td>
                <td><%= res.getGross() %></td>
                <td><%= res.getBasic() %></td>
                <td><%= res.getHRA() %></td>
                <td><%= res.getVa() %></td>
                <td><%= res.getTotal() %></td>
            </tr>
            <% } %>
        </tbody>
    </table>
</div>
</body>
</html>
