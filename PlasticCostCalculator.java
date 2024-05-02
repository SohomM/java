import java.util.*;
//import java.lang ;
import java.io.*;
import java.util.Scanner;

class TwoD {
double length;
double breadth;

    TwoD(double length, double breadth) {
    length = length;
   breadth = breadth; }

double area() {
        return length * breadth; } }

class ThreeD extends TwoD {
    double height;

ThreeD(double length, double breadth, double height) {
        super(length, breadth);
        height = height;
}
double volume() { return area() * height; } }

class PlasticCostCalculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

   System.out.println("Enter dimensions for 2D sheet (length and breadth):");
    double length2D = scanner.nextDouble();
  double breadth2D = scanner.nextDouble();

 System.out.println("Enter dimensions for 3D box (length, breadth, and height):");
   double length3D = scanner.nextDouble();
    double breadth3D = scanner.nextDouble();
   double height3D = scanner.nextDouble();

 TwoD sheet = new TwoD(length2D, breadth2D);
 ThreeD box = new ThreeD(length3D, breadth3D, height3D);

double costSheet = sheet.area() * 40; 
 double costBox = box.volume() * 60;   

System.out.println("Cost of 2D sheet: Rs " + costSheet);
System.out.println("Cost of 3D box: Rs " + costBox); 
} }

