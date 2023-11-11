class Calculator {

    int num = 10;

    public int add(int a , int b){  
        System.out.println(num);
        return (a+b);
    }
}

class Calc {

    // Method overloading -> same name and different parameters (no. of para or type of para)
    public int add(int a , int b) {
        return a + b;
    }
    public int add(int a , int b , int c) {
        return a + b + c;
    }
     // Same name and para but diff return type won't work in method overloading
    public double add(double a , int b) {
        return a + b; // double and int will return double (higher size)
    }
}

class Computer{

    public void playMusic(){
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost) {
        if(cost >= 10)
            return "Pen"; // the moment our code sees return it will jump out of the method and not excecute futher statement
        
        return "Nothing";
    }
}
public class Demo {
    public static void main(String[] args) {
        int num1 , num2;
        num1 = 5; 
        num2 = 6; 
        // int result = num1 +  num2;

        // System.out.println(result);
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(); // new obj in heap memory
        // int result = c1.add(num1 , num2);
        // System.out.println(result); // 11

        System.out.println(c1.add(1,2)); // 10
        c2.num = 11;
        System.out.println(c2.add(1,4)); // 11 // will not effect c1 obj


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Computer obj = new Computer();
        obj.playMusic(); // Music Playing..
        System.out.println(obj.getMeAPen(10)); // Pen
        System.out.println(obj.getMeAPen(2)); // Nothing

        System.out.println("~~~~~~~~~~~~~~~~~~~~Method Overloading~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Calc c = new Calc();
        System.out.println(c.add(10, 20)); //30
        System.out.println(c.add(10 , 20 ,30)); //60


    }
}

// Object Oriented Programming
// oops -> used to map -> real world entity -> code

// Object -> Properties and Behaviour/action (methods)
// object is manufactured by jvm 

