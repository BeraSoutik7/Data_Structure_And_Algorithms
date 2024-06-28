package Arrays;

import java.lang.reflect.Method;

class A{
    void method(){
        System.out.println("Method of class A");
    }

}
public class DemoClass extends A{
    void method(){

        System.out.println("Method of class Demo");
    }
    public static void main(String[] args) {
       DemoClass d = new DemoClass();
       A a = new A();
       d.method();
       a.method();

    }
}
