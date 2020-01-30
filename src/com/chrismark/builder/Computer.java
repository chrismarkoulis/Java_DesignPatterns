/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.builder;

/**
 *
 * @author chris
 */
public class Computer {

    private String ram;
    private String ssd;
    private String cpu;
    private String screen;
    private String keyboard;
    private String bluetooth;
    private String wifi;

    private Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.keyboard = builder.keyboard;
        this.bluetooth = builder.bluetooth;
        this.wifi = builder.wifi;
    }

    

    
    
    public String getRam() {
        return ram;
    }

    public String getSsd() {
        return ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public String getScreen() {
        return screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getWifi() {
        return wifi;
    }

    public Computer setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    public Computer setWifi(String wifi) {
        this.wifi = wifi;
        return this;
    }
    
    

    @Override
    public String toString() {
        return "Computer{" + "ram=" + ram + ", ssd=" + ssd + ", cpu=" + cpu + ", screen=" + screen + ", keyboard=" + keyboard + ", bluetooth=" + bluetooth + ", wifi=" + wifi + '}';
    }

    
    
    

   public static class ComputerBuilder {

        private String ram;
        private String ssd;
        private String cpu;
        private String screen;
        private String keyboard;
        private String bluetooth; //optional attribute
        private String wifi; //optional attribute

        public ComputerBuilder(String ram, String ssd, String cpu, String screen, String keyboard) {
            this.ram = ram;
            this.ssd = ssd;
            this.cpu = cpu;
            this.screen = screen;
            this.keyboard = keyboard;
        }

        public ComputerBuilder setBluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public ComputerBuilder setWifi(String wifi) {
            this.wifi = wifi;
            return this;
        }
        
        public Computer build(){
        
            return new Computer(this);
        }

       
        
    }

    
        
   
}
