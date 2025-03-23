package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();//nie robiliśmy konstruktora, a stworzylismy obiekt. skąd wiadomo ze a i b to te same zmienne co w metodach sum i substrakt?
        int a = 8;
        int b = 5;
        double base = 2.0;
        double exponent = 2.0;

        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawinie dla liczb " + a + " i " + b);
        }
        else
            {System.out.println("Metoda sum nie działa poprawinie dla liczb "+ a +" i " + b);
        }
        int subtractResult = calculator.subtract(a,b);
        boolean correct2 = ResultChecker.assertEquals(3,subtractResult);
        if (correct2) {
            System.out.println("Metoda subtrackt działa poprawinie dla liczb " + a + " i " + b);
        }
        else {
            System.out.println("Metoda subtrackt nie działa poprawinie dla liczb " + a + " i " + b);
        }

        double powerResult = calculator.power(base,exponent);
        boolean correct3 = ResultChecker.assertEqualsPower(4.0, powerResult);
        if (correct3) {
            System.out.println("Metoda power działa poprawnie dla liczb " + base + " i " + exponent);
        }
        else {
            System.out.println("Metoda power nie działa poprawnie dla liczb " + base + " i " + exponent);
            }
        }
    }

