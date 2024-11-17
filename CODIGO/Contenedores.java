package PROYECTO_GRUPO_3;

public class Contenedores {
    // ATRIBUTOS
    private Contenedor[] contenedores;
    private String idContenedor;
    private String ubicacion;
    private EncargadoDeVaciado encargado;
    
    // CONSTRUCTOR
    public Contenedores(String idContenedor,String ubicacion,EncargadoDeVaciado encargado){
        this.idContenedor = idContenedor;
        this.ubicacion = ubicacion;
        this.encargado = encargado;
        contenedores = new Contenedor[3]; 
        contenedores[0] = new ContenedorDeVidrio(500);
        contenedores[1] = new ContenedorDePlastico(500);
        contenedores[2] = new ContenedorDeLata(500);
    }

    // METODOS SETTERS Y GETTERS
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    
    // METODO PARA OBTENER UNO DE LOS TRES CONTENEDORES
    public Contenedor getContenedor(int i) {
        if (i >= 0 && i < contenedores.length) {
            return contenedores[i];
        }
        return null; 
    }
    
    // METODO PARA AGREGAR PRODUCTOS RECICLABLES EN UN CONTENEDOR ESPECIFICO
    public boolean agregarProducto(int i, Producto_Reciclable producto) {
        Contenedor contenedor = getContenedor(i);
        if (contenedor == null) {
            System.out.println("Contenedor no encontrado.");
            return false;
        }
        // Intentamos agregar el producto
        boolean agregado = contenedor.agregar(producto);

        // Si el contenedor está lleno después de agregar el producto, el encargado lo vacía
        if (contenedor.getCapacidadActual() >= contenedor.getCapacidadMaxima()) {
            encargado.vaciarContenedor(contenedor);
        }

        return agregado;
    }

    // METODO PARA MOSTRAR CADA UNO DE LOS CONTENEDORES
    public void mostrarContenedores(){
        System.out.println("CONTENEDOR "+idContenedor+" UBICADO EN "+ubicacion.toUpperCase());
        for(int i=0;i<3;i++){
            contenedores[i].mostrarContenedor();
        }
    }
}