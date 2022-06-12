package com.company;

public class Robot{
    class Leg implements Runnable {
        private final String name;
        private final boolean leg;
        Leg(String name, boolean leg) {
            this.name = name;
            this.leg = leg;
        }
        @Override
        public void run() {
            while(true) {
                if (leg == currentLeg) {
                    step();
                    currentLeg = !leg;
                    Thread.yield();
                }
            }
        }
        private void step() {
            System.out.println(name);
        }
    }
    boolean currentLeg = true;
    Leg left = new Leg("LEFT", false);
    Leg right = new Leg("RIGHT", true);
    void run() {
        new Thread(left).start();
        new Thread(right).start();
    }
    public Robot() {
        System.out.println("Robot:");
    }
}