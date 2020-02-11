class Twentyeight { 
    // Method to find the required string 
  
    String swapChars(String s, int c, int b) 
    { 
        // Get string length 
        int n = s.length(); 
  
        // if c is larger or equal to the length of 
        // the string is effectively the remainder of 
        // c divided by the length of the string 
        c = c % n; 
  
        if (c == 0) { 
            // No change will happen 
            return s; 
        } 
  
        int f = b / n; 
        int r = b % n; 
  
        // Rotate first c characters by (n % c) 
        // places f times 
        String p1 = rotateLeft(s.substring(0, c), 
                               ((n % c) * f) % c); 
  
        // Rotate remaining character by 
        // (n * f) places 
        String p2 = rotateLeft(s.substring(c), 
                               ((c * f) % (n - c))); 
  
        // Concatenate the two parts and convert the 
        // resultant string formed after f full 
        // iterations to a character array 
        // (for final swaps) 
        char a[] = (p1 + p2).toCharArray(); 
  
        // Remaining swaps 
        for (int i = 0; i < r; i++) { 
  
            // Swap ith character with 
            // (i + c)th character 
            char temp = a[i]; 
            a[i] = a[(i + c) % n]; 
            a[(i + c) % n] = temp; 
        } 
  
        // Return final string 
        return new String(a); 
    } 
  
    String rotateLeft(String s, int p) 
    { 
        // Rotating a string p times left is 
        // effectively cutting the first p 
        // characters and placing them at the end 
        return s.substring(p) + s.substring(0, p); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        // Given values 
        String s1 = "ABCDEFGHIJK"; 
        int b = 1000; 
        int c = 3; 
  
        // get final string 
        String s2 = new Twentyeight().swapChars(s1, c, b); 
  
        // print final string 
        System.out.println(s2); 
    } 
} 