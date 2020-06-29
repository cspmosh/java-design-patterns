package StructuralPatterns.BridgePattern;

interface Renderer {
    public String whatToRenderAs();
}

class VectorRenderer implements Renderer {
    @Override
    public String whatToRenderAs() {
        return "lines";
    }
}

class RastorRenderer implements Renderer {
    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
}

abstract class Shape
{
    private Renderer renderer;

    public Shape(Renderer renderer){
        this.renderer = renderer;
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", getName(), renderer.whatToRenderAs());
    }

    public abstract String getName();
}

class Triangle extends Shape
{

    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName()
    {
        return "Triangle";
    }
}

class Square extends Shape
{

    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName()
    {
        return "Square";
    }
}


// imagine VectorTriangle and RasterTriangle are here too