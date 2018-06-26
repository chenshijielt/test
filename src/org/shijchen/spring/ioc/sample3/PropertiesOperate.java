package org.shijchen.spring.ioc.sample3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesOperate {
    private Properties pro=null;
    private File file=new File("d:"+File.separator+"fruit.properties");

    public PropertiesOperate(){
        this.pro=new Properties();
        if(file.exists()){
            try {
                pro.loadFromXML(new FileInputStream(file));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            this.save();
        }
    }
    private void save(){
        this.pro.setProperty("apple","org.shijchen.spring.ioc.sample3.Apple");
        this.pro.setProperty("orange", "org.shijchen.spring.ioc.sample3..Orange");
        try {
            this.pro.storeToXML(new FileOutputStream(this.file),"Fruit");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Properties getProperties(){
        return this.pro;
    }
}
