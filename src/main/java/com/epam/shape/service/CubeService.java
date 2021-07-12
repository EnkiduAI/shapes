package com.epam.shape.service;

import com.epam.shape.entity.CubeEntity;

public interface CubeService {
    double area(CubeEntity cube);

    double perimeter(CubeEntity cube);

    double volume(CubeEntity cube);

}
