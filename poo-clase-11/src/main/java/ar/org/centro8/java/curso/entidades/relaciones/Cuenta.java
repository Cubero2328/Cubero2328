package ar.org.centro8.java.curso.entidades.relaciones;

import lombok.Data;

@Data
/*
Incluye:
- getters
- setters
- toString
- equals() y hashCode()
- RequiredArgsConstructor -> genera un constructor que lleva como parámetro los atributos declarados como final o
@NonNUll
*/
public class Cuenta {
    
    private final int nro;
    private final String moneda;
    private float saldo;

    // al colocar la palabra reservada final, hacemos que la variable quede constante, por lo tanto su valor
    // no podrá cambiar nunca.
    // Los tipos de datos primitivos no son nulleables. No admiten valores nulos.
    // Los tipos de datos enteros se inicializan en 0
    // Los tipos de datos con decimales se inicializan en 0.0

    public void depositar(float monto){
        this.saldo += monto;
    }

    public void debitar(float monto){
        if(this.saldo - monto < 0) System.out.println("No es posible descontar ese monto.");
        else this.saldo -= monto;
    }
    
}
