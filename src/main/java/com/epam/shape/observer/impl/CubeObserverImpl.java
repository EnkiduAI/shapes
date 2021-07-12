package com.epam.shape.observer.impl;

import com.epam.shape.entity.CubeEntity;
import com.epam.shape.entity.CubeParameter;
import com.epam.shape.entity.Warehouse;
import com.epam.shape.observer.CubeEvent;
import com.epam.shape.observer.CubeObserver;
import com.epam.shape.service.impl.CubeServiceImpl;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CubeObserverImpl implements CubeObserver {
    private static Logger logger = LogManager.getLogger();

    @Override
    public void parametersChange(CubeEvent event) {
        Warehouse cubeWarehouse = Warehouse.getInstance();
        var cubeService = new CubeServiceImpl();
        CubeEntity cube = event.getSource();
        int cubeId = cube.getId();

        double perimeter = cubeService.perimeter(cube);
        double area = cubeService.area(cube);
        double volume = cubeService.volume(cube);
        cubeWarehouse.put(cubeId,perimeter,area,volume);

    }
}
