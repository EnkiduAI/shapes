package com.epam.shape.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Warehouse {

    private final static Logger logger = LogManager.getLogger(Warehouse.class);
    private static Warehouse instance;
    private Map<Integer, CubeParameter> map;

    public static Warehouse getInstance() {
        if (instance == null) {
            logger.info("creating warehouse");
            instance = new Warehouse();
        }
        return instance;
    }

    private Warehouse() {
        this.map = new HashMap<>();
    }

    public Optional<CubeParameter> get(int id) {
        CubeParameter entity = map.get(id);
        return entity != null ? Optional.of(entity) : Optional.empty();
    }

    public void put(int id, double perimeter, double area, double volume) {
        CubeParameter parameter = map.containsKey(id) ? map.get(id) : new CubeParameter();
        parameter.setPerimeter(perimeter);
        parameter.setArea(area);
        parameter.setVolume(volume);

        map.put(id, parameter);
    }

    public void remove(int id){
        map.remove(id);
    }
}
