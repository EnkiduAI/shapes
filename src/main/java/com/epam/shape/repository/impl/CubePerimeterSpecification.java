package com.epam.shape.repository.impl;

import com.epam.shape.entity.CubeEntity;
import com.epam.shape.repository.CubeSpecification;
import com.epam.shape.service.CubeService;
import com.epam.shape.service.impl.CubeServiceImpl;

public class CubePerimeterSpecification implements CubeSpecification {
    private double fromPerimeter;
    private double toPerimeter;

    public CubePerimeterSpecification(double fromPerimeter, double toPerimeter) {
        this.fromPerimeter = fromPerimeter;
        this.toPerimeter = toPerimeter;
    }


    @Override
    public boolean specify(CubeEntity cube) {
        CubeService service = new CubeServiceImpl();
        return service.perimeter(cube) >= fromPerimeter && service.perimeter(cube) <= toPerimeter;
    }
}
