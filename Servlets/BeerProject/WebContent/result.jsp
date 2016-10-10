<%-- 
    Document   : result
    Created on : 29/08/2016, 12:12:03
    Author     : a9887994
--%>

<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <body>
        <h1 align="center">Beer Recommendations JSP</h1>
        <p>
            <% 
            List styles = (List)request.getAttribute("styles");
            Iterator it = styles.iterator();
            while(it.hasNext()){
                out.print("<br>try:" + it.next());
            }
            %>
    </body>
</html>
