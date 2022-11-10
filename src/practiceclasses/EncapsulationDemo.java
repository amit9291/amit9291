package practiceclasses;

public class EncapsulationDemo {
    private int a ;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
     class Test{

        public static void main(String[] args) {
            EncapsulationDemo obj = new EncapsulationDemo();
            //Test obj=new Test();
            obj.setA(10);
            obj.setB(20);
            System.out.println(obj.getA());
            System.out.println(obj.getB());

        }
    }