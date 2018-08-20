$(document).ready(function () {
    LisMovi();
});

var x,y,z;

// Movimiento Externo
$.get("mec", {"opc": 4}, function (data) {
     x = JSON.parse(data);
 return x;
});
$.get("Pc", {"opc": 4}, function (data) {
    y = JSON.parse(data);
return y;
});

function LisMovi() {
    $.get("Pc", {"opc": 4}, function (data) {
    	  z = JSON.parse(data);
    	  x,y;
        $("#tablaMovi tbody tr td").remove();
        for (var i = 0; i < x.length; i++) {
            $("#tablaMovi").append("<tr><td>" + (i + 1) + "</td><td>" + x[i].nomProd + "</td><td>" + x[i].codigo + "</td><td>" + e + "</td><td>" + x[i].nomTipo + "</td><td style='text-align:center'>" + x[i].stock + "</td>\n\
            <td><a href='#' id='bt"+x[i].idProducto+"' class='material-icons' style='background:none;border:none; color:lightblue' onclick='productoSeleccionado("+x[i].idProducto+")'>check_circle</a></td></tr>");       
        }
    });
}
function imprimir(){
	windows.print();
}