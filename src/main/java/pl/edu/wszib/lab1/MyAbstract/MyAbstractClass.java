package pl.edu.wszib.lab1.MyAbstract;

public abstract class MyAbstractClass {

    protected String MyProtectedField;

    protected String MyProtectedField2;

    protected void MyProtected(){
        System.out.println("MyProtectedField = "+ MyProtectedField);
    }

    protected abstract void MyAbstract();

}
