package week_8_HomeWork;

public class P20_Rectangle {

        /* 20. Pool Area
    The Swimming Company has asked you to write an application that calculates the volume of cuboid
    shaped pools.
    1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name
    width and length both of type double.
    The class needs to have one constructor with parameters width and length both of type double and it
    needs to initialize the fields. In case the width parameter is less than 0 it needs to set the width field value to 0.
    In case the length parameter is less than 0 it needs to set the length field value to 0.
    Write the following methods (instance methods):
    ● Method named getWidth without any parameters, it needs to return the value of the width
    field.
    ● Method named getLength without any parameters, it needs to return the value of the length
    field.
    ● Method named getArea without any parameters, it needs to return the calculated area
    (width * length).
    2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field
    (instance variable) with name height of type double.
    The class needs to have one constructor with three parameters width, length, and height all of type
    double. It needs to call the parent constructor and initialize a height field.
    In case the height parameter is less than 0 it needs to set the height field value to 0.
    Write the following methods (instance methods):
    ● Method named getHeight without any parameters, it needs to return the value of height
    field.
    ● Method named getVolume without any parameters, it needs to return the calculated volume.
    To calculate volume multiply the area with height.
    3. Write a class with the name Main that contains the main method.
    TEST EXAMPLE
    → TEST CODE: Write the below code into the main method.
    Rectangle rectangle = new Rectangle(5, 10);
    System.out.println("rectangle.width= " + rectangle.getWidth());
    System.out.println("rectangle.length= " + rectangle.getLength());
    System.out.println("rectangle.area= " + rectangle.getArea());
    Cuboid cuboid = new Cuboid(5,10,5);
    System.out.println("cuboid.width= " + cuboid.getWidth());
    System.out.println("cuboid.length= " + cuboid.getLength());
    System.out.println("cuboid.area= " + cuboid.getArea()); System.out.println("cuboid.height= " + cuboid.getHeight());
    System.out.println("cuboid.volume= " + cuboid.getVolume());
    → OUTPUT
    rectangle.width= 5.0
    rectangle.length= 10.0
    rectangle.area= 50.0
    cuboid.width= 5.0
    cuboid.length= 10.0
    cuboid.area= 50.0
    cuboid.height= 5.0
    cuboid.volume= 250.0
    NOTE: All methods should be defined as public NOT public static.
    NOTE: In total, you have to write 3 classes.
         */


    double width,length;  //Instance variable

    //Constructor with parameters
    public P20_Rectangle(double width,double length){

        this.width=width;
        this.length=length;

        if(width<0){

            width=0;
        }
        if(length<0){

            length=0;
        }
    }

    //Instance method with return type

    public double getWidth(){

        return width;

    }

    //Instance method with return type
    public double getLength(){

        return length;

    }

    //Instance method with return type
    public double getArea(){

        return width*length;   //area of rectangle

    }
}

//Class Cuboid //child class
class Cuboid extends P20_Rectangle {

    double height; //Instance variable

    // Constructor  with parameters
    public Cuboid(double width, double length ,double height) {

        super(width, length); //call parent class with super keyword
        this.height=height;

        if(height<0){

            height=0;

        }
    }

    //Instance method with return type
    public double getHeight(){

        return height;

    }

    //Instance method with return type
    public double getVolume(){

        return getArea()*height; //call parent class method

    }

}

//Class Main1
class Main1{

    //Main method
    public static void main(String[] args) {

        P20_Rectangle rectangle = new P20_Rectangle(5, 10);//Create object
        System.out.println("rectangle.width= " + rectangle.getWidth()); //call getWidth method
        System.out.println("rectangle.length= " + rectangle.getLength()); //call getLength
        System.out.println("rectangle.area= " + rectangle.getArea()); //call getArea method
        Cuboid cuboid = new Cuboid(5,10,5); //create object
        System.out.println("cuboid.width= " + cuboid.getWidth()); //call getWidth method
        System.out.println("cuboid.length= " + cuboid.getLength()); //call getLength method
        System.out.println("cuboid.area= " + cuboid.getArea());  //call getArea method
        System.out.println("cuboid.height= " + cuboid.getHeight()); //call getHeight method
        System.out.println("cuboid.volume= " + cuboid.getVolume()); //call getVolume method
    }

}

