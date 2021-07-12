package com.epam.shape.entity;


import com.epam.shape.observer.CubeEvent;
import com.epam.shape.observer.CubeObserver;
import com.epam.shape.observer.Observable;
import com.epam.shape.observer.impl.CubeObserverImpl;
import com.epam.shape.utils.IdGenerator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CubeEntity implements Observable {
    private int id;
    private PointEntity center;
    private double side;
    private CubeObserver observer = new CubeObserverImpl();
    private static Logger logger = LogManager.getLogger();

    public CubeEntity(PointEntity center, double side) {
        this.id = IdGenerator.generateId();
        this.center = center;
        this.side = side;
    }


    public int getId() {
        return id;
    }

    public PointEntity getCenter() {
        return center;
    }

    public double getSide() {
        return side;
    }

    public void setCenter(PointEntity center) {
        this.center = center;
        notifyObserver();
    }

    public void setSide(double side) {
        this.side = side;
        notifyObserver();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CubeEntity that = (CubeEntity) o;
        return id == that.id && Double.compare(that.side, side) == 0 && center.equals(that.center);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cube: ");
        sb.append(", id = ").append(id);
        sb.append(", center point = ").append(center.toString());
        sb.append(", side = ").append(side);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        long temp;
        result = prime * result + id;
        result = prime * result + (center == null ? 0 : center.hashCode());
        temp = Double.doubleToLongBits(side);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;


    }

    @Override
    public void attach(CubeObserver observer) {
        this.observer = observer;
    }

    @Override
    public void detach() {
        this.observer = null;
    }

    @Override
    public void notifyObserver() {
        if (observer == null) {
            logger.log(Level.INFO, "Observer is null");
            return;
        }
        var cubeEvent = new CubeEvent(this);
        observer.parametersChange(cubeEvent);
    }
}
