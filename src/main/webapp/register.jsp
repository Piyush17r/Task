<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Managment</title>
</head>
<body>
 <h2>Registration Form</h2>
    <form action="registration.jsp" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" required><br><br>

        <label for="contact">Contact:</label>
        <input type="text" name="contact" required><br>`<br>

        <label for="gender">Gender:</label>
        <input type="radio" name="gender" value="male" required> Male
        <input type="radio" name="gender" value="female" required> Female
        <input type="radio" name="gender" value="other" required> Other<br><br>

        <label for="dob">Date of Birth:</label>
        <input type="date" name="dob" required><br><br>

        <label for="address">Address:</label>
        <textarea name="address" rows="4" cols="30" required></textarea><br><br>

        <label for="email">Email:</label>
        <input type="email" name="email" required><br><br>

        <label for="password">Password:</label>
        <input type="password" name="password" required><br><br>

        <input type="submit" value="Register">
    </form>

    <br><br>
    <a href="login.jsp">Already registered? Login here</a>
</body>
</html>