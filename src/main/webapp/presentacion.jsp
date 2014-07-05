<%-- 
    Document   : presentacion
    Created on : 4/07/2014, 08:21:32 PM
    Author     : T107
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado de Calificaciones</h1>
        
        <form action="/resultados" method="get">
            <p>Nombre</p>
            <input type="text" name="Nombre"/>
            <input type="submit" value="Obtener Calificacion">
        </form>
    </body>
</html>
