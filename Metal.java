public class Metal {
    String nome;
    String simbolo;
    String estado;
    double potencialReducao;

    public Metal(String nome, String simbolo, String estado, double potencialReducao) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.potencialReducao = potencialReducao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeMetal) {
        this.nome = nomeMetal;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPotencialReducao() {
        return potencialReducao;
    }

    public void setPotencialReducao(double potencialReducao) {
        this.potencialReducao = potencialReducao;
    }
    
}
