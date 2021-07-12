package com.epam.shape.factory;

import com.epam.shape.entity.CubeEntity;
import com.epam.shape.entity.PointEntity;

import java.util.ArrayList;
import java.util.List;


public class CubeFactory {
    public CubeEntity createCube(PointEntity centerPoint, double sideOfCube) {
        return new CubeEntity(centerPoint, sideOfCube);
    }

    public CubeEntity createCube(double x, double y, double z, double sideOfCube) {
        PointEntity centerPoint = new PointEntity(x, y, z);
        return new CubeEntity(centerPoint, sideOfCube);
    }

    public CubeEntity createCube(double[] array) {
        PointEntity centerPoint = new PointEntity(array[0], array[1], array[2]);
        return new CubeEntity(centerPoint, array[3]);
    }

    public List<CubeEntity> createCubeList(List<double[]> parameterList) {
        List<CubeEntity> cubeList = new ArrayList<>();
        for (double[] parameter : parameterList) {
            PointEntity centerPoint = new PointEntity(parameter[0], parameter[1], parameter[2]);
            CubeEntity cube = new CubeEntity(centerPoint, parameter[3]);
            cubeList.add(cube);
        }
        return cubeList;
    }
}
