$(document).ready(function (){
	
  
});
$("#depositointerno").keyup(function(){
	
});
$("#botondepositointerno").click(function(){
	var n = $("#depositointerno").val();
	var id=$("#idcliente").val()
	if(n>0){
		$.get("mic",{"opt":1,"tipo":"deposito","cant":n,"idcli":id},function(data){
			if(data>0){
				
					document.location.href="realizado.jsp";
				
			}else{
				
			}
		});
	}else{
		
	}
});

$("#retiroboton").click(function(){
	var n = $("#retiroinput").val();
	var id=$("#idclienteretiro").val()
	if(n>0){
		$.get("mic",{"opt":1,"tipo":"retiro","cant":n,"idcli":id},function(data){
			if(data>0){
				
					document.location.href="retirofinalizado.jsp";
				
			}else{
				
			}
		});
	}else{
		
	}
});
$("#confirmartransferencia").click(function(){
	var n = $("#montotransferencia").val();
	var c = $("#cuentatransferencia").val();
	var id=$("#idclientetrans").val()
	alert(n+" "+c+" "+id);
	if(n>0){
		$.get("clientec",{"opt":1,"cuenta":c},function(data){
			alert(data);
			var x = JSON.parse(data);
			console.log(data);
			var tt=x.idcliente;
			alert("idcliente2 "+tt);
			$.get("mec",{"opt":1,"cant":n,"idcli1":id,"idcli2":tt},function(data){
				
					
				if(data>0){
					
						document.location.href="depositofinalizada.jsp";
					
				}
			});
			
		});
	}else{
		
	}
});