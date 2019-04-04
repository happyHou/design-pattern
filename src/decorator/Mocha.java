package decorator;

/**
 * Created by happyhou on 2019/4/3.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",mocha";
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }
}
