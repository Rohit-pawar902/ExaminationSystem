function pass()
{
	x=document.getElementById('p1').value;
        
	a=x.length;
        if(a==0){document.getElementById('s1').innerHTML="";
        }
	else if(a<4)
	{
		document.getElementById('s1').innerHTML="Strength : weak";
		document.getElementById('s1').style.color="red";
		if(a==0)
		{
		document.getElementById('s1').innerHTML="";
		}
	}
	else if(a<8)
	{
		document.getElementById('s1').innerHTML="Strength : good";
		document.getElementById('s1').style.color="yellow";
	}
	else
	{
		document.getElementById('s1').innerHTML="Strength : Strong";
		document.getElementById('s1').style.color="green";
	}
}
function match()
{
	x=document.getElementById('p1').value;
	y=document.getElementById('p2').value;
        z1=x.length;
	z2=y.length;
	if(y==x&&z1==z2)
	{
		document.getElementById('s2').innerHTML="Password Matched";
		document.getElementById('s2').style.color="green";
		if(z1==0&&z2==0)
		{
		document.getElementById('s2').innerHTML="";
		}
	}
	else
	{
		document.getElementById('s2').innerHTML="Password do not Match";
		document.getElementById('s2').style.color="red";
	}
}
function name2()
{
	x6=document.getElementById('name').value;
	var re1=/^\w{4,15}/;
	if(!re1.test(x6))
	{
document.getElementById('name1').innerHTML="Name should not be less than 4 Letters";
		document.getElementById('name1').style.color="yellow";
	}
	else
	{
		document.getElementById('name1').innerHTML="";		
	}
}
function contact2()
{
	var re2=/^\d{10}$/;
	contact=document.getElementById('CN1').value;
	if(!re2.test(contact))
	{
		document.getElementById('CN2').innerHTML="Invalid Contact";
		document.getElementById('CN2').style.color="yellow";
	}
	else{
		document.getElementById('CN2').innerHTML="";
	}
}
function mail2()
{
	m=document.getElementById('E1').value;
	var e=/\w{3,20}\@\w{5}\.\w{3}/;
        if(m.length<4){
            document.getElementById('E2').innerHTML="";
        }
        else if(!e.test(m))
	{
		document.getElementById('E2').innerHTML="Invalid Email";
		document.getElementById('E2').style.color="red";
	}
	else{
		document.getElementById('E2').innerHTML="";
	}
}