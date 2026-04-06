package ar.org.centro8.java.curso.ejercicios.figuras.encapsulamiento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Circulo {

    private double radio;

    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

    public double calcularSuperficie(){
        return Math.PI * Math.pow(radio,2);
    }

}
