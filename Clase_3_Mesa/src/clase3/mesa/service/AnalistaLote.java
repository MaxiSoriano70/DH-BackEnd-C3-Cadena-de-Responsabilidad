package clase3.mesa.service;

import clase3.mesa.model.Producto;

public class AnalistaLote extends AnalistaDeCalidad{
    @Override
    public String controlarCalidad(Producto producto) {
        if(producto.getLote()>=1000 && producto.getLote()<=2000){
            System.out.println("Paso Control de Lote");
            return getSiguiente().controlarCalidad(producto);
        }
        else {
            return "Producto rechazado en Control Lote";
        }
    }
}
