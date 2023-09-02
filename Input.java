import java.util.*;

public class Input
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // only one token per line //
        System.out.print("Entering Input (one  word) : ");
        String fname = sc.next();
        System.out.println(fname);

        sc.nextLine(); // to avoid skipping //


        // one entire line //
        System.out.print("Entering Input (one  line) : ");
        String text = sc.nextLine();
        System.out.println(text);


    }
}