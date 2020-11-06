package com.library.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static final Properties properties=new Properties();

    static {

        try {
            FileInputStream file=new FileInputStream("Configuration.properties");
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no such a property available");
        }

    }


    public static String getProperty(String keyword){

        return properties.getProperty(keyword);

    }





}
