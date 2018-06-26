package org.shijchen.spring.ioc.sample2;

public class FruitTest {
    public static void main(String[] args) {
        Fruit f= FruitFactory.getInstance("org.shijchen.spring.ioc.sample2.Orange");
        f.eat();
    }
}
