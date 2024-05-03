package clase3.mesa.model;

public class Producto {
    private int lote;
    private double peso;
    private Eenvase envase;

    public Producto(int lote, double peso, Eenvase envase) {
        this.lote = lote;
        this.peso = peso;
        this.envase = envase;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Eenvase getEnvase() {
        return envase;
    }

    public void setEnvase(Eenvase envase) {
        this.envase = envase;
    }
}
