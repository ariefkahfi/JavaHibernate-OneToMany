/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arief.testhibernate3.onetomany;


import com.arief.testhibernate3.onetomany.entity.with.jointables.Karyawan;
import com.arief.testhibernate3.onetomany.entity.with.jointables.Pabrik;
import com.arief.testhibernate3.onetomany.setups.HibernateSetup;
import com.arief.testhibernate3.onetomany.utils.HibernateConfigType;
import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author arief
 */


// SAMPLE SAVE (WITH CASCADE)
//        News jakartaBanjir = new News();
//        jakartaBanjir.setCommentsList(new ArrayList<>());
//        jakartaBanjir.setNewsName("Jakarta Kebanjiran");
//        
//        Comments c1 = new Comments();
//        Comments c2 = new Comments();
//        
//        
//        c1.setCommentsId("C1");
//        c2.setCommentsId("C2");
//        
//        
//        c1.setCommentsContent("di jakarta lagi kebanjiran ni ...");
//        c2.setCommentsContent("parah gan ...");
//        
//        c2.setNews(jakartaBanjir);
//        c1.setNews(jakartaBanjir);
//        
//        
//        session.save(c1);
//        session.save(c2);
//        
//        
//        jakartaBanjir.setNewsName("Jakarta Banjir Lagi");


//DELETE RELATION WITH orphanRemoval
//        News nine = (News)session.get(News.class, 7);
//        Comments c12 = (Comments)session.get(Comments.class, "C12");
//        
//        nine.getCommentsList().remove(c12);



public class HibernateApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateSetup.sessionFactoryInstanceViaStandardServiceRegistry(HibernateConfigType.PabrikAndKaryawan);
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
//        Pabrik p002 = (Pabrik)session.get(Pabrik.class, "P002");
//        
//        Karyawan k12 = new Karyawan();
//        k12.setNamaKaryawan("Karyawan twelve");
//        k12.setAlamatKaryawan("Alamat Karyawan twelve");
//        
//        
//        k12.setPabrik(p002);
//        
//        
//        session.save(k12);
//        
//        
//        Karyawan k10  = (Karyawan)session.get(Karyawan.class, 10);
//        
//        
//        k10.setPabrik(p002);
//        
//        
        
        session.getTransaction().commit();
        session.close();
    }
}
