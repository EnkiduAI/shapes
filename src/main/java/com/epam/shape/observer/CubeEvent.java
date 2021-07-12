package com.epam.shape.observer;

import com.epam.shape.entity.CubeEntity;

import java.util.EventObject;

public class CubeEvent extends EventObject {
    public CubeEvent(CubeEntity source) {
        super(source);
    }

    @Override
    public CubeEntity getSource() {
        return (CubeEntity) super.getSource();
    }
}
