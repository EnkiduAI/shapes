package com.epam.shape.observer;

public interface Observable {
    void attach(CubeObserver observer);
    void detach();
    void notifyObserver();
}
