package decorator;

/**
 * Created by happyhou on 2019/4/3.
 */
public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;

    public abstract String getDescription();
}
