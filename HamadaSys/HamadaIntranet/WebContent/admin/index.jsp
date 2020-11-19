<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hamada E-commerce Admin</title>
</head>
<body>
	<jsp:directive.include file="header.jsp" />
	<div align="center">
		<h2>Painel Administrativo</h2>
	</div>
	
	<div align="center">
	<hr width="60%"/>
		<h2>Ações Rápidas:</h2>
		<a href="create_product">Novo Produto</a> &nbsp;
		<a href="create_category">Nova Categoria</a> &nbsp;
		<a href="create_user">Novo Usuário</a> &nbsp;
		<a href="create_customer">Novo Cliente</a> &nbsp;
		
	</div>
	
	<div align="center">
	<hr width="60%"/>
		<h2>Pedidos Recentes:</h2>
	</div>
	
	<div align="center">
	<hr width="60%"/>
		<h2>Avaliações Recentes:</h2>
	</div>
	
	<div align="center">
	<hr width="60%"/>
		<h2>Estatisticas:</h2>
	</div>
	
	
	<jsp:directive.include file="footer.jsp" />
</body>
</html>