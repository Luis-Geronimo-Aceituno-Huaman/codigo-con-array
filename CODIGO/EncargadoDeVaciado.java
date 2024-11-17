package PROYECTO_GRUPO_3;

public class EncargadoDeVaciado extends Encargado {
    // ATRIBUTO
    private String turno;

    // CONSTRUCTOR
    public EncargadoDeVaciado(String nombres, String apellidos, String distrito, String turno) {
        // EL ENCARGADO DE VACIADO TIENE UN SALARIO FIJO DE 500 SOLES
        super(nombres,apellidos,500,distrito);
        this.turno = turno;
    }

    // METODOS SETTERS Y GETTERS
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    // MÉTODO PARA VACIAR EL CONTENEDOR SOLO SI ES REQUERIDO
    public void vaciarContenedor(Contenedor contenedor) {
        // Verificamos si el contenedor está lleno antes de vaciarlo
        if (contenedor.getCapacidadActual() >= contenedor.getCapacidadMaxima()) {
            System.out.println("El contenedor de tipo " + contenedor.getTipo() + 
                                " está lleno. Procediendo a vaciarlo...");
            contenedor.setCapacidadActual(0);  // Restablecemos la capacidad actual a 0
            System.out.println("El contenedor de tipo " + contenedor.getTipo() + " ha sido vaciado por " 
                                +nombres + " "+ apellidos + " que trabaja en turno " + turno);
        } else {
            System.out.println("El contenedor de tipo " + contenedor.getTipo() + " no está lleno aún.");
        }
    }
}