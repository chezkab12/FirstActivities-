package SecondSem;

public class DigitsOnly {

  public static void main(String[] args){
  
    String input = "1234567890";
    boolean result = input.matches("[0-9]+");
    System.out.println("String : " + input);
    System.out.println("Does string contains only digits? : " + result);
    }

}
