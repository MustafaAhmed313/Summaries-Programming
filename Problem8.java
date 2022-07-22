/*
9.8 (The Fan class) Design a class named Fan to represent a fan. The class contains:
 ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
denote the fan speed.
 ■ A private int data field named speed that specifies the speed of the fan (the
default is SLOW).
 ■ A private boolean data field named on that specifies whether the fan is on (the
default is false).
 ■ A private double data field named radius that specifies the radius of the fan
(the default is 5).
 ■ A string data field named color that specifies the color of the fan (the default
is blue).
 ■ The accessor and mutator methods for all four data fields.
 ■ A no-arg constructor that creates a default fan.
 ■ A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one combined string.
If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Fan objects. Assign maximum speed, radius 10, color
yellow, and turn it on to the first object. Assign medium speed, radius 5, color
blue, and turn it off to the second object. Display the objects by invoking their
toString method.
*/

public class Problem8 {
    public static void main(String[] args){
        Fan f1  = new Fan();
        f1.setSpeed(3);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        System.out.printf("[Fan 1] info:-\n%s\n" , f1.toString());
        Fan f2 = new Fan();
        f2.setSpeed(2);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);
        System.out.printf("[Fan 2] info:-\n%s\n" , f2.toString());
    }
}
class Fan {
    public final int SLOW = 1 , MEDIUM = 2 , FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){
    }
    public void setSpeed(int newSpeed){
        if (newSpeed == 1)
            speed = SLOW;
        else if (newSpeed == 2)
            speed = MEDIUM;
        else
            speed = FAST;
    }
    public void setOn(boolean newStatus){
        on = newStatus;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public String getSpeed(){
        if (speed == SLOW)
            return "Slow";
        else if (speed == MEDIUM)
            return "Medium";
        else
            return "Fast";
    }
    public boolean isOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        if (this.isOn())
            return "Speed : " + this.getSpeed() + "\nColor : " + this.getColor()
                    +"\nRadius : " + this.getRadius() + "\n";
        else
            return "The fan is off\nColor : " + this.getColor()
                    +"\nRadius : " + this.getRadius() + "\n";
    }
}