package ocp;

public class Diamond extends Figure {
	  private double diagonala1;
	    private double diagonala2;
	    public Diamond(double diagonala1, double diagonala2) {
	        this.diagonala1 = diagonala1;
	        this.diagonala2 = diagonala2;
	    }
	    public double getArea() {
	        return (diagonala1 * diagonala2) / 2;
	    }
	    
    @Override
    public void draw() {
        System.out.println("Diamond drawn");
    }
    @Override
    public String toXML() {
        return "<Diamond>\n" +
               "    <Diagonal1>" + diagonala1 + "</Diagonal1>\n" +
               "    <Diagonal2>" + diagonala2 + "</Diagonal2>\n" +
               "    <Area>" + getArea() + "</Area>\n" +
               "</Diamond>";
    }

    @Override
    public String toCSS() {
        return ".diamond { width: " + diagonala1 + "px; height: " + diagonala2 + "px; transform: rotate(45deg); }\n";
    }
}