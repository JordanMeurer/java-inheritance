/**
 * Created by Jordan on 7/9/2017.
 */
public class Orange extends Fruit{

    private String color;

    public Orange(String color){
        super("Orange", 6, 10, false);
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
