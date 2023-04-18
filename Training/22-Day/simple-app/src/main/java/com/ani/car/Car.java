package com.ani.car;

public class Car {
    private int speed;

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * It increases the speed.
     * @param sp speed by which car should move.
     */
    public void speedUp(int sp) {
        this.speed = sp;
    }
}
