package ocp;

public class Proba {
	public static void main(String[] args) {
        Sheet sheet = new Sheet();
        
        Square square = new Square(5);  
        Circle circle = new Circle(3);  
        Diamond diamond = new Diamond(4, 6);
        Line line = new Line(10);

        sheet.addFigure(square);
        sheet.addFigure(circle);
        sheet.addFigure(diamond);
        sheet.addFigure(line);
        
        sheet.drawFigures();  
        System.out.println("Karratuaren azalaera: " + square.getArea() + " da");
        System.out.println("Zirkunferentziaren azalera: " + circle.getArea()+" da");
        System.out.println("Diamantearen azalera: " + diamond.getArea()+" da");
      
        System.out.println("\nXML Errepresentazioa:");
        System.out.println(sheet.toXML());
        
        System.out.println("\nCSS Errepresentazioa:");
        System.out.println(sheet.toCSS());
	}
}


