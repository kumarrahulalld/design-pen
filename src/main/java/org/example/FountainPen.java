package org.example;

public class FountainPen extends Pen{


    public FountainPen(PenType penType)
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
