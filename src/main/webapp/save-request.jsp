<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Подача заявки</title>
</head>
<body>
<h2>Форма подачи заявки</h2>
<form action="save-request.jsp" method="post">
    <label for="firstName">Введите имя:</label>
    <input type="text" id="firstName" name="firstName" required pattern="[A-Za-zА-Яа-яЁё]{3,30}"/>

    <label for="lastName">Введите фамилию:</label>
    <input type="text" id="lastName" name="lastName" required pattern="[A-Za-zА-Яа-яЁё]{3,30}"/>

    <label for="age">Введите возраст:</label>
    <input type="number" id="age" name="age" min="3" max="150" required>

    <input type="submit" value="Отправить" />
    <%
        request.setCharacterEncoding("UTF-8");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");

        if (firstName != null && lastName != null && age != null) {
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
            request.setAttribute("age", age);

            request.getRequestDispatcher("form-success.jsp").forward(request, response);
        } else{
            out.println("Заполните форму");
        }
    %>
</form>
</body>
</html>
