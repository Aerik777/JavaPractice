import java.util.*;
public class Testvector {
    public static void main(String[] args) {
        //created colors vector 
        Vector <String>colors = new Vector <>();

        //Added elements in vectors
        colors.add("Orange");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Green");
        System.out.println(colors);

        Vector <String>colors1 = new Vector<>();
        colors1.add("Black");
        colors1.add("White");
        colors1.add("Yellow");
        colors1.add("skyblue");
        System.out.println(colors1);

        //Merged colors and colors1.
        colors.addAll(colors1);

        //Added new element at index 5 in colors vector.
        colors.insertElementAt("Gray", 5);

        //Iterator interface to traverse the element from vector.
        Iterator <String> its = colors.iterator();

        //Checks if its has next element.
        while (its.hasNext()){
            //prints out next element.
            System.out.println(its.next());
        }
    }
}
