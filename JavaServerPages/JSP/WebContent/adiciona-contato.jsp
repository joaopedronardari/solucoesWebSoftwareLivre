<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="jp" %>
<c:import url="cabecalho.jsp" />
<form action="mvc" method="POST">
	Nome:<input type="text" name="nome"/><br/>
	E-mail:<input type="text" name="email"/><br/>
	Endereço:<input type="text" name="endereco"/><br/>
	Data Nascimento:<jp:campoData id="dataNascimento"/><br/>
	<input type="hidden" name="logica" value="AdicionaContato"/>
	<input type="submit" value="Gravar">
</form>
<c:import url="rodape.jsp" />