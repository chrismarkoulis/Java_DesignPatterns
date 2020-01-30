package com.chrismark.singleton;

/**
 *
 * @author chris
 */
// Singleton Train
public class Train {

    private int noOfPassengers;
    private static final String TYPE = "MAGIC";
    //private static Train uniqueTrain = new Train();
    private static Train uniqueTrain;
    
    

    
    
    //instance block
    {
        System.out.println("passengers: " + noOfPassengers);

    }

    //static block
    static {

        System.out.println("type: " + TYPE);
        System.out.println("train: " + uniqueTrain);
    }

    private Train() {
        
        System.out.println("train created");
       
    }

//    public static Train getUniqueTrain() {
//
//        return uniqueTrain;
//
//    }
    public static Train getUniqueTrain() {
        if (uniqueTrain == null) {
             uniqueTrain = new Train();

        }else {
            
        }
        return uniqueTrain;
        
    }

    public String getTYPE() {
        return TYPE;
    }

    public void travel() {
        System.out.println("\n*****************************************************\n");
        System.out.println("Travelling to Hogwarts with " + noOfPassengers + " wizards");
        System.out.println("\n*****************************************************\n");

    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    @Override
    public String toString() {
        return "Train => " + "\nnoOfPassengers: " + noOfPassengers + "\nType: " + TYPE;
    }

}
