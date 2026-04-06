package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.encapsulamiento.Empleado;
import ar.org.centro8.java.curso.entidades.encapsulamiento.EmpleadoLombok;

public class TestEncapsulamiento {
    public static void main(String[] args) {
        
        //creamos un objeto de Empleado
        // Empleado empleado1 = new Empleado(); ERROR -> no tenemos constructor vacío declarado en la clase Empleado.
        Empleado empleado1 = new Empleado(1, "Arnold", "Schaurseneguer", "casado", 500000);
        System.out.println(empleado1);

        // empleado1.apellido = "Schwarzenegger"; ERROR no podemos acceder a miembros privados de la clase
        //para cambiar el apellido utilizamos el setter
        empleado1.setApellido("Schwarzenegger"); //con los setters modificamos los valores
        System.out.println(empleado1.getApellido()); //con los getters obtenemos los valores
        System.out.println(empleado1);

        Empleado empleado2 = new Empleado(2, "Sylvester", "Stallone", "soltero");
        System.out.println(empleado2);

        //testeamos la clase que lleva anotaciones de Lombok
        EmpleadoLombok empleado3 = new EmpleadoLombok(3, "Ya Ancló", "Bandan", "Divorciado", 300000);
        System.out.println(empleado3);
        System.out.println(empleado3.getSueldoBasico());
        empleado3.setSueldoBasico(1000000);

        /*
            Diseñar 3 clases que representen: círculos, triángulos (del tipo rectángulo) y rectángulos.
            Cada clase deberá tener implementados los constructores, getters, setters y toString.
            Cada clase deberá poder informar su perímetro y su superficie.
            Testear los funcionamientos de las clases.
            Pueden utilizar atributos y métodos de la clase Math (investigar y poder explicar).
        */
        

    }
}
