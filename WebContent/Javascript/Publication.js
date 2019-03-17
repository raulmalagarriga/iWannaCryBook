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
		
		break;
	case 2:
		break;
	case 3:
		break;

	}
}
