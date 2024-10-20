package ocp;

public class Line extends Figure {
    private double length;

    public Line(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0;  // Lerroak ez du azalera
    }

    @Override
    public void draw() {
        System.out.println("Line drawn with length: " + length);
    }

    @Override
    public String toXML() {
        return "<Line>\n" +
               "    <Length>" + length + "</Length>\n" +
               "</Line>";
    }

    @Override
    public String toCSS() {
        return ".line { width: " + length + "px; height: 1px; background-color: black; }\n";
    }
}

