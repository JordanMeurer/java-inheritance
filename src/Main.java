/** This is a small program to show and explain how inheritance works. It will show the benefits of inheritance.
 * Create by Jordan Meurer
 */
import java.util.*;
public class Main {



    /*This is the Fruit_choice method. This will ask the user for a integer to return a Fruit object. This allows the
    * method to return a Fruit object which allows the object to be a Apple, Orange, or Strawberry without having
    * to create a method for each object*/
    public static Fruit Fruit_choice(){
        //method variable deceleration
        int choice = 0;
        Fruit fruit = new Fruit();

        //Scanner object to gather input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter what type of fruit you would like to add!");
        System.out.println("1.Apple\n2.Orange\n3.Strawberry");
        //A loop to check the users input
        while(true) {
            try {
                choice = scanner.nextInt();
            }
            catch(InputMismatchException exception){
                System.out.println("You did not input an integer");
                scanner.next();
            }
            if(choice == 1 || choice == 2 || choice == 3)
                break;
            System.out.println("Please enter a valid input (1, 2, or 3)");
        }
        //Checks the input and creates an object based on the choice.
        /*In the objects here, we are creating a fruit variable but we are creating an object of either Apple, Orange,
        * or Strawberry. You will see the benefits above.*/
        switch(choice){
            case 1:
                fruit = new Apple("Green");
                break;
            case 2:
                fruit = new Orange("Orange");
                break;
            case 3:
                fruit = new Strawberry("Red");
                break;
        }
        return fruit;
    }

    public static void main(String[] args) {
        /* This is one of the useful parts of using inheritance. We are able to create an arraylist using which will
        * hold fruit variables but it holds objects of either Apple, Orange, or Strawberry
         */
        ArrayList Fruits = new ArrayList();

        System.out.println("Welcome to the Inheritance example created by Jordan Meurer");
        //Call the method to get an object
        while (true){
            Fruits.add(Fruit_choice());
            System.out.print(Fruits.get(0));
            break;
        }

    }
}
