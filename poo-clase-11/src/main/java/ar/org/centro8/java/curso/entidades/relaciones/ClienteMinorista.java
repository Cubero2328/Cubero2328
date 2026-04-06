package ar.org.centro8.java.curso.entidades.relaciones;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClienteMinorista {

    private int nro;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;

}
