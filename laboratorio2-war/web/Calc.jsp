<%-- 
    Document   : Calc
    Created on : 14/03/2022, 04:01:37 PM
    Author     : juanc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="CalcServlet" method="POST">
            <h1>Escriba los valores para la operación requerida</h1>
            
            <p>Primer valor:</p>
            <input type="text" name="valorA" />
            
            <p>Segundo valor:</p>
            <input type="text" name="valorB" />
            <br/><br/>
            
            <select name="operacion" size="6">
                <option value="Sumar">Sumar</option>
                <option value="Restar">Restar</option>
                <option value="Dividir">Dividir</option>
                <option value="Multiplicar">Multiplicar</option>
                <option value="Modulo">Modulo</option>
                <option value="Potencia">Potencia</option>
            </select>
            <br/><br/>
            <input type="submit" value="OK" />
        </form>
    </body>
</html>
