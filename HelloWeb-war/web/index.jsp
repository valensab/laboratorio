<%-- 
    Document   : index
    Created on : 15/03/2021, 05:28:37 PM
    Author     : Paula Sabogal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>Formulario de Estudiante</h1>
        <form name="name input form" action="response.jsp">
            <label> Escriba su nombre: </label>
            <input type="text" name="name" placeholder="nombre" required/>
            <br>
            <br>
            <label> Digite su fecha de nacimiento: </label>
            <input type="date" name="date" min="1970-01-01" max="2021-03-20" required/>
            <br>
            <br>
            <input type="submit" value="send" />

        </form>
    </body>
</html>
