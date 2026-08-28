import java.util.Locale;

public class stringMethods {

    public static void main(String[] args) {

        // String Method

        String name = "Dave";

        int length = name.length();                         //Adds total length of the string
        char letter = name.charAt(0);                       //Gets a character at the specific index
        int index = name.indexOf("v");                      //Finds the letter at the given index
        int lastIndex = name.lastIndexOf("e");          //Finds the last letter

        name = name.toUpperCase();                          //All letters become uppercase
        name = name.toLowerCase();                          //All letters become lowercase

        name = name.trim();                                 //Removes whitespace

        name = name.replace("D", "B");    //Replace the old str to new str

        name.isEmpty();                                     //Check if the string variable is empty (Useful for if Statement)

        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }else{
            System.out.printf("Hello, %s", name);
        }
        */

        /*
        if(name.contains("v")) {                            //contains.() Check string if it contains specific string
            System.out.println("Your name contains v");
        }else{
            System.out.println("Your name doesn't contain v");
        }
        */

        /*
        if(name.equals(name)) {                             //Checks if a string variable or a string is equal
                                                            //To ignore cases use equalsIgnoreCase()
            System.out.println("Your name is the same");
        }else{
            System.out.println("Your name is not the same");
        }
         */

        System.out.println(letter);
    }
}
