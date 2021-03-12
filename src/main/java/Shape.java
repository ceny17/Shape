public abstract class Shape {
    public abstract void nameShape();
}

class Circle extends Shape {
    private final String circle = "Circle";
    @Override
    public void nameShape() {
        System.out.println(circle);
    }
}

class Quad extends Shape {
    private final String quad = "Quad";
    @Override
    public void nameShape() {
        System.out.println(quad);
    }
}

class Octagon extends Shape {
    private final String octagon = "Octagon";
    @Override
    public void nameShape() {
        System.out.println(octagon);
    }
}

class Pentagon extends Shape {
    private final String pentagon = "Pentagon";
    @Override
    public void nameShape() {
        System.out.println(pentagon);
    }
}

class Triangle extends Shape {
    private final String triangle = "Triangle";
    @Override
    public void nameShape() {
        System.out.println(triangle);
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape octagon = new Octagon();
        Shape pentagon = new Pentagon();
        Shape triangle = new Triangle();
        circle.nameShape();
        quad.nameShape();
        octagon.nameShape();
        pentagon.nameShape();
        triangle.nameShape();
    }
}