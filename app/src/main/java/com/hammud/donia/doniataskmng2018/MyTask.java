package com.hammud.donia.doniataskmng2018;

import android.content.Intent;

import org.w3c.dom.Text;

import java.util.Date;

public class MyTask
{
    private String key; // key; uniqe id for each object
    private String title;
    private  String text;
    private  String important;
    private  String necessary;
    private Date createdA;
    private Date dueDate;
    private String Owner;



    public MyTask()
    {

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public String getNecessary(String necessery) {
        return necessary;
    }

    public void setNecessary(String necessary) {
        this.necessary = necessary;
    }

    public Date getCreatedA() {
        return createdA;
    }

    public void setCreatedA(Date createdA) {
        this.createdA = createdA;
    }

    public Date getDueDate(Date date) {
        return dueDate;
    }
    public void setOwner(String Owner){this.Owner=Owner;}

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;

    }

    @Override
    public String toString() {
        return "MyTask{" +
                "key='" + key + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", important=" + important +
                ", necessary=" + necessary +
                ", createdA=" + createdA +
                ", dueDate=" + dueDate +
                '}';
    }




}
