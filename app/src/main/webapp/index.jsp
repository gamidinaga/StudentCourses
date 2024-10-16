<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOC TYPE html>
<html>
<head>
    <title>Student_App Home</title>
</head>
<body>
    <h1>Welcome to Student_App</h1>
    <p>
        <a href="hello">Say Hello without Parameter</a>
    </p>
    <h2>Say Hello with Your Name</h2>
    <form action="hello" method="get">
        <label for="user">Enter your name:</label>
        <input type="text" id="user" name="user" required>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
