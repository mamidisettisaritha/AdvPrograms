function converttorupees()
{
	const dollar=document.getElementById("dollar").value;
	
	const rupees=(parseFloat(dollar)*82.89);
	
	document.getElementById('rupeesOutput').value=rupees.toFixed(2);
}