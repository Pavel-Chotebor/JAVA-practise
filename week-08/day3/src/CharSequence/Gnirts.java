package CharSequence;

 public class Gnirts implements BackwardsReadable  {

    String string;

    public Gnirts (String word) {
        this.string = string;
    }

     @Override
     public int myCharAt(String word, int number) {
         int result =  (word.length() - word.charAt(number));
         return result;
     }
 }
