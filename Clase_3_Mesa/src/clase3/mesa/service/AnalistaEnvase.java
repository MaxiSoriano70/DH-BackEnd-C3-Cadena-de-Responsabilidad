package clase3.mesa.service;

import clase3.mesa.model.Eenvase;
import clase3.mesa.model.Producto;

public class AnalistaEnvase extends AnalistaDeCalidad{
    @Override
    public String controlarCalidad(Producto producto) {
        if(producto.getEnvase().equals(Eenvase.SANO) || producto.getEnvase().equals(Eenvase.CASISANO)){
            System.out.println("Paso Control de Envase");
            return "El producto paso todos los controles de Calidad";
        }
        else {
            return "Producto rechazado en Control Envase";
        }
    }
}
