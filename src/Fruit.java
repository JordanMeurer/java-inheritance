/** This is the Fruit class. This is the class that will be extended by the fruit.
 *
 */

public class Fruit{

    //Class variable deceleration
    String name;
    int size;
    int weight;
    boolean refrigerate;

    //Constructor for Fruit
    public Fruit(String name, int size, int weight, boolean refrigerate){
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.refrigerate = refrigerate;

    }
    //Default constructor
    public Fruit(){

    }

}