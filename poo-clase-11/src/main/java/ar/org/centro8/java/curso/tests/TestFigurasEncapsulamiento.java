package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.ejercicios.figuras.encapsulamiento.Circulo;
import ar.org.centro8.java.curso.ejercicios.figuras.encapsulamiento.Rectangulo;
import ar.org.centro8.java.curso.ejercicios.figuras.encapsulamiento.TrianguloRectangulo;

public class TestFigurasEncapsulamiento {
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(125);
        System.out.println("La superficie del círculo es: " + circulo1.calcularSuperficie());
        System.out.println("El perímetro del círculo es: " + circulo1.calcularPerimetro());

        Rectangulo rectangulo1 = new Rectangulo(10, 20);
        System.out.println("La superficie del rectángulo es: " + rectangulo1.calcularSuperficie());
        System.out.println("El perímetro del rectángulo es: " + rectangulo1.calcularPerimetro());

        TrianguloRectangulo triangulo1 = new TrianguloRectangulo(10, 20);
        System.out.println("La superficie del triángulo es: " + triangulo1.calcularSuperficie());
        System.out.println("El perímetro del triángulo es: " + triangulo1.calcularPerimetro()); // 52.3606797749979

    }
}
