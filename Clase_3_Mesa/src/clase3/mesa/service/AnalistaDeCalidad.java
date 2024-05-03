package clase3.mesa.service;

import clase3.mesa.model.Producto;

public abstract class AnalistaDeCalidad {
    private AnalistaDeCalidad siguiente;

    public AnalistaDeCalidad getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(AnalistaDeCalidad siguiente) {
        this.siguiente = siguiente;
    }

    public abstract String controlarCalidad(Producto producto);
}
