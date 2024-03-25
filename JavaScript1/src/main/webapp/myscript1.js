function converttocelsius()
{
	//Read the fahrenheit input store in variable
	const fahrenheitInput=document.getElementById("fahreheitInput").value;
	//convert the fahrenheit input to celsius
	const celsiusTemperature=(parseFloat(fahrenheitInput)-32)*5/9;
	//set the utput to celsiusoutput field
	document.getElementById(celsiusOutput).value=celsiusTemperature.toFixed(2);
}


