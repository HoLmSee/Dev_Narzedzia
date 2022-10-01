package pl.edu.wszib.lab1;

public class MyFirstClass implements MyFirstInterface {

    //modyfikatory dostępu
    //private
    //          - default(dostep na poziomie dostepu)
    //protected - (w obrebie klas dziedzic oraz pakietow)
    //public

    private String FirstField;
    String FirstField2;
    public void run(){
        System.out.println("FirstField = " + FirstField);
        System.out.println("FirstField = " + FirstField2);
    }

    @Override
    public void run1() {
        System.out.println("FirstField = " + FirstField);
        System.out.println("FirstField = " + FirstField2);
    }

    @Override
    public void run2() {
        System.out.println("My run");

    }
}
