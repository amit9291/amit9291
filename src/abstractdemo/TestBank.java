package abstractdemo;

abstract class Bank {
    abstract double getRateOfInterest();
}

class Lloyds extends Bank {

    @Override
    double getRateOfInterest() {
        return 7.5;
    }
}

class Santander extends Bank {
    double getRateOfInterest() {
        return 8.5;
    }
}

class Barclays extends Bank {
    double getRateOfInterest() {
        return 9.5;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new Lloyds();
        System.out.println("Rate of interest is : " + b.getRateOfInterest());
        b = new Santander();
        System.out.println("Rate of interest is : " + b.getRateOfInterest());
        b = new Barclays();
        System.out.println("Rate of interest is : " + b.getRateOfInterest());

    }
}
