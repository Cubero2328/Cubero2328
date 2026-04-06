package ar.org.centro8.java.curso.entidades.encapsulamiento;

public class Empleado {

    /*
        Modificadores de acceso o visibilidad para atributos y métodos de una clase:
        private: Es el nivel de acceso más restringido. Es accesible solo para la clase que lo esté definiendo.
                Se utiliza para declarar miembros que sólo deben ser utilizados por esa clase.
        public:  Es el modificador de acceso más permisivo. Todas las clases de todos los paquetes tienen acceso a
                los miembros públicos.
        default: Es cuando no ponemos un modificador específico. Solo puede tener acceso desde las clases del mismo paquete.
        protected: Solo se puede acceder desde el mismo paquete o desde clases que extienden de la clase que lo implementa
                (incluso si está en paquetes distintos).
    */

    //atributos
    private int id;
    private String nombre;
    private String apellido;
    private String estadoCivil;
    private double sueldoBasico;
    
    /*
        Modificadores de acceso o visibilidad para constructores.
        private: ninguna clase puede crear un objeto de esta clase. Esta clase podría tener métodos públicos estáticos
                    que construyan el objeto y lo retornen.
        public: cualquier clase puede crear un objeto de esta clase.
        default: nadie fuera del paquete puede crear un objeto de esta clase.
        protected: solo las subclases de esta clase y/o aquellas que se encuentren dentro del mismo paquete, pueden
                    crear objetos de esta clase.
    */

    public Empleado(int id, String nombre, String apellido, String estadoCivil, double sueldoBasico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.sueldoBasico = sueldoBasico;
    }

    /**
     * Constructor para crear objetos de Empleado con sueldoBasico de 100000 
     * @param id
     * @param nombre
     * @param apellido
     * @param estadoCivil
     */
    public Empleado(int id, String nombre, String apellido, String estadoCivil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.sueldoBasico = 100000;
    }


    /*
        Getters y Setters
        Son métodos que permiten acceder y modificar los atributos privados de la clase promoviendo el principio de
        encapsulamiento.
        En Java se recomienda declarar los atributos como privados y los métodos getters y setters como públicos.
        Cuando los atributos son privados estamos protegiendo el estado interno de la clase.
        Los getters y setters actúan como una interfaz para leer y modificar esos atributos, sin exponerlos directamente.
        Con estos métodos se puede agregar lógica adicional como validaciones o transformaciones antes de asignar un valor
        o devolverlo. Por ejemplo, se podría evitar que se asigne una edad negativa.
        Si en el futuro cambiamos la implementación interna de la clase, podemos mantener la misma interfaz pública (los
        métodos getters y setters) sin que las clases que la usan tengan que modificarse.
    */

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil
                + ", sueldoBasico=" + sueldoBasico + "]";
    }
}
