<%-- 
    Document   : index
    Created on : 29/08/2016, 12:03:18
    Author     : a9887994
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1 align='center'>Beer Selection Page</h1>
       <%-- Report any errors (if any) --%>
        <html:errors />
        <form action="SelectBeer" method="POST"
                   focus="color">
            <p>Select beer characteristics</p>
            Color:
                <select name="color">
                  <option value="light"> light </option>
                  <option value="amber"> amber </option>
                  <option value="brown"> brown </option>
                  <option value="dark"> dark </option>
                  <option value="red"> red </option>
                </select>
              <br/><br/>

                <center>
                    <input type="submit" />
                </center>

        </form>
    </body>
</html>