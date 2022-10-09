package com.classmethods.processing.sketches;


import math.Vector;
import processing.core.PApplet;

public class Main extends PApplet {
    private Planet Sun;
    private Planet Earth;
    private Planet Mercury;
    private Planet Mars;
    public static PApplet applet;
    StarDrawer starDrawer;

    public void settings() {
        applet = this;
        size(600, 600);
    }

    public void setup() {
        starDrawer = new StarDrawer();

        colorMode(HSB);
        noStroke();

        Sun = new Planet(100, 50, 38,
                new Vector(300,300), new Vector(0,0), null);

        Earth = new Planet(0.8f, 11, 160,
                new Vector(120,300), new Vector(0,-2), Sun);

        Mercury = new Planet(0.6f, 10, 20,
                new Vector(200,300), new Vector(0,-2.5f), Sun);

        Mars = new Planet(1, 6, 0,
                new Vector(100,300), new Vector(0,-2.25f), Sun);

    }

    public void draw() {
        fill(0,0,0,20);
        rect(0,0,width,height);
        starDrawer.drawStars();

        Sun.drawSelf();
        Earth.drawSelf();
        Mercury.drawSelf();
        Mars.drawSelf();

        Sun.move();
        Earth.move();
        Mercury.move();
        Mars.move();

    }

    public static void main(String... args) {
        PApplet.main("com.classmethods.processing.sketches.Main");
    }
}