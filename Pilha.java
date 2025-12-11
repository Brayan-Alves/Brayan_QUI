public class Pilha {

    private Metal m1;
    private Metal m2;

    public Pilha(Metal m1, Metal m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public void operar() {
        System.out.println("\n=== OPERAÇÃO DA PILHA GALVÂNICA ===\n");

        System.out.println("Metal 1: " + m1);
        System.out.println("Metal 2: " + m2 + "\n");

        if (m1.getEstado().equals("aq") && m2.getEstado().equals("aq")) {
            System.out.println("Impossível formar pilha: ambos estão em solução aquosa.");
            return;
        }

        if (m1.getEstado().equals("s") && m2.getEstado().equals("s")) {
            System.out.println("Impossível formar pilha: ambos são metais sólidos.");
            return;
        }

        if (m1.getSimboloBase().equals(m2.getSimboloBase())) {
            System.out.println("Impossível formar pilha: metal sólido e íon do mesmo elemento.");
            return;
        }

        Metal reduz;
        Metal oxida;

        if (m1.getPotencialReducao() > m2.getPotencialReducao()) {
            reduz = m1;
            oxida = m2;
        } else if (m2.getPotencialReducao() > m1.getPotencialReducao()) {
            reduz = m2;
            oxida = m1;
        } else {
            System.out.println("Potenciais iguais — pilha não funciona (E° = 0).");
            return;
        }

        double potencial = reduz.getPotencialReducao() - oxida.getPotencialReducao();

        System.out.println("-----------------------------------");
        System.out.println("Metal que oxida : " + oxida.getNome());
        System.out.println("Metal que reduz : " + reduz.getNome());
        System.out.println("-----------------------------------\n");

        System.out.println("Cálculo do Potencial da Pilha:");
        System.out.println("Eº = " + reduz.getPotencialReducao() + " - (" + oxida.getPotencialReducao() + ")");
        System.out.println("Eº = " + potencial + " V\n");

        System.out.println("Potencial total da pilha: " + potencial + " V\n");

        System.out.println("Reação Global:");
        System.out.println(oxida.getSimboloBase() + "(s) + " +
                           reduz.getSimbolo() + "(aq) → " +
                           oxida.getSimboloBase() + "2+(aq) + " +
                           reduz.getSimboloBase() + "(s)");

        System.out.println("\nA pilha é espontânea: " + (potencial > 0 ? "SIM" : "NÃO"));
        System.out.println("===================================\n");
    }
}