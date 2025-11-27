public class PilhaEletrica {
    private Metal m1;
    private Metal m2;

    public PilhaEletrica(Metal m1, Metal m2){
        this.m1 = m1;
        this.m2 = m2;
    }

    public void calcularPilha(){
        if(m1.getPotencialReducao() == m2.getPotencialReducao()){
            System.out.println("Os potenciasi são igual, logo a pilha não gera corrente");
            System.exit(0);
        }
        Metal reduz = null;
        Metal oxida = null;

        if(m1.getPotencialReducao() > m2.getPotencialReducao()){
            reduz = m1;
            oxida = m2;
        }else if(m1.getPotencialReducao() < m2.getPotencialReducao()){
            reduz = m2;
            oxida = m1;
        }

        double potenciaTotal = reduz.getPotencialReducao() - oxida.getPotencialReducao();
        System.out.println("\nMetal que REDUZ(cátodo): " + reduz.getNome() + "(" + reduz.getSimbolo() + ", " + reduz.getEstado()+")");
        System.out.println("Metal que OXIDA(ânodo): " + oxida.getNome() + "(" + oxida.getSimbolo() + ", " + oxida.getEstado()+")");
        System.out.println("Potencia Total: " + potenciaTotal);

    }
}
