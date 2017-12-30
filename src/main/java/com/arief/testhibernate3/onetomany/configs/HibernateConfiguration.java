/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arief.testhibernate3.onetomany.configs;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.hibernate.cfg.Configuration;



/**
 *
 * @author arief
 */
public class HibernateConfiguration {
    
    
    private static Map hibernateMapsSettings(){
        Map map = new HashMap();
        
        map.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/orm_db3");
        map.put("hibernate.connection.username", "arief");
        map.put("hibernate.connection.password", "arief");
        map.put("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
        map.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        map.put("hibernate.show_sql", "true");
        map.put("hibernate.hbm2ddl.auto", "update");
        
        return map;
    }
    
    private static Properties hibernateProperties(){
        Properties hibernateProps =  new Properties();
        hibernateProps.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/orm_db3");
        hibernateProps.put("hibernate.connection.username", "arief");
        hibernateProps.put("hibernate.connection.password", "arief");
        hibernateProps.put("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
        hibernateProps.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        hibernateProps.put("hibernate.show_sql", "true");
        hibernateProps.put("hibernate.hbm2ddl.auto", "update");
        return hibernateProps;
    }
    public static Map getHibernateMapsSettings(){
        return hibernateProperties();
    }
    public static Properties getHibernateProps(){
        return hibernateProperties();
    }
}
