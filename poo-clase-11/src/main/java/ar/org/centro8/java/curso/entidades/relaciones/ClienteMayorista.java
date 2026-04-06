package ar.org.centro8.java.curso.entidades.relaciones;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClienteMayorista {

    private int nro;
    private String razonSocial;
    private String direccion;
    private List<Cuenta> cuentas;
    // una List es una Collection, la utilizamos para guardar un conjunto de datos
    
    public ClienteMayorista(int nro, String razonSocial, String direccion) {
        this.nro = nro;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.cuentas = new ArrayList<>();
        // ArrayList es una clase implementación de List.
    }
    
    

}
