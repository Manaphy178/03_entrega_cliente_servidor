<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Registrar Instrumento</title>
    <link rel="stylesheet" href="assets/registrar.css">
    <link rel="stylesheet" href="../assets/menu.css" />
  </head>
  <body>
  <jsp:include page="menu.jsp"></jsp:include>
    <h1>Introduce los datos del nuevo Instrumento</h1>
    <form action="ServletRegistroInstrumento" method="post" >
      <label for="nombre">Nombre:</label
      ><input type="text" name="nombre" id="nombre" /><br />
      <label for="tipo">Tipo:</label
      ><input type="text" name="tipo" id="tipo" /><br />
      <label for="marca">Marca:</label
      ><input type="text" name="marca" id="marca" /><br />
      <label for="description">Descripcion:</label
      ><textarea
        name="description"
        id="description"
        rows="3"
        cols="12"
      ></textarea
      ><br />

      <label for="gamma">Gamma:</label
      ><select name="gamma" id="gamma">
        <option value="baja">Baja</option>
        <option value="media">Media</option>
        <option value="alta">Alta</option></select
      ><br />
      <label for="precio">Precio</label
      ><input
        type="number"
        name="precio"
        id="precio"
        step="any"
        min="0"
      /><br />
      <input type="submit" value="REGISTRAR NUEVO INSTRUMENTO PARA LA TIENDA" />
    </form>
  </body>
</html>
