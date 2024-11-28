class demo{
    String name;
    int age;
}

class base extends demo{
    void show(){
        super.name = "Anmol";
        super.age = 21;
    }
}

public class Superkeyword extends base{
    String name;
        int age;
    Superkeyword(String name, int age){
        
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        base d = new base();
        d.show();
        Superkeyword s =new Superkeyword(d.name, d.age);
        System.out.println(s.age);
        System.out.println(s.name);
    }
}
