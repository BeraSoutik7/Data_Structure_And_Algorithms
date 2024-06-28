package DSARelatedCodes;

class A{
    void print(){
        System.out.println("hi");
    }
    void print(int a){
        System.out.println("hello");
    }
}
class B extends A{
//    Integer[] print(){//run time poly
//        System.out.println("soutik");
//        ArrayList<Integer>  ans  = new ArrayList<>();
//        Integer []a = new Integer[ans.size()];
//
//        return ans.toArray(a);
//    }
}


public class DemoClass {
    int a;
    int b;
    DemoClass(){//non argumented / default

    }
    DemoClass(int a,int b){
        this.a=a;
        this.b=b;

    }

    public static void main(String[] args) {
        DemoClass d = new DemoClass(1,2);
        DemoClass d1= new DemoClass();
        int a;
        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(d1.a);



    }
}
interface x{
    void show();
}
interface y {
    void show();
}
class z implements x,y{


    @Override
    public void show() {
        System.out.println("Hi");
    }
}

