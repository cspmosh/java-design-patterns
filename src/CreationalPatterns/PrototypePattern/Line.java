package CreationalPatterns.PrototypePattern;

class Point
{
    public int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + String.format("%s, %s", x, y) + ")";
    }
}

class Line
{
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy()
    {
        return new Line(new Point(start.x, start.y), new Point (end.x, end.y));
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return "Line{" + newline +
                "  start: " + start.toString() + newline +
                "  end: " + end.toString() + newline +
                "}";
    }
}