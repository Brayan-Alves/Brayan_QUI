import java.util.*;

public class Main {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        List<Metal> metais = BancoDeMetais.criarMetais();


        System.out.println("===== LISTA DE METAIS =====");
        for (int i = 0; i < metais.size(); i++) {
            System.out.println(i + " - " + metais.get(i));
        }

        System.out.print("\nEscolha a espécie 1: ");
        Metal m1 = metais.get(LER.nextInt());

        System.out.print("Escolha a espécie 2: ");
        Metal m2 = metais.get(LER.nextInt());

        Pilha.gerarPilha(m1, m2);
    }
}
