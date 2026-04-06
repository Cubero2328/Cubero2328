package ar.org.centro8.java.curso.entidades.relaciones;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmpleadoAgregacion {
    // las agregaciones  son un tipo de relación de un poco mas fuerte entre clases.
    //Son mas utilizadas, las reconocemos con las palabras "tiene un/a"
    //Por ejemplo en este caso, un empleado tiene un auto

    private int legajo;
    private String nombre;
    private String apellido;
    private Auto auto;

    // creamos un constructor sin el aut, ya que es opcional

    public EmpleadoAgregacion(int legajo, String apellido, Auto auto) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.auto = auto;
        
    }

}
