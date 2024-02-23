package com.csc205.project2;

public class Cylinder extends Shape {

    private double height;
    private double radius;

    public Cylinder(){
        height = 0.0;
        radius = 0.0;
    }

    public Cylinder(double Height, double Radius)
    {
        height = Height;
        radius = Radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double Height) {
        height = Height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double Radius) {
        radius = Radius;
    }
    public double surfaceArea() {
        double surfaceArea = ((2.0 * Math.PI) * (radius * height)) + ((2.0 * Math.PI) * (Math.pow(radius, 2.0)));
        return surfaceArea;
    }

    public double volume() {
        double volume = ((Math.PI * height) * (Math.pow(radius, 2.0)));
        return volume;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();

    }

}
