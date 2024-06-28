package BackTracking;

abstract class Car{
    abstract void speed();
}
class BMW_z4 extends Car{

    @Override
    void speed() {
        System.out.println("Speed is 250KMPH");
    }
}
class AudiR8 extends Car{

    @Override
    void speed() {
        System.out.println("Speed is 350 KMPH");
    }
}
public class AbstructionExample {
    public static void main(String[] args) {
        Car obj1 = new BMW_z4();
        obj1.speed();
        Car obj2 = new AudiR8();
        obj2.speed();
    }
}
