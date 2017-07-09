/** This is the Apple class. It contains a few variables that the other variables don't.
 *
 */
public class Apple extends Fruit{

    //class variable deceleration
    private String color;

    public Apple(String color){
        super("Apple", 5, 8, false);
        this.color = color;

    }

    //Getters and Setters
    //This returns the name even though the variable is not located inside this class.
    public String getName(){
        return this.name;
    }
    //This returns the color as it is in this class.
    public String getColor(){
        return this.color;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Color: " + color;
    }

}