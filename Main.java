import java.util.Scanner;
/**
 * Created by Eleonor Bart, February 2019.
 */
public class Main {
  public static void main(){//String[] args ){
      String nameString; 
      Scanner nameInput = new Scanner(System.in);
      System.out.println("Hi, friend! What's your name?"); 
      nameString = nameInput.nextLine();
      if (nameString.equals("Alice") || nameString.equals("Bob")){
      System.out.println("Greetings,  "+ nameString);
     } else {
         System.out.println("Sorry,  "+ nameString + ", only Alice and Bob allowed");
        }
  }  
}
