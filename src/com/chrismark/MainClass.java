package com.chrismark;

import com.chrismark.builder.Computer;

/**
 *
 * @author chris
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Singleton Pattern example with a unique train */
//        Train train = Train.getUniqueTrain();
//        train.setNoOfPassengers(20);
//        train.travel();
//==========================================================================//

        /* Factory Pattern example with Car Factory */
//        CarFactory factory = new CarFactory();
//
//        Car car1 = factory.getCar("CompactCar");
//        System.out.println("Car1 status: ");
//        car1.startEngine();
//        System.out.println("\nCar2 status: ");
//
//        Car car2 = factory.getCar("electricCar");
//        car2.startEngine();
//        System.out.println("\nCar3 status: ");
//
//        Car car3 = factory.getCar("flyingCar");
//        car3.startEngine();
//==========================================================================//
        /* Observer Pattern with student observer and team group(channel) subject */
//        TeamChannel channel = new TeamChannel("Java");
//     
//        StudentObserver so1 = new StudentObserver(channel, "Nick");
//        StudentObserver so2 = new StudentObserver(channel, "Chris");
//        StudentObserver so3 = new StudentObserver(channel, "George");
//        
//        channel.setTitle("Java SE");
//        channel.remove(so3);
//        
//        channel.setTitle("Java EE");
//        channel.attach(so3);
//        channel.setTitle("Python");
//        channel.notifyStudent("do you like " + channel.getTitle() + so3 + "?");
//==========================================================================//

        /* Composite Pattern */
//        Person grandfather = new Parent("Pappous", 65);
//        Person dad = new Parent("Daddy", 45);
//        Person kid1 = new Child("Nick", 10);
//        Person kid2 = new Child("Mary", 13);
//
//        grandfather.addDescendant(dad);
//        dad.addDescendant(kid1);
//        dad.addDescendant(kid2);
//
//        grandfather.printFamily();
//
//        System.out.println("====================================================");
//
//        dad.printFamily();
//        kid1.printFamily();
//
//========================================================================================

/* builder pattern*/

        Computer computer = new Computer.ComputerBuilder("8G", "256gb", "intel", "15.4'", "keyboard")
                .setBluetooth("4.0").setWifi("802.11a").build();
        System.out.println(computer);
        
       
    }

}
