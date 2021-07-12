package com.epam.shape.repository.impl;

import com.epam.shape.entity.CubeEntity;
import com.epam.shape.repository.CubeSpecification;

public class IdTriangleSpecification implements CubeSpecification {
    private int fromId;
    private int toId;

    public IdTriangleSpecification(int fromId, int toId) {
        this.fromId = fromId;
        this.toId = toId;
    }

    @Override
    public boolean specify(CubeEntity cube) {
        boolean result = false;

        if (cube == null){
            return result;
        }

        result = cube.getId() >= fromId && cube.getId() <= toId;
        return result;
    }
}
