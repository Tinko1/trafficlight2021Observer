package trafficlight.gui;


import trafficlight.observer.Observer;
import trafficlight.subject.Subject;

import java.awt.*;

public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }


    @Override
    public void update(Subject s) {
        if (isOn) turnOn(false);
        else turnOn(true);
    }

    //TODO implement a part of the pattern here
}
