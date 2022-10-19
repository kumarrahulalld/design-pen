package org.example;

public class Marker extends Pen{

    public Marker(PenType penType)
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
