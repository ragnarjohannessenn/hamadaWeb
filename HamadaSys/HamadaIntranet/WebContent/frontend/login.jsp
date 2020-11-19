<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HAMADA E-commerce - Login</title>
</head>
<body>
	<jsp:directive.include file="header.jsp" />
	
	<div align="center">
		<h1>Por favor faça login</h1>
		<form>
			E-mail:<input type="text" size="10"><br/>
			Senha:<input type="password" size="10"/>
			<input type="submit" value="Entrar"/>
		</form>
	</div>
	
	<jsp:directive.include file="footer.jsp" />
</body>
</html>