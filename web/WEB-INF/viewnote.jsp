<%-- 
    Document   : viewnote
    Created on : 31-Jan-2023, 10:05:09 AM
    Author     : Xavier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p>
            <b>Title:</b>${title}
        </p>
        <p>
            <b>Contents:</b><br>
            ${contents}
        </p>
        <a href="note?edit">Edit</a>
    </body>
</html>