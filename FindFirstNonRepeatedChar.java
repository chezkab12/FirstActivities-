package SecondSem;

public class FindFirstNonRepeatedChar {

  public static void main(String[]Args){
    
    String word ="Computer Programming";

        for(char i :word.toCharArray()){
        if ( word.indexOf(i) == word.lastIndexOf(i)) {
            System.out.println("First non-repeated character is: "+i);
            break;
        }
        }
  }

}
