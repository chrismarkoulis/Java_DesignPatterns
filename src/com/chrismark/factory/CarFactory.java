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
public class CarFactory {

    public Car getCar(String carType) {

        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("COMPACTCAR")) {
            return new CompactCar();
        } else if (carType.equalsIgnoreCase("ELECTRICCAR")) {
            return new ElectricCar();
        } else if (carType.equalsIgnoreCase("FLYINGCAR")) {
            return new FlyingCar();
        }
        return null;
    }
}
