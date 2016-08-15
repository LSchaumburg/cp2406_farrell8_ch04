/**
 * Created by jc247746 on 15/08/16.
 */
public class FormLetterWriter {
    public static void main(String[] args) {
        displaySalutations("Luke", "Schaumburg");
        displaySalutations("Schaumburg");
    }

    public static void displaySalutations(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " + lastName);
        System.out.println("Thank you for your recent order");
    }

    public static void displaySalutations(String firstName, String lastName)
    {
        System.out.println("Dear Mr. " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order");
    }
}
