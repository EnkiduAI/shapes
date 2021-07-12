package com.epam.shape.repository.impl;

import com.epam.shape.entity.CubeEntity;
import com.epam.shape.repository.CubeSpecification;
import com.epam.shape.service.CubeService;
import com.epam.shape.service.impl.CubeServiceImpl;

public class CubeAreaSpecification implements CubeSpecification {
    private double fromArea;
    private double toArea;
    private final static double NULL_AREA = 0;

    public CubeAreaSpecification(double fromArea, double toArea) {
        this.fromArea = fromArea;
        this.toArea = toArea;
    }


    @Override
    public boolean specify(CubeEntity cube) {
        CubeService service = new CubeServiceImpl();
        return service.area(cube) >= fromArea &&  service.area(cube) <= toArea;
    }
}
