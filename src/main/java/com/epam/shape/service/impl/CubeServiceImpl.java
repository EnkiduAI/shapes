package com.epam.shape.service.impl;

import com.epam.shape.entity.CubeEntity;
import com.epam.shape.service.CubeService;

public class CubeServiceImpl implements CubeService {


    @Override
    public double area(CubeEntity cube) {
        return Math.pow(cube.getSide(), 2) * 6;
    }

    @Override
    public double perimeter(CubeEntity cube) {
        return 12 * cube.getSide();
    }

    @Override
    public double volume(CubeEntity cube) {
        return Math.pow(cube.getSide(), 3);
    }
}
