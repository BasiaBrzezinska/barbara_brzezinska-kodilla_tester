package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Square square = new Square(5);//zapis Shape square = new Square też będzie ok?
        System.out.println("Pole powierzchni kwadratu wynosi: " + square.surfaceArea());
        System.out.println("Obwód kwadratu wynosi: " + square.circumference());

        Rectangle rectangle = new Rectangle(5,9);
        System.out.println("Pole powierzchni prostokata wynosi: "+ rectangle.surfaceArea());
        System.out.println("Obwód prostokata wynosi: " + rectangle.circumference());

        Circle circle = new Circle(3.1415927, 12);//dlaczego skoro PI jest stałą musiałam wpisać tutaj jej wartość?
        System.out.println("Pole powierzchni koła wynosi: "+ circle.surfaceArea());
        System.out.println("Obwód koło wynosi: " + circle.circumference());
    }
}
