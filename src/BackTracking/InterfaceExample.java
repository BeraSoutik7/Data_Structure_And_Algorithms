package BackTracking;
interface A{
    void methodA();
}
interface B{
    void methodB();
}
class C implements A,B{

    @Override
    public void methodA() {
        System.out.println("Method of interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method of interface B");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        A obj = new C();
        obj.methodA();
        B obj1 = new C();
        obj1.methodB();
    }
}
