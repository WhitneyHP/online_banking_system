$(function(){
	$("#login").on("click",function(){
		login();
	});
	
	$("#account").keydown(function(e){
		if(e.which == 13)
			login();
	});
	$("#password").keydown(function(e){
		if(e.which == 13)
			login();
	});
})

function login(){
	var location = (window.location+'').split('/');  
	var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
	var account=$("#account").val().trim();
	var password=$("#password").val().trim();
	if(account==null||account==""){
		alert("账号不能为空！");
		$("#account").focus();
		return;
	}
	if(password==null||password==""){
		alert("密码不能为空！");
		$("#password").focus();
		return;
	}
	$.post(basePath + "/admin/doLogin",{
		"account":account,
		"password":password
	},function(response,status,xhr){
		/*if(response.status==1){
			alert(response.reason);
			//location.href=basePath+"/admin/indexHome";
		}else{
			alert(response.reason);
			$("#account").focus();
		}*/
		alert(response.reason);
	});
}

