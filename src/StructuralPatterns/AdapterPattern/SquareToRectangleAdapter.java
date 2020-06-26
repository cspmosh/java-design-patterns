package StructuralPatterns.AdapterPattern;

class Square
{
    public int side;

    public Square(int side)
    {
        this.side = side;
    }
}

interface Rectangle
{
    int getWidth();
    int getHeight();

    default int getArea()
    {
        return getWidth() * getHeight();
    }
}

class SquareToRectangleAdapter implements Rectangle
{

    private Square square;

    @Override
    public int getWidth() {
        return square.side;
    }

    @Override
    public int getHeight() {
        return square.side;
    }

    public SquareToRectangleAdapter(Square square)
    {
        this.square = square;
    }
}