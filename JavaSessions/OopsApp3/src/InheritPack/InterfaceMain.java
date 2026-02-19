package InheritPack;

//Define an interface named Shape
interface Shapes{
 
 // Abstract method for calculating the area
 double calculateArea(); 
}

//Implement the interface 
//in a class named Circle
class Circles implements Shapes{
 
 private double r;

 // Constructor for Circle
 public Circles(double r){ 
     
   this.r = r; 
 }

 // Implementing the abstract method 
 // from the Shape interface
 public double calculateArea()
 {
     return Math.PI * r * r;
 }
}

//Implement the interface in a 
//class named Rectangle
class Rectangles implements Shapes{
 
 private double length;
 private double width;

 // Constructor for Rectangle
 public Rectangles(double length, double width){
     
     this.length = length;
     this.width = width;
 }

 // Implementing the abstract 
 // method from the Shape interface
 public double calculateArea() { 
   return length * width; 
 }
}

public class InterfaceMain {
 public static void main(String[] args) {

     // Reference type is the interface (Shape)
     Shapes cir = new Circles(5.0);
     Shapes rect = new Rectangles(4.0, 6.0);

     // Dynamic method dispatch — decides which method to call at runtime
     System.out.println("Area of Circle: " + cir.calculateArea());
     System.out.println("Area of Rectangle: " + rect.calculateArea());
 }
}
