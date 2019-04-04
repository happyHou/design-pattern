package decorator;

/**
 * Created by happyhou on 2019/4/3.
 */
public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+.10;
    }
}
