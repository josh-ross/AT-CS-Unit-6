import java.util.ArrayList;
/**
 * Like a ray of sun. ArRAY, get it? ArrayList...
 * 
 * @author (Josh Ross) 
 * @version (11-14-14)
 */
public class Sun
{
   public static void ourFirstList()
   {
       ArrayList<String> names = new ArrayList<String>();
       //                            ^^^^^^^^^^^^^^^^^^^ invokes the constructor
       names.add("Uzair");
       names.add("Austin");
       names.add("Melissa");
       //add your code here
       names.add(1,"Jack"); // 1. inset "Jack" before "Austin".
       names.remove(0); // 2. Remove "Uzair"
       names.set(1,"Evan"); // 3. Change the second element of the list to "Evan"
       //for (int i = 0; i < names.size(); i++) // old longer way // 4. Print out each name on a separate line
       for (String currentName : names)
       {
           //String currentName = names.get(i); // old longer way
           System.out.println(currentName);
           // above line can be whatever you want to do with currentName
       }
   }
}
