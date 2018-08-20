$(document).ready(function (){
	
  
});
$("#n1").click(function(){
	var m=$("#n1").val();
	var n =$("#ans").val();
	$("#ans").val(n+""+m);
});
$("#n2").click(function(){
	var m=$("#n2").val();
	var n =$("#ans").val();
	$("#ans").val(n+""+m);
});
$("#n3").click(function(){
	var m=$("#n3").val();
	var n =$("#ans").val();
	$("#ans").val(n+""+m);
});
$("#n4").click(function(){
	var m=$("#n4").val();
	var n =$("#ans").val();
	$("#ans").val(n+""+m);
});
$("#n5").click(function(){
	var m=$("#n5").val();
	var n =$("#ans").val();
	$("#ans").val(n+""+m);
});
$("#n6").click(function(){
	var m=$("#n6").val();
	var n =$("#ans").val();
	$("#ans").val(n+""+m);
});
$("#n7").click(function(){
	var m=$("#n7").val();
	var n =$("#ans").val();
	$("#ans").val(n+""+m);
});
$("#n8").click(function(){
	var m=$("#n8").val();
	var n =$("#ans").val();
	$("#ans").val(n+""+m);
});
$("#n9").click(function(){
	var m=$("#n9").val();
	var n =$("#ans").val();
	$("#ans").val(n+""+m);
});
$("#aceptar").click(function(){
	var n =$("#ans").val();
	$.get("menuc",{"op":1,"cc":n},function(data){
		
	});
});
