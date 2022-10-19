package org.example;

public class GelPen extends Pen{

    public GelPen(PenType penType)
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
