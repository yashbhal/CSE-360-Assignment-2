/**
 * Adding Machine program that performs addition & subtraction operations while maintaining the history of transactions
 * CSE 360 Assignment 2
 * @author Yash Bhalchandra
 *
 */

public class AddingMachine {
    private int total;
    private String history = "0";

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    public int getTotal () { //method that returns the total
        return total;
    }

    public void add (int value) { //adds value to the total variable
        total = total + value;
        history += " + " + value;
    }

    public void subtract (int value) { //subtracts value from the total variable
       total = total - value;
        history+= " - " + value;
    }

    public String toString () { //toString method that returns required output
        return history + " ";
    }

    public void clear() { //clears the adding machine by resetting history & total
        history = "";
        total = 0;
    }
}