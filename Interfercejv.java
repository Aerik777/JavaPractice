interface demo{

    void msg();
}


public class Interfercejv implements demo {
    public void msg(){
        System.out.println("Hello java");
    }

    public static void main(String[] args) {
        Interfercejv t = new Interfercejv();
        t.msg();
    }
}
