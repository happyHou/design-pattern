package decorator;

/**
 * Created by happyhou on 2019/4/3.
 */
public class Darkroast extends Beverage {
    public Darkroast(){
        description="dark coast";
    }
    @Override
    public double cost() {
        return .02;
    }
}
