package week_8_HomeWork;

public class P22_Animal {

        /*
        22. Multilevel Inheritance Example
    1. First class
    class Animal{
    public void eat(){System.out.println("eating...");}
    }
    2. Second class
    class Dog extends Animal{
    public void bark(){System.out.println("barking...");}
    }
    3. Third class
    class BabyDog extends Dog{
    public void weep(){System.out.println("weeping...");}
    }
    4. Forth class
    class TestInheritance2{
    public static void main(String args[]){
    BabyDog d=new BabyDog();
    d.weep();
    d.bark();
    d.eat();
    }}
     */


    //1. First class


        public void eat() {
            System.out.println("eating...");
        }
    }

    //2. Second class
    class Dog extends P22_Animal {
        public void bark() {
            System.out.println("barking...");
        }
    }

    //3. Third class
    class BabyDog extends Dog {
        public void weep() {
            System.out.println("weeping...");
        }
    }

    //4. Forth class
     class TestInheritance2 {

        public static void main(String args[]) {
            BabyDog d = new BabyDog();
            d.weep(); //call child class method
            d.bark(); //call parent class method with child class object
            d.eat();  //call parent class method with child class object
        }
    }

