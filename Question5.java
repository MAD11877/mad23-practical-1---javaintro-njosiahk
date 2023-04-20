import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    //System.out.print("Enter the number of integers: ");
    int n = in.nextInt();

    int[] arr = new int[n];
    
    //System.out.print("Enter integers: ");
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    int mode = arr[0];
    int maxCount = 1;
    for (int i = 0; i < n; i++) {
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] == arr[i]) {
                count++;
            }
        }
        if (count > maxCount) {
            mode = arr[i];
            maxCount = count;
        }
    }

    System.out.print(mode);
    
  }
}
