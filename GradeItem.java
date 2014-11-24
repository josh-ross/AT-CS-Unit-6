import java.util.ArrayList;
import java.util.Scanner;
/**
 * Represents a grade item.
 * 
 * @author (Josh Ross) 
 * @version (date)
 */
public class GradeItem
{
    private ArrayList<Integer> scores; // all the scores for this grade item
    private String description; // description of this grade item
     
    /**
     * Creates a new grading item with the given description.
     * Keep inputing all the grades for this item from the user until the user enters
     * -1. (Do NOT store -1 in your list of grades)
     * @param myDesc the description for this grading item
     */
    public GradeItem(String myDesc)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String myGrade = in.nextLine();
        System.out.println("Nice to meet you, " + myGrade + "!");
        // rest of implementation omitted        
    }
     
    /**
     * Returns the number of scores for this grade item.
     * @return the number of scores for this grade item.
     */
    public int getSize()
    {
        return scores.size();
    }
     
    /**
     * Returns the description of this grade item.
     * @return the description of this grade item.
     */
    public String getDescription()
    {
        return description;
    }
     
    /**
     * Prints each score for this grade item, one per line.
     */
    public void printScores()
    {
        System.out.println(scores);
    }
     
    /**
     * Returns the arithmetic mean (average) of all the scores for this
     * grade item.
     * @return the arithmetic mean (average) of all the scores for this
     * grade item.
     */
    public double getAverageScore()
    {
        // implementation not shown
        return -1.0; // change this line
    }
     
    /**
     * Returns the lowest score of all the scores for this grade item.
     * @return the lowest score of all the scores for this grade item.
     */
    public int getLowestScore()
    {
        // implementation not shown
        return -1; // change this line
    }
     
    /**
     * Returns the highest score of all the scores for this grade item.
     * @return the highest score of all the scores for this grade item.
     */
    public int getHighestScore()
    {
        // implementation not shown
        return -1; // change this line
    }
}
