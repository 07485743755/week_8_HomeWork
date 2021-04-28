    package week_8_HomeWork;

    public class P25_Student {

        /* 25. Example of Constructor Overloading
    //Java program to overload constructors
    class Student5{  int id;
     String name;
     int age;
     //creating two arg constructor
     Student5(int i,String n){
     id = i;
     name = n;
     }
     //creating three arg constructor
     Student5(int i,String n,int a){
     id = i;
     name = n;
     age=a;
     }
     public void display(){System.out.println(id+" "+name+" "+age);}

     public static void main(String args[]){
     Student5 s1 = new Student5(111,"Karan");
     Student5 s2 = new Student5(222,"Aryan",25);
     s1.display();
     s2.display();
     }
    }
    Output:
    111 Karan 0
    222 Aryan 25
         */

        //Instance variable
        int id;
        String name;
        int age;

        //creating two arg constructor
        P25_Student(int i, String n) {
            id = i;
            name = n;
        }

        //creating three arg constructor
        P25_Student(int i, String n, int a) {
            id = i;
            name = n;
            age = a;

        }

        //Instance method
        public void display(){

            System.out.println(id+" "+name+" "+age);
        }

        //Main method
        public static void main(String args[]){
            P25_Student s1 = new P25_Student(111,"Karan");
            P25_Student s2 = new P25_Student(222,"Aryan",25);
            s1.display();
            s2.display();
        }
    }
