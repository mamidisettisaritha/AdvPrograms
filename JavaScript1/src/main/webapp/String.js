function stringtoReversestring()
{
	const stringIn=document.getElementById("string").value;
	var stringOut="";
	for(let i=stringIn.lenght-1;i>=0;i--)
	{
		stringOut+=stringIn[i]
	}
	
	document.getElementById('Stringout').value=stringOut;
}