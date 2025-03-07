/*
 * Name: Bhoomika Kapde
 * PRN: 23070126025
 * Batch: 2023-27
 * Program: Menu-driven program to calculate Area and Volume of different shapes
 */

 import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Shape shape = null;
         int choice;
         
         do {
             System.out.println("\n--- Shape Calculator Menu ---");
             System.out.println("1. Circle");
             System.out.println("2. Rectangle");
             System.out.println("3. Square");
             System.out.println("4. Sphere");
             System.out.println("5. Cylinder");
             System.out.println("6. Equilateral Pyramid");
             System.out.println("7. Exit");
             System.out.print("Enter your choice: ");
             choice = sc.nextInt();
 
             switch (choice) {
                 case 1:
                     System.out.print("Enter radius: ");
                     double radius = sc.nextDouble();
                     shape = new Circle(radius);
                     break;
                 case 2:
                     System.out.print("Enter length and breadth: ");
                     double length = sc.nextDouble();
                     double breadth = sc.nextDouble();
                     shape = new Rectangle(length, breadth);
                     break;
                 case 3:
                     System.out.print("Enter side: ");
                     double side = sc.nextDouble();
                     shape = new Square(side);
                     break;
                 case 4:
                     System.out.print("Enter radius: ");
                     radius = sc.nextDouble();
                     shape = new Sphere(radius);
                     break;
                 case 5:
                     System.out.print("Enter radius and height: ");
                     radius = sc.nextDouble();
                     double height = sc.nextDouble();
                     shape = new Cylinder(radius, height);
                     break;
                 case 6:
                     System.out.print("Enter base side and height: ");
                     side = sc.nextDouble();
                     height = sc.nextDouble();
                     shape = new EquilateralPyramid(side, height);
                     break;
                 case 7:
                     System.out.println("Exiting program...");
                     break;
                 default:
                     System.out.println("Invalid choice. Try again.");
                     continue;
             }
 
             if (shape != null) {
                 shape.calculateShape();
                 shape.calculatePerimeter();
                 if (shape instanceof Volume) {
                     ((Volume) shape).calculateVolume();
                 }
             }
 
         } while (choice != 7);
 
         sc.close();
     }
 }
 