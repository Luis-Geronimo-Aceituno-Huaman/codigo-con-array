package PROYECTO_GRUPO_3;

public class EnvaseDeVidrio extends Producto_Reciclable {
    // CONSTRUCTOR
    public EnvaseDeVidrio(int cantidad) {
        // DEFINIMOS EL TIPO DE ENVASE
        super("envase de vidrio", cantidad);
    }

    // METODO PARA ESTABLECER EL VALOR DE UN ENVASE DE ESTE TIPO
    public double establecerValor() {
        return 0.30;
    }

    // METODO PARA CALCULAR EL VALOR TOTAL POR TODAS LAS CANTIDADES
    public double calcularValor(){
        return establecerValor()*getCantidad();
    }
}