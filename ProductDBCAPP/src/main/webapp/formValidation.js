function ValidateForm()
{
	//read the form data
	var proId=document.getElementById("proId").value;
	var proName=document.getElementById("proName").value;
	var proPrice=document.getElementById("proPrice").value;
	var proBrand=document.getElementById("proBrand").value;
	var proMadeIn=document.getElementById("proMadeIn").value;
	
	if(proId.trim()===""||proName.trim()===""||proPrice.trim()===""||proBrand.trim()===""||proMadeIn.trim()===""){
	alert("All Fields must be filled out");
	return false;
	}
	
	if(parseFloat(proPrice)<0){
		alert("proPrice must be a non-negative value");
		return false;
		
	}

	
	if(proName.length>50||proBrand.length>50){
		alert("proName and proBrand must be less than 50 characters");
		return false;
		
	}
	//get the mfg & exp dates
	var proMfgDate=document.getElementById("proMfgDate").value;
	var proExpDate=document.getElementById("proExpDate").value;
	
	//convert into date format
	var manufacturingDateObj=new Date(proMfgDate);
	var expiryDateObj=new Date(proExpDate);
	
	//check the validation of date
	if(manufacturingDateObj>expiryDateObj){
	alert("Manufacturing date cannot be greater than Expiry date");
	return false;
	}
	return true;
	
}
ValidateForm();