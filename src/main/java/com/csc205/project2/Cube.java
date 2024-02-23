package com.csc205.project2;

public class Cube implements ThreeDimensionalShape {
    private double width;

    public Cube() {
        width = 0.0;
    }

    public Cube(double Width) {
        width = Width;
    }

    public double getWidth() {
        return width;
    }

    public void setwidth(double Width) {
        width = Width;
    }

    public double surfaceArea() {
        double surfaceArea = 6.0 * Math.pow(width, 2.0);
        return surfaceArea;
    }

    public double volume() {
        double volume = Math.pow(width, 3.0);
        return volume;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');

        return sb.toString();
    }
}
