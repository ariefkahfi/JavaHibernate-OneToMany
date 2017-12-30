/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arief.testhibernate3.onetomany.setups;

import com.arief.testhibernate3.onetomany.configs.HibernateConfiguration;
import com.arief.testhibernate3.onetomany.entity.Comments;
import com.arief.testhibernate3.onetomany.entity.News;
import com.arief.testhibernate3.onetomany.entity.with.jointables.Karyawan;
import com.arief.testhibernate3.onetomany.entity.with.jointables.Pabrik;
import com.arief.testhibernate3.onetomany.utils.HibernateConfigType;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author arief
 */
public class HibernateSetup {
    
    private static SessionFactory setUpSessionFactoryWithConfigurationAndProperties(){
        Configuration config = new Configuration()
                .setProperties(HibernateConfiguration.getHibernateProps())
                .addAnnotatedClass(News.class)
                .addAnnotatedClass(Comments.class);
        
        SessionFactory sessionFactory = config.buildSessionFactory();
        return sessionFactory;
    }
    
    private static SessionFactory setUpSessionFactoryForPabrikAndKaryawan(){
        Configuration config = new Configuration()
                .setProperties(HibernateConfiguration.getHibernateProps())
                .addAnnotatedClass(Pabrik.class)
                .addAnnotatedClass(Karyawan.class);
        
        SessionFactory sessionFactory = config.buildSessionFactory();
        return sessionFactory;
    }
    
    private static SessionFactory setUpSessionFactoryWithStandardServiceRegistry(){
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .applySettings(HibernateConfiguration.getHibernateMapsSettings())
                .build();
        
        SessionFactory sessionFactory = new MetadataSources()
                .addAnnotatedClass(News.class)
                .addAnnotatedClass(Comments.class)
                .buildMetadata(ssr)
                .buildSessionFactory();
        
        return sessionFactory;
    }
    
    public static SessionFactory sessionFactoryInstanceViaStandardServiceRegistry(HibernateConfigType configType){
        switch(configType){
            case ViaConfigurationAndProperties :
                return setUpSessionFactoryWithConfigurationAndProperties();
            case ViaStandardServiceRegistry :
                return setUpSessionFactoryWithStandardServiceRegistry();
            case PabrikAndKaryawan :
                return setUpSessionFactoryForPabrikAndKaryawan();
            default:
                return null;
        }
    }
}
