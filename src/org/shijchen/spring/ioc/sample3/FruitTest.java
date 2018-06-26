package org.shijchen.spring.ioc.sample3;

import java.util.Properties;

public class FruitTest {
    public static void main(String[] args) {
        Properties pro=new PropertiesOperate().getProperties();
        Fruit f= FruitFactory.getInstance(pro.getProperty("apple"));
        f.eat();
    }
}
