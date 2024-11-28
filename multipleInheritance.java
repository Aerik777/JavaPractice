//Multiple Inheritance Using Interface

/**
 * InnermultipleInheritance
 */
interface A {

    void msg();
}

interface B {
 void msg();  
}

class demo implements A, B{
// Implmentation of class A and class B 
    public void msg()
    {
        System.out.println("Hello A");
    }
}

public class multipleInheritance extends demo{
    
    public static void main(String[] args) {
        multipleInheritance m = new multipleInheritance();
        m.msg();
    }
}
