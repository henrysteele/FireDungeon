import java.util.Scanner;

public class FireDungeon
{
    public static String Prompt(String prompt){
        System.out.println(prompt);
        // scan and return input
        Scanner Obj = new Scanner(System.in);
        String name = Obj.nextLine();  
        return name;
    }
    
    public static boolean checkOptions(String[] options, String input){
        // return true if input is in options
        for (String i : options) {
            if (i.equals(input)) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        String prompt = "What's your name?";
        String[] options = {"Henry","Chad"};
        String response ="";

        while (checkOptions(options, response) == false){
            response = Prompt(prompt);
        }
    }
   
}
