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
	<div id="titulo">
	<p id="letra1">BBVA</p>
	<p id="letra2">Continental</p>
	</div>
	  <form name="calculator" class="numeral">
    
    <br>
    <input type="button" value="1" onClick="document.calculator.ans.value+='1'">
    <input type="button" value="2" onClick="document.calculator.ans.value+='2'">
    <input type="button" value="3" onClick="document.calculator.ans.value+='3'">
    <br>
    <input type="button" value="4" onClick="document.calculator.ans.value+='4'">
    <input type="button" value="5" onClick="document.calculator.ans.value+='5'">
    <input type="button" value="6" onClick="document.calculator.ans.value+='6'">
    <br>
    <input type="button" value="7" onClick="document.calculator.ans.value+='7'">
    <input type="button" value="8" onClick="document.calculator.ans.value+='8'">
    <input type="button" value="9" onClick="document.calculator.ans.value+='9'">
    <br>
    <input type="button" value=" " onClick="document.calculator.ans.value+='7'">
    <input type="button" value=" " onClick="document.calculator.ans.value+='8'">
    <input type="button" id="aceptar" value="DO" onClick="document.calculator.ans.value+='9'">
    <br>
    </form>
    <div id="p1">
    Digita tu clave secreta, 
    </div>
    <div id="p2">
    por favor.
    </div>
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


</body>
</html>