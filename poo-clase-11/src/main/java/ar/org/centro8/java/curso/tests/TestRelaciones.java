package ar.org.centro8.java.curso.tests;

import java.util.ArrayList;
import java.util.List;

import ar.org.centro8.java.curso.entidades.relaciones.Auto;
import ar.org.centro8.java.curso.entidades.relaciones.ClienteMayorista;
import ar.org.centro8.java.curso.entidades.relaciones.ClienteMinorista;
import ar.org.centro8.java.curso.entidades.relaciones.Cuenta;
import ar.org.centro8.java.curso.entidades.relaciones.EmpleadoAsociacionSimple;

public class TestRelaciones {

    public static void main(String[] args) {
        
        System.out.println("## Test: Clase Cuenta: ##");
        //creamos un objeto de la clase Cuenta
        Cuenta cuenta1 = new Cuenta(1, "Pesos argentinos");
        System.out.println(cuenta1);
        cuenta1.depositar(1000);
        System.out.println(cuenta1);
        cuenta1.debitar(100);
        System.out.println(cuenta1);
        cuenta1.debitar(1000); // no permite descontar ese monto porque excede el saldo
        System.out.println(cuenta1);

        Cuenta cuenta2 = new Cuenta(2, "Dólares");
        Cuenta cuenta3 = new Cuenta(3, "Reales");
        Cuenta cuenta4 = new Cuenta(4, "Euros");
        Cuenta cuenta5 = new Cuenta(5, "Libras esterlinas");
        Cuenta cuenta6 = new Cuenta(6, "Yenes");

        System.out.println("Clase Cuenta funcionando correctamente.\n");

        System.out.println("## Test: Clase Cliente Minorista ##");

        ClienteMinorista cliente1 = new ClienteMinorista(1, "Mario", "Barakus", cuenta1);
        System.out.println(cliente1);
        //cliente1.depositar(1000); ERROR el método depositar() no es de la clase ClienteMinorista
        cliente1.getCuenta().depositar(1000);
        //cliente -> cuenta
        System.out.println(cliente1);

        ClienteMinorista cliente2 = new ClienteMinorista(2, "Apollo", "Creed", new Cuenta(7, "Pesos argentinos"));
        System.out.println(cliente2);
        cliente2.getCuenta().depositar(1000);
        System.out.println(cliente2);

        //creamos un apuntador, no ocupa más espacio en memoria, es una referencia
        Cuenta ctaC2 = cliente2.getCuenta();
        ctaC2.depositar(1000);
        System.out.println(cliente2);

        System.out.println("Clase ClienteMinorista funcionando correctamente.\n");

        System.out.println("## Test: ClienteMayorista ##");
        ClienteMayorista cliente3 = new ClienteMayorista(3, "Star", "Cuchacucha 2032");
        System.out.println(cliente3);
        //creamos un apuntador para la lista de cuentas del cliente3
        List<Cuenta> cuentas3 = new ArrayList<>();
        cuentas3 = cliente3.getCuentas();
        //
        //el método add() agrega elementos a una lista
        cuentas3.add(cuenta2);
        cuentas3.add(cuenta3);
        cuentas3.add(cuenta4);

        //para acceder a las cuentas, lo hacemos con el método get(), como parámetro ponemos el número de índice
        cuentas3.get(0).depositar(15000);
        cuentas3.get(1).depositar(20000);
        cuentas3.get(2).debitar(10);
        // cuentas3.get(0).depositar(100000); ERROR del tipo Exception que detiene el programa abruptamente
        // el error es que no existe la cuenta de posicion de índice 3
        System.out.println(cliente3);

        System.out.println("Class clienteMayorista funcionando correctamente.\n");

        System.out.println("##########################################################");

        System.out.println("## Test de la clase Auto ##");

        Auto auto1 = new Auto("Ford", "Ka", "Amarillo patito");
        System.out.println(auto1);
        Auto auto2 = new Auto("Chevrolet", "Meriva", "Gris");
        System.out.println(auto2);
        Auto auto3 = new Auto("Citröen", "C3", "Cleste oscuro");
        System.out.println(auto3);


        System.out.println("Clase auto funsionando correctamente.\n");

        System.out.println("## Test de la clase EmpleadoAsociacionSimple: ##");
        EmpleadoAsociacionSimple empleado1 = new EmpleadoAsociacionSimple(1, "James", "Hetfield");
        System.out.println(empleado1);
        empleado1.usarAuto(auto1);



    }
}
