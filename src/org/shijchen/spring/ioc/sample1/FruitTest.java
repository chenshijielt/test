package org.shijchen.spring.ioc.sample1;

public class FruitTest {
    public static void main(String[] args) {
        Fruit f=FruitFactory.getInstance("orange");
        f.eat();
    }
}
