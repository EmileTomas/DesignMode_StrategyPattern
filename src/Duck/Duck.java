package Duck;

import FlyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;

/**
 * Created by Administrator on 2016/9/21.
 */

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}
