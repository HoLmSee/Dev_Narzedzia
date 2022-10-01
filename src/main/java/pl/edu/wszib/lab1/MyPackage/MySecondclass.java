package pl.edu.wszib.lab1.MyPackage;

import pl.edu.wszib.lab1.MyAbstract.MyAbstractClass;

public class MySecondclass extends MyAbstractClass {
    private String FirstField;
    String FirstField2;
    public void  run(){
        System.out.println("FirstField = " + FirstField);
        System.out.println("FirstField = " + FirstField2);
        MyProtectedField = "Udany Test";
        MyProtected();
    }


    @Override
    protected void MyAbstract() {

    }
}



