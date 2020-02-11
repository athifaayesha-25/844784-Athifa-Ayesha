   
import java.util.ArrayList;
import java.util.Collections;  

public class ListManager1{
  public static void main(String[] args) {
    ArrayList<String> vegetables = new ArrayList<String>();
    vegetables.add("carrot");
    vegetables.add("cucumber");
    vegetables.add("potato");
    vegetables.add("ladies finger");
    Collections.sort(vegetables);  
    for (String i : vegetables) {
      System.out.println(i);
    }
  }
}