public class Tester {
    public static void main(String[] args) {
        AddingMachine myCalculator = new AddingMachine(); //creates new AddingMachine
        myCalculator.add (4);               //tester calls
        myCalculator.subtract (2);
        myCalculator.add(5);
        System.out.println(myCalculator.toString());
    }
}
