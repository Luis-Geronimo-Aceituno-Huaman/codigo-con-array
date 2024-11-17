package PROYECTO_GRUPO_3;

public abstract class Encargado extends Persona {
    // ATRIBUTO
    protected double salario;

    // CONSTRUCTORES
    public Encargado(){
    }

    public Encargado(String nombres, String apellidos, String email, int edad,
                    String distrito,double salario){
        super(nombres,apellidos,email,edad,distrito);
        this.salario = salario;
    }

    public Encargado(String nombres, String apellidos, double salario, String distrito){
        super(nombres,apellidos,distrito);
        this.salario = salario;
    }

    // METODOS SETTERS Y GETTERS
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
}