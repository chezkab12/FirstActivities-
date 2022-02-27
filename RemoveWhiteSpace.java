package SecondSem;

public class RemoveWhiteSpace {

  public static void main(String[] args) {
  
     String input = "Hi! My name is Chezka Gayle Banania.";
     
     String result = input.replaceAll("\\s", "");
     System.out.println(result);
     
   }
}
