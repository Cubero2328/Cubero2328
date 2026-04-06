package ar.org.centro8.java.curso.entidades.encapsulamiento;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*
    Lombok
    Es una librería para Java que reduce código repetitivo al generar automáticamente en tiempo de compilación
    algunas partes comunes de las clases.
*/

@Getter //genera todos los getters públicos
@Setter //genera todos los setters públicos
/*
por defecto, los getters y setters son públicos
si queremos cambiar el modificador de acceso:
@Getter(AccessLevel.PRIVATE); -> crea los getters privados
@Getter(AccessLevel.PROTECTED); -> crea los getters con acceso protegido
@Getter(AccessLevel.PACKAGE); -> crea los getters con acceso por paquete
Lo mismo funciona para los setters.
También tenemos la posibilidad de no incluir algún o algunos atributos en los getters y/o setters, eso se define
dentro de la clase.
Si declaro un comportamiento específico de algún atributo dentro de la clase con métodos getters o setters, ese
comportamiento va a ser priorizado.
*/
@ToString
@AllArgsConstructor // constructor completo
// @NoArgsConstructor -> constructor vacío
// @RequiredArgsConstructor -> constructor que incluye los atributos final y/o marcados como @NonNull
//@Data
/*
@Data sirve para evitar tener que crear la anotación de cada funcionalidad por separado.
Genera automáticamente:
- getters para todos los campos (atributos)
- setters para todos los campos 
- método toString() que incluye todos los atributos
- métodos equals() y hashCode() basados en todos los atributos
- un constructor requerido que incluye todos los campos finales o marcados como @NonNull
*/
public class EmpleadoLombok {

    //atributos
    private int id;
    private String nombre;
    private String apellido;
    private String estadoCivil;
    @Getter(AccessLevel.NONE) // el atributo sueldoBasico no tendrá Getter autogenerado por Lombok
    @Setter(AccessLevel.NONE) // el atributo sueldoBasico no tendrá Setter autogenerado por Lombok
    private double sueldoBasico;
    

    public EmpleadoLombok(int id, String nombre, String apellido, String estadoCivil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.sueldoBasico = 100000;
    }

    public double getSueldoBasico() {
        System.out.println("Para conocer el sueldo básico del empleado, comunicarse con el supervisor del área.");
        return 0.0;
    }

    public void setSueldoBasico(double sueldoBasico) {
        System.out.println("Se descuenta de la modificación de sueldo un %15");
        this.sueldoBasico = sueldoBasico * 0.85;
    }
    
}
