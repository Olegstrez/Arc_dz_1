package ru.geekbrain.dz_1.Modelelemnt;

public class Point3D {
    private double x;
    private double y;
    private double z;;

    public double getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }



    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


}
