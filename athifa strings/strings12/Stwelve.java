public class Stwelve{
      public static void main(String[] args) {
            String s = "kavya";
            System.out.println(oddEncryptionOfString(s));
      }
      public static String oddEncryptionOfString(String s) {
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i < s.length();i++){
                  char c = s.charAt(i);
                  if(c%2 != 0){
                        c = (char)(c+1);
                        sb.append(c);
                  }
                  else
                        sb.append(c);
            }
      return sb.toString();
      }
}