import java.util.HashSet; 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
  
public class Stwentytwo 
{ 
    static int countOccurrence(String[] word, String str)  
    { 
        // counter 
        int counter = 0; 
          
        // for extracting words 
        Pattern p = Pattern.compile("[a-zA-Z]+"); 
        Matcher m = p.matcher(str); 
          
        // HashSet for quick check whether 
        //  a word in str present in word[] or not 
        HashSet<String> hs = new HashSet<String>(); 
          
        for (String string : word) { 
            hs.add(string); 
        } 
          
        while(m.find()) 
        { 
            if(hs.contains(m.group())) 
                counter++; 
        } 
          
        return counter; 
          
    } 
      
    public static void main(String[] args)  
    { 
        String word[] = { "i", "work", "in", "cognizant"}; 
          
        String str = "i work in cognizant"; 
          
        System.out.println(countOccurrence(word,str)); 
          
    } 
  
} 