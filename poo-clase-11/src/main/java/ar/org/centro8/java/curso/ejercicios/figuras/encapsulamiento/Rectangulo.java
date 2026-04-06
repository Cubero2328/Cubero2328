package ar.org.centro8.java.curso.ejercicios.figuras.encapsulamiento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Rectangulo {

    private double base;
    private double altura;

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }

    public double calcularSuperficie(){
        return base * altura;
    }

}
