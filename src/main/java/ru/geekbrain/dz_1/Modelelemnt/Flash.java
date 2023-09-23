package ru.geekbrain.dz_1.Modelelemnt;

import java.util.List;

public class Flash {

private Point3D location;
private Angle3D angle;
private float power;
private Color color;

    public void Rotate(Angle3D angleAction) {

    }
    public void Move(Angle3D angleAction) {

    }

    public Flash(Point3D location, Angle3D angle, float power, Color color) {
        this.location = location;
        this.angle = angle;
        this.power = power;
        this.color = color;
    }

    public Flash(){

    }


}
