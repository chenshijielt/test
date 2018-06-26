package org.shijchen.spring.ioc.sample3;

/**
 *  简单工厂模式实现
 */
public class FruitFactory {

    public static Fruit getInstance(String className){
        Fruit f = null;
        try {
            f = (Fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
