<%@page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>File Upload TMS Example Servlet - Java web application</title>
</head>
<body>
<div>
    <h3> Choose File to Upload in Server </h3>
    <form action="load-book" method="post" enctype="multipart/form-data">
        <input type="file" name="file"/>
        <input type="submit" value="upload"/>
    </form>
</div>
</body>
</html>
<html>
<head>
    <title>Download Book</title>
</head>

<body>
<div>
    <h3>Download Book from Server</h3>
    <form action="book" method="get">
        <input type="text" name="filename" placeholder="book.txt"/>
        <input type="submit" value="download"/>
    </form>
</div>
</body>
</html>
