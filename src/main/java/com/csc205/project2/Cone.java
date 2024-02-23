package com.csc205.project2;

/*
Create a java class named "Cone" that extends another class
names "Shape" and generates the volume and surfaceArea methods
for the cone shape.
 */
public class Cone implements ThreeDimensionalShape {

    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Getters and Setters for height and radius
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculating volume of the cone
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    // Calculating surface area of the cone
    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();

    }
}
