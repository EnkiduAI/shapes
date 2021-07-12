package com.epam.shape.comparator;

import com.epam.shape.entity.CubeEntity;

import java.util.Comparator;

public enum CubeComparator implements Comparator<CubeEntity> {
    ID {
        @Override
        public int compare(CubeEntity o1, CubeEntity o2) {
            return Integer.compare(o1.getId(), o2.getId());
        }
    },
    POINT {
        @Override
        public int compare(CubeEntity o1, CubeEntity o2) {
            return Double.compare(o1.getCenter().getX(), o2.getCenter().getX())
                    + Double.compare(o1.getCenter().getY(), o2.getCenter().getY())
                    + Double.compare(o1.getCenter().getZ(), o2.getCenter().getZ());
        }
    },
    SIDE {
        @Override
        public int compare(CubeEntity o1, CubeEntity o2) {
            return Double.compare(o1.getSide(), o2.getSide());
        }
    }
}

