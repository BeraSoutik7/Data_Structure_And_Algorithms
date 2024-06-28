package BackTracking;
class Speed{
    void showSpeed(){
        System.out.println("Return speed...");
    }
}
class BMW_M4 extends Speed{
    @Override
    void showSpeed() {
        System.out.println("260khmh");
    }
}
class BuggatiVeyron extends Speed{
    @Override
    void showSpeed() {
        System.out.println("450kmph");
    }
}

public class DemoClass {
    void msg(){
        System.out.println("hello");
    }

    void msg(String s){
        System.out.println("hello "+s);
    }
    void msg(String s, int n){
        System.out.println("hello "+s+n);
    }
    void msg(int n, String s){
        System.out.println("hello "+s+n);
    }

    public static void main(String[] args) {
        Speed s = new Speed();
        Speed b = new BMW_M4();
        b.showSpeed();
        Speed bv = new BuggatiVeyron();
        bv.showSpeed();
        s.showSpeed();

       DemoClass obj = new DemoClass();
       obj.msg();
       obj.msg("Soutik");
       obj.msg("Soutik",7);
       obj.msg(7,"Soutik");



    }
}

