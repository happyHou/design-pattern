import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import decorator.Beverage;
import decorator.Darkroast;
import decorator.Espresso;
import decorator.HouseBlend;
import decorator.Mocha;
import decorator.Whip;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello World!");
//        装饰器模式
        Beverage beverage=new Espresso();
//        System.out.print(beverage.getDescription()+"$"+beverage.cost());

        //   0.02+
        Beverage beverage2=new Darkroast();
        beverage2=new Mocha(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);

        System.out.print(beverage2.getDescription()+"$"+beverage2.cost());
    }
}
