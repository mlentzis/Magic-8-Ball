//m.Lentzis
//magiceightball.java

import java.util.Scanner;

public class magiceightball
{
  public static void main(String [] args)
  {
    Scanner keyboard= new Scanner(System.in);
    
    magiceightball1 m8 = new magiceightball1();
    
    while(true)
    {
    
    System.out.println("ask me a question:");
    String question = keyboard.next();
    
    String answer= m8.getAnswer();
    System.out.println(answer);
    }
    
  }
} 
