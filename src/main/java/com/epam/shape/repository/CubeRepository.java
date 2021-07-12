package com.epam.shape.repository;

import com.epam.shape.entity.CubeEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CubeRepository {

    private List<CubeEntity> cubes = new ArrayList<>();

    public boolean add(CubeEntity cube) {
        return cubes.add(cube);
    }

    public boolean addAll(List<CubeEntity> cubeList) {
        return cubes.addAll(cubeList);
    }

    public void clear() {
        cubes.clear();
    }

    public boolean contains(CubeEntity cube) {
        return cubes.contains(cube);
    }

    public CubeEntity get(int index) {
        return cubes.get(index);
    }

    public int indexOf(CubeEntity cube) {
        return cubes.indexOf(cube);
    }

    public boolean remove(CubeEntity cube) {
        return cubes.remove(cube);
    }

    public CubeEntity remove(int index) {
        return cubes.remove(index);
    }

    public CubeEntity set(int index, CubeEntity cube) {
        return cubes.set(index, cube);
    }

    public int size() {
        return cubes.size();
    }

    public List<CubeEntity> query (CubeSpecification cubeSpecification){
        return cubes.stream().filter(cubeSpecification :: specify).collect(Collectors.toList());
    }

    public List<CubeEntity> sort (Comparator<? super CubeEntity> comparator){
        List<CubeEntity> CubeClone = new ArrayList<>(cubes);
        CubeClone.sort(comparator);
        return CubeClone;
    }

    public boolean equals (Object o){
        return cubes.equals(o);
    }

    public int hashCode(){
        return cubes.hashCode();
    }

}
