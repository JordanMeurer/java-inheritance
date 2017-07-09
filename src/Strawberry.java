/**
 * Created by Jordan on 7/9/2017.
 */
public class Strawberry extends Fruit{

    private String color;

    public Strawberry(String color){
        super("Strawberry", 12, 6, true);
        this.color = color;

    }

    //Getters and Setters
    //This returns the name even though the variable is not located inside this class.
    public String getName() {
        return this.name;
    }

    //This returns the color as it is in this class.
    public String getColor() {
        return this.color;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Color: " + color;
    }
}
