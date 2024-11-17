package PROYECTO_GRUPO_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class GestorDeUsuarios extends Encargado{
    // ATRIBUTOS
    private String ID;
    private String contraseña;
    private String telefono;
    static ArrayList<Usuario> atendidos= new ArrayList<Usuario>();
    private Scanner entrada;

    // CONSTRUCTORES
    public GestorDeUsuarios(){
    }

    public GestorDeUsuarios(String nombres, String apellidos, String email, int edad,
                            String distrito, String ID, String contraseña,
                            String telefono){
        super(nombres,apellidos,email,edad,distrito,800);
        this.ID = ID;
        this.contraseña = contraseña;
        this.telefono = telefono;
        entrada = new Scanner(System.in);
    }
    
    // METODOS SETTERS 
    public void setID(String ID){
        this.ID = ID;
    }

    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    // METODOS GETTERS
    public String getID(){
        return ID;
    }

    public String getContraseña(){
        return contraseña;
    }

    public String getTelefono(){
        return telefono;
    }

    // METODO PARA AGREGAR UN USUARIO ATENDIDO AL ARRAY
    public void agregarUsuarioAtendido(Usuario x){
        if (x != null) {
            atendidos.add(x);
        } 
        
    }




    // METODO PARA MOSTRAR EL SALARIO ACTUAL DEL GESTOR
    public String mostrarSalario() {
        StringBuilder tabla = new StringBuilder();
        tabla.append("+-----------------+------------------------------------------+\n");
        tabla.append(String.format("| %s | %s |\n", 
                FormatoDelTexto.centrarTexto("Salario", 15), 
                FormatoDelTexto.centrarTexto(String.valueOf(salario), 40)));
        tabla.append("+-----------------+------------------------------------------+\n");
        return tabla.toString();
    }

    // METODO PARA BUSCAR UN USUARIO ATENDIDO POR EL GESTOR MEDIANTE APELLIDOS Y NOMBRES
    public void buscarUsuario(){
        if(atendidos.size()==0){
            System.out.println("Usted no ha atendido a ningun usuario por el momento.");
        }
        else{
            System.out.print("Ingrese los apellidos y nombres del usuario: ");
            String a = entrada.nextLine();
            a = a.toUpperCase();
            int i=0;
            while(i<atendidos.size() && !(atendidos.get(i).getApellidos().toUpperCase()+" "+
                  atendidos.get(i).getNombres().toUpperCase()).equals(a)){
                i++;
            }
            if(i==atendidos.size()){
                System.out.println(a+" no ha sido atendido por usted");
            }
            else{
                System.out.println(a+" si ha sido atendido por usted como PERSONA "+(i+1));
            }
        }
    }

    // METODO PARA MOSTRAR LOS DATOS PERSONALES DEL GESTOR
    public String datosDelGestor(){
        StringBuilder tabla = new StringBuilder();
        tabla.append(String.format("| %s | %s |\n", 
                FormatoDelTexto.centrarTexto("Telefono", 15), 
                FormatoDelTexto.centrarTexto(telefono, 40)));
        tabla.append("+-----------------+------------------------------------------+\n");
        return super.mostrarDatos()+tabla.toString();
    }
}