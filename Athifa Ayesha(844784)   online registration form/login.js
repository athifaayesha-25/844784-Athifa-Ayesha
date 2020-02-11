function validate()
{
  
   
    var name= document.form.name.value;
    var pass=document.form.password.value;
    
        if(name==null||name=="")
        {
        alert("Name cant be empty");
        return false;
        }
      else if(pass.length<8)
      {
      alert("password must be atleast 8 characters long.");
      return false;
      }
   
    
   
    
}