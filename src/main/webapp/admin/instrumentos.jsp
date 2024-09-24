<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../assets/portada.css">
<link rel="stylesheet" href="../assets/menu.css" />
<title>Portada</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<h1>Instrumentos:</h1>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Tipo</th>
			<th>Marca</th>
			<th>Descripcion</th>
			<th>Gamma</th>
			<th>Precio</th>
			<th>&nbsp;</th>
		</tr>
	<c:forEach items="${info}" var="elemento">
		<tr>
			<td> ${elemento.nombre} </td>
			<td> ${elemento.tipo } </td>
			<td> ${elemento.marca }</td> 
			<td class="description"> ${elemento.desc } </td>
			<td> ${elemento.gamma } </td>
			<td> ${elemento.precio } euros</td> 
			<td class="delete"><a href="ServletBorrarInstrumento?id=${elemento.id}" class="delLink" onclick="return confirm('¿seguro?')">Borrar</a></td> 
		</tr>
	</c:forEach>
</table>
<div class="annadir">
	<a href="registrarNuevoInstrumento.jsp" >Añadir nuevo Instrumento</a>
</div>
</body>
</html>