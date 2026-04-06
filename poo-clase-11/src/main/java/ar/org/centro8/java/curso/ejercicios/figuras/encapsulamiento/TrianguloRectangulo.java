package ar.org.centro8.java.curso.ejercicios.figuras.encapsulamiento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class TrianguloRectangulo {

    private double altura;
    private double base;
    
    public double calcularSuperficie(){
        return (altura * base) / 2;
    }

    public double calcularPerimetro(){
        // double hipotenusa = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
        // return base + altura + hipotenusa;
        return base + altura + Math.hypot(base, altura);
    }

}
