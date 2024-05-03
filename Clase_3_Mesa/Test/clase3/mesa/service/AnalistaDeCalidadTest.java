package clase3.mesa.service;

import clase3.mesa.model.Eenvase;
import clase3.mesa.model.Producto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaDeCalidadTest {
    @Test
    @DisplayName("El producto paso todos los controles de Calidad")
    void test1(){
        Producto producto = new Producto(1990,1250, Eenvase.SANO);
        ProcesarAnalistaDeCalidad procesarAnalistaDeCalidad = new ProcesarAnalistaDeCalidad();
        String respuesta = procesarAnalistaDeCalidad.cadenaDeAnalistaDeCalidad(producto);
        assertEquals("El producto paso todos los controles de Calidad",respuesta);
    }

    @Test
    @DisplayName("Producto rechazado en Control Lote")
    void test2(){
        Producto producto = new Producto(7000,1250, Eenvase.SANO);
        ProcesarAnalistaDeCalidad procesarAnalistaDeCalidad = new ProcesarAnalistaDeCalidad();
        String respuesta = procesarAnalistaDeCalidad.cadenaDeAnalistaDeCalidad(producto);
        assertEquals("Producto rechazado en Control Lote",respuesta);
    }

    @Test
    @DisplayName("Producto rechazado en Control Peso")
    void test3(){
        Producto producto = new Producto(1290,5550, Eenvase.SANO);
        ProcesarAnalistaDeCalidad procesarAnalistaDeCalidad = new ProcesarAnalistaDeCalidad();
        String respuesta = procesarAnalistaDeCalidad.cadenaDeAnalistaDeCalidad(producto);
        assertEquals("Producto rechazado en Control Peso",respuesta);
    }

    @Test
    @DisplayName("Producto rechazado en Control Envase")
    void test4(){
        Producto producto = new Producto(1990,1250, Eenvase.ROTO);
        ProcesarAnalistaDeCalidad procesarAnalistaDeCalidad = new ProcesarAnalistaDeCalidad();
        String respuesta = procesarAnalistaDeCalidad.cadenaDeAnalistaDeCalidad(producto);
        assertEquals("Producto rechazado en Control Envase",respuesta);
    }

}