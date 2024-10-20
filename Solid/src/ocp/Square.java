package ocp;

public class Square extends Figure {
	private double side;
	 public Square(double side) {
	        this.side = side;
	    }
	    @Override
	    public double getArea() {
	        return side * side;
	    }
    @Override
    public void draw() {
        System.out.println("Square drawn");
    }
    @Override
    public String toXML() {
        return "<Square>\n" +
               "    <Side>" + side + "</Side>\n" +
               "    <Area>" + getArea() + "</Area>\n" +
               "</Square>";
    }

    @Override
    public String toCSS() {
        return ".square { width: " + side + "px; height: " + side + "px; }\n";
    }
}
