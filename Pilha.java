public class Pilha {

    public static void gerarPilha(Metal m1, Metal m2) {

        if (m1.getEstado().equals("s") && m2.getEstado().equals("s")) {
            System.out.println("Impossível: não há espécie iônica para reduzir.");
            return;
        }

        if (m1.getEstado().equals("aq") && m2.getEstado().equals("aq")) {
            System.out.println("Impossível: não há metal sólido para oxidar.");
            return;
        }

        String base1 = m1.getSimbolo().replaceAll("[0-9+]+", "");
        String base2 = m2.getSimbolo().replaceAll("[0-9+]+", "");
        if (base1.equals(base2)) {
            System.out.println("Impossível: metal e íon do mesmo elemento não formam pilha.");
            return;
        }

        Metal reducao;
        Metal oxidacao;

        if (m1.getEstado().equals("aq")) {
            reducao = m1;
            oxidacao = m2;
        } else if (m2.getEstado().equals("aq")) {
            reducao = m2;
            oxidacao = m1;
        } else {
            if (m1.getPotencial() > m2.getPotencial()) {
                reducao = m1;
                oxidacao = m2;
            } else {
                reducao = m2;
                oxidacao = m1;
            }
        }

        double volts = reducao.getPotencial() - oxidacao.getPotencial();

        System.out.println("\n===== PILHA GERADA =====");
        System.out.println("Redução: " + reducao.getSimbolo());
        System.out.println("Oxidação: " + oxidacao.getSimbolo());
        System.out.printf("Voltagem: %.2f V\n", volts);

        int eRed = reducao.getEletrons();
        int eOx = -oxidacao.getEletrons();

        int mmc = mmc(eRed, eOx);

        int coefRed = mmc / eRed;
        int coefOx = mmc / eOx;

        System.out.println("\n===== EQUAÇÃO BALANCEADA =====");

        System.out.println(coefOx + " " + oxidacao.getSimbolo() + " + " +
                           coefRed + " " + reducao.getSimbolo()
        );

        System.out.println("→");

        System.out.println(coefOx + " " + oxidacao.getSimbolo().replace("(s)", "2+(aq)") +
                " + " +
                coefRed + " " + reducao.getSimbolo().replace("(aq)", "(s)"));

        if(volts > 0){
            System.out.println("A pilha é espontânea");
        }else{
            System.out.println("A pilha não é espontânea");
        }
    }

    private static int mmc(int a, int b) {
        return a * b / mdc(a, b);
    }

    private static int mdc(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}