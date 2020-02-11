function validate()
{
  
   
    var name= document.form.name.value;
    
    var pass1=document.form.password1.value;
     var pass2=document.form.password2.value;
    
        if(name==null||name=="")
        {
        alert("Name cant be empty");
        return false;
        }
        if(pass1.length<7||pass1.length>8)
        {
          alert("Password should have min 7 and max 8 charcters");
          return false;
        }
        if(pass1!=pass2)
        {
          alert("password must be same!");
          return false;
        }
      alert("form submitted successfully");
}