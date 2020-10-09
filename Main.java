import java.util.Scanner;

/**
 * Puts 2 values into ascending order using an array by checking if the first number is larger than the second and switching them
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //asks the user to enter two values into the array
    System.out.println("Please enter the 2 values for the array");

    //store the 2 integers in an array
    int[] values = new int[2];
    
     //takes the users integers to put them in an array
    for(int i = 0; i < 2; i++){
      values[i] = input.nextInt();
    }

    //if the numbers are already in ascending order will print this to the screen
    if(values[0] <= values[1]){
      System.out.println("Your numbers in ascending order are " + values[0] + " and " + values[1]);
      }

    //initializes this as the value of the first integer in the array
    int firstValue = values[0];
    //initializes this as the value of the second integer in the array
    int secondValue = values[1];

    //if the first integer is larger than the second this will switch the array to where the first integer is the second and the second integer is the first and will then print the numbers in ascending order to the screen
    if(values[0] > values[1]){
      values[0] = secondValue;
      values[1] = firstValue;
      System.out.println("Your numbers in ascending order are " + values[0] + " and " + values[1]);
    }
      
    }
  }