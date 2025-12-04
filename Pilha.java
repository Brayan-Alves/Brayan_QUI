public class Pilha {

    private Metal m1;
    private Metal m2;

    public Pilha(Metal m1, Metal m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public void calcular() {
        System.out.println("=== OPERAÇÃO DA PILHA GALVÂNICA ===\n");

        System.out.println("Metal 1: " + m1.getNome() + " (" + m1.getSimbolo() + ")");
        System.out.println("Estado: " + m1.getEstado());
        System.out.println("Potencial de Redução: " + m1.getPotencialReducao() + " V\n");
        System.out.println("Metal 2: " + m2.getNome() + " (" + m2.getSimbolo() + ")");
        System.out.println("Estado: " + m2.getEstado());
        System.out.println("Potencial de Redução: " + m2.getPotencialReducao() + " V\n");
        if (m1.getPotencialReducao() == m2.getPotencialReducao()) {
            System.out.println("-----------------------------------");
            System.out.println("Ambos possuem o mesmo potencial!");
            System.out.println("Não ocorre reação de oxirredução.");
            System.out.println("Potencial total da pilha: 0.00 V");
            System.out.println("===================================");
            return;
        }

        Metal reduz = (m1.getPotencialReducao() > m2.getPotencialReducao()) ? m1 : m2;
        Metal oxida = (reduz == m1) ? m2 : m1;

        System.out.println("-----------------------------------");
        System.out.println("Metal que oxida : " + oxida.getNome() + " (" + oxida.getSimbolo() + ")");
        System.out.println("Metal que reduz : " + reduz.getNome() + " (" + reduz.getSimbolo() + ")");
        System.out.println("-----------------------------------\n");

        double potencial = reduz.getPotencialReducao() - oxida.getPotencialReducao();

        System.out.println("Cálculo do Potencial da Pilha:");
        System.out.println("Eº = Eº(cátodo) - Eº(ânodo)");
        System.out.printf("Eº = %.2f - (%.2f)\n", reduz.getPotencialReducao(), oxida.getPotencialReducao());
        System.out.printf("Eº = %.2f V\n\n", potencial);

        System.out.printf("Potencial total da pilha: %.2f V\n\n", potencial);

        System.out.println("Reação Global:");
        System.out.println(oxida.getSimbolo() + "(" + oxida.getEstado() + ") + "
                + reduz.getSimbolo() + "2+(aq) → "
                + oxida.getSimbolo() + "2+(aq) + " + reduz.getSimbolo() + "(" + reduz.getEstado() + ")\n");
        System.out.println("===================================");
    }
}