package PROYECTO_GRUPO_3;
public class Usuario extends Persona {
    // ATRIBUTOS PROPIOS
    private double saldo;
    private String ID;
    private String contraseña;

    // CONSTRUCTORES
    public Usuario() {
        super();
    }

    public Usuario(String nombres, String apellidos, String email, int edad, 
                   String distrito, String ID, String contraseña) {
        super(nombres, apellidos, email, edad, distrito);
        this.saldo = 0.0;
        this.ID = ID;
        this.contraseña = contraseña;
    }

    // MÉTODOS SETTERS
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // METODOS GETTERS
    public double getSaldo() {
        return saldo;
    }

    public String getID() {
        return ID;
    }

    public String getContraseña() {
        return contraseña;
    }

    // METODO PARA MOSTRAR EL SALDO ACTUAL DE UN USUARIO
    public String mostrarSaldo() {
        StringBuilder tabla = new StringBuilder();
        tabla.append("+-----------------+------------------------------------------+\n");
        tabla.append(String.format("| %s | %s |\n", 
                FormatoDelTexto.centrarTexto("Saldo", 15), 
                FormatoDelTexto.centrarTexto(String.valueOf(saldo), 40)));
        tabla.append("+-----------------+------------------------------------------+\n");
        return tabla.toString();
    }

    // METODO PARA MOSTRAR SOLO LOS DATOS PERSONALES DEL USUARIO
    public String datosPersonales(){
        return super.mostrarDatos();
    }
}