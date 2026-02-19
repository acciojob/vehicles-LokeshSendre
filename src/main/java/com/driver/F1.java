package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        // using arbitrary values as required
        super(name, 4, 2, 6, isManual, "F1", 1);
    }

    public void accelerate(int rate){
        // calculate new speed
        int newSpeed = getCurrentSpeed() + rate;

        // prevent negative speed
        if(newSpeed < 0) {
            newSpeed = 0;
        }

        int newGear;

        if(newSpeed == 0) {
            newGear = 1;
            changeGear(newGear);
            stop();
            return;
        }
        else if(newSpeed <= 50) newGear = 1;
        else if(newSpeed <= 100) newGear = 2;
        else if(newSpeed <= 150) newGear = 3;
        else if(newSpeed <= 200) newGear = 4;
        else if(newSpeed <= 250) newGear = 5;
        else newGear = 6;

        // change gear
        changeGear(newGear);

        // update speed and direction
        changeSpeed(newSpeed, getCurrentDirection());
    }
}
