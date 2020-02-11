import java.util.*;
class Rectangle{
int length,height;
public void setLength(int length)
{
this.length=length;
}
public void setHeight(int height)
{
this.height=height;
}
public int getLength()
{
return this.length;
}
public int getHeight()
{
return this.height;
}
 public double areaRec(){
      double area=length*height;
      return area;
     }
public static void main(String[] args)
{
 Rectangle rect=new  Rectangle();
rect.setLength(20);
rect.setHeight(30);
double areaRec=rect.areaRec();
System.out.println("Area of rectangle :"+areaRec);
}
}
