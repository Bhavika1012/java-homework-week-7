package javaprogrammes;

/*
15. Wall Area
Write a class with the name Wall. The class needs two fields (instance variables) with name width
and height of type double.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters width and height of type double and it needs to
initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
* Method named getWidth without any parameters, it needs to return the value of width field.
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named setWidth with one parameter of type double, it needs to set the value of the width
field. If the parameter is less than 0 it needs to set the width field value to 0.
* Method named setHeight with one parameter of type double, it needs to set the value of the
height field. If the parameter is less than 0 it needs to set the height field value to 0.
* Method named getArea without any parameters, it needs to return the area of the wall.
TEST EXAMPLE
→ TEST CODE: (Write bellow code into main method and run and compare result with OUTPUT)
Wall wall = new Wall (5, 4);
System.out.println("area= " + wall.getArea());
wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth());
System.out.println("height= " + wall.getHeight());
System.out.println("area= " + wall.getArea());
→ OUTPUT:
area= 20.0
width= 5.0
height= 0.0
area= 0.0
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 5 methods and 2 constructors.
 */
public class Programme_15_Wall {
    public double width; //declaring constructor with no argument
    public double height;

    public Programme_15_Wall() { //Declaring no-args constructor
    }

    public Programme_15_Wall(double width, double height) { //constructor with no parameters
        if (width < 0) {
            this.width = 0; //checking to see if width is less than 0 and if it is then setting it to 0 if it is.
        } else {
            this.width = width;
        }
        if (height < 0) { //Checking the same for height
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() // declaring instance method without the parameter
    {
        return height;
    }
    public void setWidth(double width) // declaring instance method with the parameter
    {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }
    public void setHeight(double height){ // declaring instance method with parameter

        if (height < 0) {
            height = 0;
        }
            this.height = height;
        }
    public double getArea() { //instance variable without parameter and method to calculate area of wall
        double area = this.height*this.width; // calculating area
return area;
    }

    public static void main(String[] args) {
        Programme_15_Wall wall = new Programme_15_Wall(5,4); //constructor with no argument
        System.out.println("Area = " + wall.getArea()); //Output for area
        wall.setHeight(-1.5); //calling instance method with parameter
        System.out.println("Width = " + wall.getWidth()); //printing the width
        System.out.println("Height = " +wall.getHeight()); //printing the height
        System.out.println("Area = "+ wall.getArea()); //Area output
    }
}
