<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Insert title here</title>
<style>
* {
	margin: 0px;
	padding: 0px;
}

body {
	width: 100%;
	height: 726px;
	position: relative;
	float: left;
	background: #F0F3F4;
	-webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 8), 0 0 40px
		rgba(0, 0, 0, 0.5) inset;
	-moz-box-shadow: 0 1px 4px rgba(0, 0, 0, 8), 0 0 40px rgba(0, 0, 0, 0.5)
		inset;
	box-shadow: 0 5px 4px rgba(0, 0, 0, 8), 0 0 40px rgba(0, 0, 0, 0.5)
		inset;
}

#tirasuperior {
	width: 5%;
	background: red;
}

#t1 {
	float: left;
	width: 52px;
	height: 60px;
	background: #2061CE;
}

#t2 {
	float: left;
	width: 52px;
	height: 60px;
	background: #406EC0;
}

#t3 {
	float: left;
	width: 52px;
	height: 60px;
	background: #3AAACF;
}

#t4 {
	float: left;
	width: 52px;
	height: 60px;
	background: #4DB6E5;
}

#t5 {
	float: left;
	width: 52px;
	height: 60px;
	background: #61C4F1;
}

#t6 {
	float: left;
	width: 52px;
	height: 60px;
	background: #96D7F3;
}

#cuerpo {
	width: 95%;
	height: 100px;
	float: right;
}

#titulo {
	width: 40%;
	height: 150px;
}

#letra1 {
	width: 10%;
	height: 2px;
	margin-top: 7%;
	margin-left: 5%;
	font-size: 65px;
	font-weight: bold;
	color: #1253C1;
}

#letra2 {
	margin-left: 42%;
	font-size: 60px;
	color: #1253C1;
}

#cuerpito {
	width: 95%;
	height: 500px;
}

#retroceder {
	width: 250px;
	height: 80px;
	float: left;
	margin-top: 180px;
	background: red;
	font-weight: 600;
	font-size: 40px;
	padding-bottom: 25px;
	color: #ffffff;
	background-color: #1883ba;
	border-radius: 6px;
	text-align: center;
	box-sizing: border-box;
	text-transform: capitalize;
}

#imprimir {
	width: 250px;
	height: 80px;
	float: right;
	margin-top: 180px;
	background: red;
	font-weight: 600;
	font-size: 40px;
	padding-bottom: 25px;
	color: #ffffff;
	background-color: #1883ba;
	border-radius: 6px;
	text-align: center;
	box-sizing: border-box;
	text-transform: capitalize;
}

#retroceder:hover, #imprimir:hover {
	background: rgba(0, 0, 0, 0);
	color: #3a7999;
	box-shadow: inset 0 0 0 3px #3a7999;
}

#saldo {
	width: 25%;
	height: 50px;
	margin-left: 20%;
	outline: none;
	border: 0;
	border-radius: 5px;
	border: 1px solid #39c;
	font-size: 38px;
	color: #41A2DB;
}

#letra {
	text-align: center;
	width: 10%;
	height: 50px;
	margin-left: 5%;
	font-size: 40px;
	color: #41A2DB;
}
</style>
</head>
<body>
	<div id="cuerpo">
		<div id="titulo">
			<p id="letra1">BBVA</p>
			<p id="letra2">Continental</p>
		</div>
		<div id="cuerpito">
			<h1 id="letra">Movimientos:</h1>
			<table id="tablaMovi" class="table table-dark">
				<tbody>	
					<tr>
						<th scope="row">Nombres:</th>
						<td></td>
					</tr>
					<tr>
						<th scope="row">Movimientos:</th>
						<td></td>
					</tr>
					<tr>
						<th scope="row">Saldo:</th>
						<td></td>
					</tr>
				</tbody>
			</table>
			<button id="retroceder">Retroceder</button>
			<button id="imprimir">Imprimir</button>
		</div>
	</div>
	<div id="tirasuperior">
		<div id="t1"></div>
		<div id="t2"></div>
		<div id="t3"></div>
		<div id="t4"></div>
		<div id="t5"></div>
		<div id="t6"></div>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>