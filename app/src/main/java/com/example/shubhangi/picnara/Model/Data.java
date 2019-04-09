package com.example.shubhangi.picnara.Model;

import java.io.Serializable;

/**
 * Created by shubhangi on 09-04-2019.
 */

public class Data implements Serializable{
    String name;
    String descp;
    String budget;
    String propos;
    String event;
    String posted;

    public Data(String name,String descp,String budget,String propos,String event,String posted){
        this.name=name;
        this.descp=descp;
        this.budget=budget;
        this.propos=propos;
        this.event=event;
        this.posted=posted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getPropos() {
        return propos;
    }

    public void setPropos(String propos) {
        this.propos = propos;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }
}
