package ocp;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet {
	 Vector<Figure> figures = new Vector<>();

	  public void addFigure(Figure f) {
	        figures.add(f);
	    }
	  public double getTotalArea() {
	        double totalArea = 0;
	        for (Figure f : figures) {
	            totalArea += f.getArea();
	        }
	        return totalArea;
	    }

	  public void drawFigures() {
	        Enumeration<Figure> eFigures = figures.elements();
	        Figure f;
	        while (eFigures.hasMoreElements()) {
	            f = eFigures.nextElement();
	            f.draw();  
	        }
	    }
	  public String toXML() {
	        StringBuilder xmlBuilder = new StringBuilder();
	        xmlBuilder.append("<Sheet>\n");
	        for (Figure figure : figures) {
	            xmlBuilder.append(figure.toXML()).append("\n");
	        }
	        xmlBuilder.append("</Sheet>");
	        return xmlBuilder.toString();
	    }

	    public String toCSS() {
	        StringBuilder cssBuilder = new StringBuilder();
	        for (Figure figure : figures) {
	            cssBuilder.append(figure.toCSS());
	        }
	        return cssBuilder.toString();
	    }
	  
}
