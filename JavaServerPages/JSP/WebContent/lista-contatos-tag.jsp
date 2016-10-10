<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" 
           uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:import url="cabecalho.jsp"></c:import>
<jsp:useBean id="dao" class="DAO.ContatoDAO"></jsp:useBean>
<table>
	<thead>
		<td>id</td>
		<td>Nome</td>
		<td>Email</td>
		<td>Endereco</td>
		<td>Data de Nascimento</td>
	</thead>
	<c:forEach var="contato" items="${dao.lista}" varStatus="id">
		<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff'}">
			<td>${id.count}</td>
			<td>${contato.nome}</td>
			<td>
				<c:choose>
					<c:when test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:when>
					<c:otherwise>
						E-mail não informado
					</c:otherwise>
				</c:choose>
			</td>
			<td>${contato.endereco}</td>
			<td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/></td>
		</tr>
	</c:forEach>
	
</table>
<c:import url="rodape.jsp"></c:import>