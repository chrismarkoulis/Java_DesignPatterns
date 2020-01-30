/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.factory;

/**
 *
 * @author chris
 */
public class ElectricCar implements Car {

    @Override
    public void startEngine() {
        System.out.println("battery charged and ready for a roadkill!!");

    }
    
}
