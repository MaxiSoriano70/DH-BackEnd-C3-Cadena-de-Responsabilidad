package clase3.mesa.service;

import clase3.mesa.model.Producto;

public class AnalistaPeso extends AnalistaDeCalidad{
    @Override
    public String controlarCalidad(Producto producto) {
        if(producto.getPeso() >=1200 && producto.getPeso() <=1300){
            System.out.println("Paso Control de Peso");
            return getSiguiente().controlarCalidad(producto);
        }
        else {
            return "Producto rechazado en Control Peso";
        }
    }
}
