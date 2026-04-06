package ar.org.centro8.java.curso.entidades.relaciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class EmpleadoAsociacionSimple {

    // la relación de relación simple es la menos acoplada de todas.
    // la relación  con las palabras "usa un/a"
    // poe ejemplo en este caso, un empleado usa un auto

    private int legajo;
    private String nombre;
    private String apellido;

    public void usarAuto(Auto auto){
        System.out.println("El empleado" + this.nombre + " " + this.apellido + " esta usando el auto " + auto);
    }
}
