/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arief.testhibernate3.onetomany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author arief
 */
@Entity
@Table(name="news")
public class News implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "news_id")
    private int id;
    
    @Column(name = "news_name")
    private String newsName;
    
//    pakai orphanRemoval untuk menghapus relasi ke comments 
    @OneToMany(orphanRemoval = true,mappedBy = "news")
    private List<Comments> commentsList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public List<Comments> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comments> commentsList) {
        this.commentsList = commentsList;
    }

    @Override
    public String toString() {
        return "News{" + "id=" + id + ", newsName=" + newsName + '}';
    }
    
    
}
