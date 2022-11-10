package practiceclasses;

public class MethodTypes {
    public int method1(int a, int b) {
        System.out.println("return type with 2 parameters");
        return a + b;
    }

    String method1(String a) {
        System.out.println(" return type with 1 String parameter");
        return a;
    }
}

class MethodOverRiding extends MethodTypes {
    String method1(String a) {
        System.out.println("method overriding");
        return a;
    }

    public int method1(int a, int b) {

        System.out.println("i am in child class as method overriding");
        return a + b;
    }


    public static void main(String[] args) {
        MethodTypes obj = new MethodTypes();
        int c = obj.method1(10, 20);
        System.out.println(c);

        System.out.println(obj.method1("Amit"));
        MethodOverRiding obj1 = new MethodOverRiding();
        System.out.println(obj1.method1("Patel"));
        System.out.println(obj1.method1(20, 30));


    }
}
