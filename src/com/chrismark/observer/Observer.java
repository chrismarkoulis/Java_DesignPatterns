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
public abstract class Observer {
    
    protected TeamChannel teams;
    
    
    public abstract void update();
}
