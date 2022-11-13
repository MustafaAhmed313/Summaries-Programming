//Main_program
import java.util.Scanner;
public class AreaShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char shapename;
        double length , width , l1 ,l2 ,l3 , a1 ,a2 ,a3 ,h , d = 90.00;
        boolean exit;
        System.out.println("S -->> Square");
        System.out.println("R -->> Rectangle");
        System.out.println("T -->> Triangle");
        System.out.println("C -->> Circle");
        System.out.println("if you want to exit enter 'e' or 'E'");   
        System.out.println("Choose Your Shape From The List : ");
        shapename = input.next().charAt(0); 
        switch (shapename){
            case 's':
            case 'S':
            {
                Square s1 = new Square();
                s1.setName("Square");
                System.out.println("Enter the length of square : ");
                length = input.nextDouble();
                s1.setLength(length);
                s1.setDiameter();
                s1.setCircumference();
                s1.setArea();
                s1.Display();
                break;
            }
            case 'r':
            case 'R':
            {
                Rectangle r1 = new Rectangle();
                r1.setName("Rectangle");
                System.out.println("Enter the length of Rectangle : ");
                length = input.nextDouble();
                System.out.println("Enter the width of Rectangle : ");
                width = input.nextDouble();
                r1.setLength(length);
                r1.setWidth(width);
                r1.setDiameter();
                r1.setCircumference();
                r1.setArea();
                r1.Display();
                break;
            }    
            case 't':
            case 'T':
            {
                Triangle t1 = new Triangle();
                t1.setName("Triangle");
                System.out.println("Enter the length1,2,3 of triangle : ");
                l1 = input.nextDouble();
                l2 = input.nextDouble();
                l3 = input.nextDouble();
                t1.setLength1(l1);
                t1.setLength2(l2);
                t1.setLength3(l3);
                t1.setCircumference();
                System.out.println("Enter the angle1,2,3 of triangle : ");
                a1 = input.nextDouble();
                a2 = input.nextDouble();
                a3 = input.nextDouble();
                t1.setAngle1(a1);
                t1.setAngle2(a2);
                t1.setAngle3(a3);
                System.out.println("Enter the height of triangle : ");
                h = input.nextDouble();
                t1.setHeight(h);
                t1.setArea();
                t1.Display();
                break;
            }    
            case 'c':
            case 'C':
            {
                Circle c1 = new Circle();
                c1.setName("Circle");
                System.out.println("Enter the diameter of circle : ");
                d = input.nextDouble();
                c1.setDiameter(d);
                c1.setRadius(d);
                c1.setCircumference();
                c1.setArea();
                c1.Display();
                break;
            }   
            case 'e':
            case 'E':
            {
                System.out.println("Enter true or false if you agree with exist condition : ");
                exit = input.nextBoolean();
                    if(exit == true)
                        break;
            }
                
            default :
            {
                System.out.println("you entered an invalid value \n please come back and try another input");
                break;        
            }
        }       
    }
}
//Super_class
class Shape {
    protected String Name;    
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
}
//Sub_class1
class Square extends Shape {
    protected double Length;
    protected double Area;
    protected double Circumference;
    protected double Diameter;
    protected int Angle = 90;
    public double getDiameter() {
        return Diameter;
    }
    public void setDiameter() {
        this.Diameter = Length * 1.414213;
    }
    public double getLength() {
        return Length;
    }
    public void setLength(double Length) {
        this.Length = Length;
    }
    public double getArea() {
        return Area;
    }
    public void setArea() {
        this.Area = Length * Length;
    }
    public double getCircumference() {
        return Circumference;
    }
    public void setCircumference() {
        this.Circumference = Length * 4;
    }
    public void Display (){
        System.out.println("Name : " + this.getName());
        System.out.println("Lenght : " + this.getLength() + 'm');
        System.out.println("Diameter : " + this.getDiameter() + 'm');
        System.out.println("Angle : " + Angle + "deg");
        System.out.println("circumference : " + this.getCircumference() + 'm');
        System.out.println("Area : " + this.getArea() + "m squared");
    }
}
//Sub_class2
class Rectangle extends Shape {
    protected double Length;
    protected double Width;
    protected double Area;
    protected double Circumference;
    protected double Diameter;
    protected int Angle = 90;
    public double getLength() {
        return Length;
    }
    public void setLength(double Length) {
        this.Length = Length;
    }
    public double getWidth() {
        return Width;
    }
    public void setWidth(double Width) {
        this.Width = Width;
    }
    public double getArea() {
        return Area;
    }
    public void setArea() {
        this.Area = Length * Width;
    }
    public double getCircumference() {
        return Circumference;
    }
    public void setCircumference() {
        this.Circumference = (Length + Width) * 2;
    }
    public double getDiameter() {
        return Diameter;
    }
    public void setDiameter() {
        this.Diameter = Math.sqrt((Length * Length) + (Width *Width));
    }
    public void Display (){
        System.out.println("Name : " + this.getName());
        System.out.println("Lenght : " + this.getLength() + 'm');
        System.out.println("Width : " + this.getWidth() + 'm');
        System.out.println("Diameter : " + this.getDiameter() + 'm');
        System.out.println("Angle : " + Angle + "deg");
        System.out.println("circumference : " + this.getCircumference() + 'm');
        System.out.println("Area : " + this.getArea() + "m squared");
    }
}
//Sub_class3
class Triangle extends Shape {
    protected double Length1;
    protected double Length2;
    protected double Length3;
    protected double Height;
    protected double Angle1;
    protected double Angle2;
    protected double Angle3;
    protected double Area;
    protected double Circumference;
    public double getLength1() {
        return Length1;
    }
    public void setLength1(double Length1) {
        this.Length1 = Length1;
    }
    public double getLength2() {
        return Length2;
    }
    public void setLength2(double Length2) {
        this.Length2 = Length2;
    }
    public double getLength3() {
        return Length3;
    }
    public void setLength3(double Length3) {
        this.Length3 = Length3;
    }
    public double getHeight() {
        return Height;
    }
    public void setHeight(double Height) {
        this.Height = Height;
    }
    public double getAngle1() {
        return Angle1;
    }
    public void setAngle1(double Angle1) {
        this.Angle1 = Angle1;
    }
    public double getAngle2() {
        return Angle2;
    }
    public void setAngle2(double Angle2) {
        this.Angle2 = Angle2;
    }
    public double getAngle3() {
        return Angle3;
    }
    public void setAngle3(double Angle3) {
        this.Angle3 = Angle3;
    }
    public double getArea() {
        return Area;
    }
    public void setArea() {
        this.Area = (Length1 * Height) / 2;
    }
    public double getCircumference() {
        return Circumference;
    }
    public void setCircumference() {
        this.Circumference = Length1 + Length2 + Length3;
    }
    public void Display (){
        System.out.println("Name : " + this.getName());
        System.out.println("Lenght1 : " + this.getLength1() + "m \t Lenght1 : " + this.getLength2() + "m \t Lenght1 : " + this.getLength3() + 'm');
        System.out.println("Height : " + this.getHeight() + 'm');
        System.out.println("Angle1 : " + this.getAngle1() + "deg \t Angle2 : " + this.getAngle2() + "deg \t Angle3 : " + this.getAngle3() + "deg");
        System.out.println("circumference : " + this.getCircumference() + 'm');
        System.out.println("Area : " + this.getArea() + "m squared");
    }
}
//Sub_class4
class Circle extends Shape {
    protected double Radius;
    protected double Area;
    protected double Circumference;
    protected double Diameter;
    public double getRadius() {
        return Radius;
    }
    public void setRadius(double Radius) {
        this.Radius = Diameter / 2;
    }
    public double getArea() {
        return Area;
    }
    public void setArea() {
        this.Area = 3.141592 * (Radius * Radius);
    }
    public double getCircumference() {
        return Circumference;
    }
    public void setCircumference() {
        this.Circumference = (2 * 3.141592) * Radius;
    }
    public double getDiameter() {
        return Diameter;
    }
    public void setDiameter(double Diameter) {
        this.Diameter = Diameter;
    }
    public void Display (){
        System.out.println("Name : " + this.getName());
        System.out.println("Diameter : " + this.getDiameter() + 'm');
        System.out.println("Radius : " + this.getRadius() + 'm');        
        System.out.println("circumference : " + this.getCircumference() + 'm');
        System.out.println("Area : " + this.getArea() + "m squared");
    }
}