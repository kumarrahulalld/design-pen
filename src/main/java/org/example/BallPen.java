package org.example;

public class BallPen extends Pen{

    public BallPen(PenType penType)
    {
        super(penType);
    }
    @Override
    public void write() {

    }

    @Override
    public Colour getColour() {
        return null;
    }
}
