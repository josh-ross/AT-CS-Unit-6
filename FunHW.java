import java.util.ArrayList;
public class FunHW
{
    public static Integer findMin(ArrayList<Integer> list)
    {
        int smallest = list.get(0);
        for (int i=1; i < list.size(); i++)
        {
            int current = list.get(i);
            if ( current < smallest)
            {
                smallest = current;
            }
        }
        return smallest;
    }
 
     
    public static void removeMin(ArrayList<Integer> list)
    {
        int smallest = list.get(0);
        int smallestIndex = 0; // index of smallest value
        for (int i=1; i < list.size(); i++)
        {
            int current = list.get(i);
            if ( current < smallest)
            {
                smallest = current;
                smallestIndex = i;
            }
        }
        list.remove(smallestIndex);
         
    }
}
