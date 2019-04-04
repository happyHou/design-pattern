package decorator;

/**
 * Created by happyhou on 2019/4/3.
 * 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso(){
        description="espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
