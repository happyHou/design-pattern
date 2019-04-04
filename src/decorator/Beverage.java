package decorator;

/**
 * Created by happyhou on 2019/4/3.
 */
public abstract class Beverage {
    String description="unknown beverage";

    public String getDescription(){
        return description;
    }


    public abstract double cost();

}
