package com.epam.shape.repository.impl;

import com.epam.shape.entity.CubeEntity;
import com.epam.shape.repository.CubeSpecification;
import com.epam.shape.service.CubeService;
import com.epam.shape.service.impl.CubeServiceImpl;

public class CubeVolumeSpecification implements CubeSpecification {
    private double fromVolume;
    private double toVolume;

    public CubeVolumeSpecification(double fromVolume, double toVolume) {
        this.fromVolume = fromVolume;
        this.toVolume = toVolume;
    }


    @Override
    public boolean specify(CubeEntity cube) {
        CubeService service = new CubeServiceImpl();
        return service.volume(cube) >= fromVolume && service.volume(cube) <= toVolume;
    }
}
