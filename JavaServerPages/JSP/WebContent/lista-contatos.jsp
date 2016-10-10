<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, DAO.*, model.*, factory.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
	<table>
		<thead>
			<td>Nome</td>
			<td>Email</td>
			<td>Endereco</td>
			<td>Data de Nascimento</td>
		</thead>
		<%
			ContatoDAO dao = new ContatoDAO();
			List<Contato> contatos = dao.getLista();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			for (Contato contato : contatos) {
		%>
		<tr>
			<td><%=contato.getNome()%></td>
            <td><%=contato.getEmail()%></td>
            <td><%=contato.getEndereco()%></td>
            <td><%=format.format(contato.getDataNascimento().getTime())%></td>
		</tr>
		<%
			}
		%>
		
	</table>
</body>
</html>