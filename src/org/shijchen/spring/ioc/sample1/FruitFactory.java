package org.shijchen.spring.ioc.sample1;

/**
 *  简单工厂模式实现
 */
public class FruitFactory {

    public static Fruit getInstance(String className){
        Fruit f=null;
        if(className.equals("apple")){
            f=new Apple();
        }
        if(className.endsWith("orange")){
            f=new Orange();
        }
        return f;
    }
}
