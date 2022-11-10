package practiceclasses;
interface Calculate {
    int m1(int a, int b);
    String m2(String a);
}

public class InterfaceDemo implements Calculate{


      public   int m1(int a, int b) {
            return a + b;
        }

        public String m2(String a) {
            return a;
        }

    public static void main(String[] args){
        InterfaceDemo obj = new InterfaceDemo();
        System.out.println(obj.m1(10,20));
        System.out.println(obj.m2("OverRiding"));

    }
}
