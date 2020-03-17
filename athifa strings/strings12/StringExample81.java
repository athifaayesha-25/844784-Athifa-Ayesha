import java.util.*;
public class StringExample81 {


public static void main(String args[]) {

      
      String  seq = new String("Hello");
      System.out.println(seq);

      
      seq = seq.substring(0, 2)+ "_" + seq.substring(2, seq.length());
      System.out.println(seq);

  }