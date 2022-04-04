package trafficlight.states;

//TODO implement a part of the pattern here

import trafficlight.subject.Subject;

public abstract class State extends Subject {

    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }

}