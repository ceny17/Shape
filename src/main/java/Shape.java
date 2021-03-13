public abstract class Shape {
    public abstract String nameShape();
}

class Circle extends Shape {
    private final String circle = "Circle";
    @Override
    public String nameShape() {
        return circle;
    }
}

class Quad extends Shape {
    private final String quad = "Quad";
    @Override
    public String nameShape() {
        return quad;
    }
}

class Octagon extends Shape {
    private final String octagon = "Octagon";
    @Override
    public String nameShape() {
        return octagon;
    }
}

class Pentagon extends Shape {
    private final String pentagon = "Pentagon";
    @Override
    public String nameShape() {
        return pentagon;
    }
}

class Triangle extends Shape {
    private final String triangle = "Triangle";
    @Override
    public String nameShape() {
        return triangle;
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape octagon = new Octagon();
        Shape pentagon = new Pentagon();
        Shape triangle = new Triangle();

        System.out.println(circle.nameShape());
        System.out.println(quad.nameShape());
        System.out.println(octagon.nameShape());
        System.out.println(pentagon.nameShape());
        System.out.println(triangle.nameShape());
    }
}