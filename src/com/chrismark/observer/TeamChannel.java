/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class TeamChannel {

    /*
    
    this is the subject
    it has a state
    
     */

    private String title; //state

    private List<Observer> studentsObsv = new ArrayList<Observer>();

    public TeamChannel(String title) {
        this.title = title;
       
    }

    public String getTitle() {
        return title;
        
    }

    public TeamChannel setTitle(String title) {
        this.title = title;
        notifyAllStudents();
        return this;    
    }

    

    public void attach(Observer observer) {
        
        studentsObsv.add(observer);

    }

    public void notifyAllStudents(){
      for (Observer observer : studentsObsv) {
         observer.update();
      }
   
    }
    
    
    public void remove(StudentObserver observer){
    
        studentsObsv.remove(observer);
        System.out.println("\n**** subscriber " + observer.getName() + " removed from channel " + this.getTitle() + "\n");
    }
    
    public void notifyStudent(String message){
    
        System.out.println(message);
    
    }
    
}
