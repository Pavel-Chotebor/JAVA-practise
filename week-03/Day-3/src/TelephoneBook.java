import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {

    public static void main(String[] args) {

        Map <String, String> phoneBook = new HashMap<>();

        phoneBook.put("William A. Lathan", "405-709-1865");
        phoneBook.put("John K. Miller", "402-247-8568");
        phoneBook.put("Hortensia E. Foster", "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println("number of John K. Miller is " + phoneBook.get("John K. Miller"));

        System.out.println(phoneBook.containsValue("307-687-2982"));

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue() == "307-687-2982") {
                System.out.println("307-687-2982 is " + entry.getKey() + "'s number");
            }
        }

        if (phoneBook.containsKey("Chris E. Myer")) {
            phoneBook.get("Chris E. Myer");
        } else System.out.println("There is not such a person!");

    }
}

/*Create an application which solves the following problems.

What is John K. Miller's phone number?
Whose phone number is 307-687-2982?
Do we know Chris E. Myers' phone number?

 */
