package clase3.mesa.service;

import clase3.mesa.model.Producto;

public class ProcesarAnalistaDeCalidad {
    public String cadenaDeAnalistaDeCalidad(Producto producto){
        AnalistaDeCalidad control1 = new AnalistaLote();
        AnalistaDeCalidad control2 = new AnalistaPeso();
        AnalistaDeCalidad control3 = new AnalistaEnvase();

        control1.setSiguiente(control2);
        control2.setSiguiente(control3);

        return control1.controlarCalidad(producto);
    }
}
