package decorator;

/**
 * Created by happyhou on 2019/4/3.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
}
