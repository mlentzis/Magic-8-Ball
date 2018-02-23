//magiceightball1.class


public class magiceightball1
{
  //attributes:
  private String ans1="It is certain";
  private String ans2="Signs point to yes";
  private String ans3="Reply hazy try again";
  private String ans4="Concentrate and ask again";
  private String ans5="Don't count on it";
  private String ans6="Outlook not so good";

  public String getAnswer()
  {
    int choice = randbetween(1,6);
    
  if ( choice == 1)
    return ans1;
  else if ( choice == 2)
    return ans2;
  else if ( choice == 3)
    return ans3;
  else if( choice == 4)
    return ans4;
  else if( choice == 5)
    return ans5;
  else
    return ans6;
 
  }
    
    
    
    
    
    
  
  
  /**
    * randbetween: Return a random integer between low and high values
    * 
    * @param: low - low value
    * @param: high - high value
    * @return: random integer b/w low and high
    */ 
   public int randbetween( int low, int high ) {
      int scale = high - low + 1;
      int shift = low;
      int randnum = (int)(Math.random() * scale) + shift;
      
      return randnum;
   }
} 