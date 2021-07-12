package com.epam.shape.entity;

public class CubeParameter {
    private double perimeter;
    private double area;
    private double volume;


    @Override
    public CubeParameter clone() {
        CubeParameter parameter = null;

        try {
            parameter = (CubeParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return parameter;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CubeParameter that = (CubeParameter) o;

        if (Double.compare(that.perimeter, perimeter) != 0) return false;
        if (Double.compare(that.area, area) != 0) return false;
        return Double.compare(that.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(perimeter);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CubeParameters: ");
        sb.append("perimeter = ").append(perimeter);
        sb.append(", area = ").append(area);
        sb.append(", volume = ").append(volume);
        return sb.toString();
    }
}
