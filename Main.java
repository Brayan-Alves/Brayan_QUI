import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        List<Metal> metais = carregarMetais();


        System.out.println("Selecione duas espécies: ");
        int cont = 1;
        for (Metal metal : metais) {
            System.out.println((cont) + " - Nome: " + metal.getNome() + " | Símbolo: " + metal.getSimbolo() + " | Estado: " + metal.getEstado() + " | Potencial de Redução: " + metal.getPotencialReducao());
            cont++;
        }
        

        System.out.print("\nEscolha o número da primeira espécie: ");
        int x = LER.nextInt();
        System.out.print("Escolha o número da segunda espécie: ");
        int y = LER.nextInt();

        Metal m1 = metais.get(x-1);
        Metal m2 = metais.get(y-1);

        Pilha pilha = new Pilha(m1, m2);
        pilha.calcular();
    }
    
    public static List<Metal> carregarMetais() {

        List<Metal> lista = new ArrayList<>();

        lista.add(new Metal("Lítio", "Li", -3.04, "s"));
        lista.add(new Metal("Potássio", "K", -2.93, "s"));
        lista.add(new Metal("Cálcio", "Ca", -2.87, "s"));
        lista.add(new Metal("Sódio", "Na", -2.71, "s"));
        lista.add(new Metal("Magnésio", "Mg", -2.37, "s"));
        lista.add(new Metal("Alumínio", "Al", -1.66, "s"));
        lista.add(new Metal("Zinco", "Zn", -0.76, "s"));
        lista.add(new Metal("Ferro", "Fe", -0.44, "s"));
        lista.add(new Metal("Níquel", "Ni", -0.23, "s"));
        lista.add(new Metal("Estanho", "Sn", -0.14, "s"));
        lista.add(new Metal("Chumbo", "Pb", -0.13, "s"));
        lista.add(new Metal("Hidrogênio", "H2", 0.00, "g"));
        lista.add(new Metal("Cobre", "Cu", 0.34, "s"));
        lista.add(new Metal("Prata", "Ag", 0.80, "s"));
        lista.add(new Metal("Mercúrio", "Hg", 0.85, "l"));
        lista.add(new Metal("Platina", "Pt", 1.20, "s"));
        lista.add(new Metal("Ouro", "Au", 1.50, "s"));
        lista.add(new Metal("Paládio", "Pd", 0.95, "s"));
        lista.add(new Metal("Índio", "In", -0.34, "s"));
        lista.add(new Metal("Manganês", "Mn", -1.18, "s"));

        return lista;
    }

}
