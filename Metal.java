public class Metal {
    private String simbolo; 
    private String estado; 
    private double potencial; 
    private int eletrons; 

    public Metal(String simbolo, String estado, double potencial, int eletrons) {
        this.simbolo = simbolo;
        this.estado = estado;
        this.potencial = potencial;
        this.eletrons = eletrons;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String getEstado() {
        return estado;
    }

    public double getPotencial() {
        return potencial;
    }

    public int getEletrons() {
        return eletrons;
    }

    @Override
    public String toString() {
        return simbolo + " | E =" + potencial + "V";
    }
}