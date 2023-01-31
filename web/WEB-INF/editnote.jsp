<%-- 
    Document   : editnote
    Created on : 31-Jan-2023, 10:05:19 AM
    Author     : Xavier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Editor</title>
    </head>
    <body>
        <h1>Simple Note Editor</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            <p>
                <b>Title:</b>
                <input type="text" name="titleIn" value="${title}">
            </p>
            <p>
                <b>Contents:</b><br>
                <input type="text" name="contentsIn" value="${contents}">
            </p>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
