public class Metal {

    private String nome;
    private String simbolo;
    private double potencialReducao;
    private String estado;

    public Metal(String nome, String simbolo, double potencialReducao, String estado) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.potencialReducao = potencialReducao;
        this.estado = estado;
    }

    public String getNome() { return nome; }
    public String getSimbolo() { return simbolo; }
    public double getPotencialReducao() { return potencialReducao; }
    public String getEstado() { return estado; }

    public String getSimboloBase() {
        return simbolo.replaceAll("[0-9+]+", "");
    }

    @Override
    public String toString() {
        return nome + " (" + simbolo + ") - " + estado + " - E° = " + potencialReducao + " V";
    }
}