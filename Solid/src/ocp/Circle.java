package ocp;

public class Circle extends Figure {
	 private double radius;
	  public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double getArea() {
	    	 return Math.round(Math.PI * radius * radius * 10.0) / 10.0; 
	    }
    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }
    @Override
    public String toXML() {
        return "<Circle>\n" +
               "    <Radius>" + radius + "</Radius>\n" +
               "    <Area>" + getArea() + "</Area>\n" +
               "</Circle>";
    }

    @Override
    public String toCSS() {
        return ".circle { border-radius: " + radius + "px; }\n";
    }
}
