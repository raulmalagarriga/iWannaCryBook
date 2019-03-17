function $(id) {
	return document.getElementById(id);
}

var option;

function UpText(){
	option = 1;
	doFetch();
}
function UpImage(){
	option = 2;
	doFecth();
}
function UpVideo(){
	option = 3;
	doFetch();
}
function dofetch(){
	var formData = new FormData();
	switch(option){
	case 1:
		formData.append("option", option);
		formData.append("upTextText", $("upTextText").value);
		break;
	case 2:
		formData.append("option", option);
		if($("upImageText").value.trim != null || $("upImageText").value.trim != ""){
			formData.append("upImageText", $("upImageText").files[0]);
		}
		break;
	case 3:
		formData.append("option", option);
		if($("upVideoText").value.trim != null || $("upVideoText").value.trim != ""){
			formData.append("upVideoText", $("upVideoText").files[0]);
		}
		break;
		default: 
			alert("Error...");
			break;
	};
	let config = {
			method: 'POST',
			body: formData,
			header: {'Content-Type':'multipart/form-data'},
		}
	fetch("./PublicationServlet", config)
		.then(function(response){
			return response.json();
		})
		.then(function(data){
			console.log(data);
			if(data.status == 200){
				alert(data.message);
				window.location.reload();
			}
		})
}

$("button1").addEventListener("click", UpText);
$("button2").addEventListener("click", UpImage);
$("button3").addEventListener("click", UpVideo);

