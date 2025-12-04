import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        List<Metal> metais = criarMetais();


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

    public static List<Metal> criarMetais(){
        List<Metal> metais = new ArrayList<>();
        metais.add(new Metal("Cobre", "Cu", "s", 0.34));
        metais.add(new Metal("Íon cobre II", "Cu2+", "aq", 0.34));
        metais.add(new Metal("Zinco", "Zn", "s", -0.76));
        metais.add(new Metal("Íon zinco II", "Zn2+", "s", -0.76));
        metais.add(new Metal("Lítio", "Li", "s", -3.04));
        metais.add(new Metal("Íon lítio", "Li+", "aq", -3.04));
        metais.add(new Metal("Potássio", "K", "s", -2.93));
        metais.add(new Metal("Íon potássio", "K+", "aq", -2.93));
        metais.add(new Metal("Cálcio", "Ca", "s", -2.87));
        metais.add(new Metal("Íon cálcio", "Ca2+", "aq", -2.87));
        metais.add(new Metal("Sódio", "Na", "s", -2.71));
        metais.add(new Metal("Íon sódio", "Na+", "aq", -2.71));
        metais.add(new Metal("Alumínio", "Al", "s", -1.66));
        metais.add(new Metal("Íon alumínio", "Al3+", "aq", -1.66));
        metais.add(new Metal("Magnésio", "Mg", "s", -2.37));
        metais.add(new Metal("Íon magnésio", "Mg2+", "aq", -2.37));
        metais.add(new Metal("Ferro", "Fe", "s", -0.44));
        metais.add(new Metal("Íon ferro II", "Fe2+", "aq", -0.44));
        return metais;
    }
}
