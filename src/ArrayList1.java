import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        for (String numbeString : list)  {
            System.out.print(numbeString+" ");
            
        }

        
    }
}