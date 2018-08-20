<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/estilos.css" type="text/css"></link>
</head>
<body>
<div id="cuerpo">
<form action="menuc">

	<div id="titulo">
	<p id="letra1">BBVA</p>
	<p id="letra2">Continental</p>
	</div >
	  
    <div class="numeral">
    <br>
    <input type="button" value="1" id="n1">
    <input type="button" value="2" id="n2">
    <input type="button" value="3" id="n3">
    <br>
    <input type="button" value="4"id="n4">
    <input type="button" value="5" id="n5">
    <input type="button" value="6" id="n6">
    <br>
    <input type="button" value="7" id="n7">
    <input type="button" value="8" id="n8">
    <input type="button" value="9" id="n9">
    <br>
    <input type="button" value=" " >
    <input type="button" value=" " >
    <input type="submit" id="aceptar" value="DO" >
    <br>
    </div>
    
    <div id="p1">
    Digita tu clave secreta, 
    </div>
    <div id="p2">
    por favor.
    </div>
    
    <div >
     <input id="ans" name="cc">
    </div>
   </form>
</div>
<div id="tirasuperior">
	<div id="t1">
	</div>
	<div id="t2">
	</div >
	<div id="t3">
	</div>
	<div id="t4">
	</div>
	<div id="t5">
	</div>
	<div id="t6">
	</div>
</div>

<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
</body>
</html>