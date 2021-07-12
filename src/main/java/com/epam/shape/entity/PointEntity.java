package com.epam.shape.entity;

public class PointEntity {
    private double x;
    private double y;
    private double z;

    public PointEntity(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PointEntity pointEntity = (PointEntity) o;
        return x == pointEntity.x && y == pointEntity.y && z == pointEntity.z;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("x: ")
                .append(x)
                .append(", y: ")
                .append(y)
                .append(", z: ")
                .append(z);
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        double result = 1;
        result = result * 31 + Double.hashCode(x);
        result = result * 31 + Double.hashCode(y);
        result = result * 31 + Double.hashCode(z);
        return (int) result;


    }
}
