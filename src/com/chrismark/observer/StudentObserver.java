/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.observer;

/**
 *
 * @author chris
 */
public class StudentObserver extends Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public StudentObserver() {
       
    }

    
    public StudentObserver(TeamChannel channel, String name) {
        this.name = name;
        this.teams = channel;
        this.teams.attach(this);
        this.update();
    }

    @Override
    public void update() {
        System.out.println("Student " + this.getName() + "\ngot a notification for channel with title: \n" + teams.getTitle());

    }

    

    
}
