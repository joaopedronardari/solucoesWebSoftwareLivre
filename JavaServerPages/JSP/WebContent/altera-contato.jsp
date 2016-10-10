<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="jp"%>
<c:import url="cabecalho.jsp"/>
<h2>Formulário para alterar contatos</h2>
<form action="mvc" method="POST">
	Id: <input type="text" name="id"/>
	Nome: <input type="text" name="nome"/>
	Email: <input type="text" name="email"/>
	Endereco: <input type="text" name="endereco"/>
	Data de Nascimento: <jp:campoData id="dataNascimento"/>
	<input type="hidden" name="logica" value="AlteraContatoLogic"/>
	<input type="submit" value="Enviar"/>
</form>
<c:import url="rodape.jsp"/>