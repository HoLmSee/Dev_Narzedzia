package pl.edu.wszib.lab1;
//importy

import pl.edu.wszib.lab1.MyPackage.MySecondclass;

public class Application {
    public static void main(String[] args) {
        MyFirstClass myFirstClass = new MyFirstClass();
        //var myFirstClass = new MyFirstClass();
        myFirstClass.FirstField2 = "Text";
        myFirstClass.run1();
        myFirstClass.run2();

//        MySecondclass mySecondClass = new MySecondclass();
//        mySecondClass.run();
    }
}
