package com.hammud.donia.doniataskmng2018;

import java.util.Date;

public class MyTask
{
    private String key; // key; uniqe id for each object
    private String title;
    private  String text;
    private  int important;
    private  int necessary;
    private Date createdA;
    private Date dueDate;

    public Object setOwner;

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

    public void setText(MyTask text) {
        this.text = text;
    }

    public int getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public int getNecessary(String necessery) {
        return necessary;
    }

    public void setNecessary(int necessary) {
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
