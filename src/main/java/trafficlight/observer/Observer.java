package trafficlight.observer;

import trafficlight.subject.Subject;

public interface Observer {
    void update(Subject s);
}
