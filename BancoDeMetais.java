import java.util.ArrayList;
import java.util.List;

public class BancoDeMetais {

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
        lista.add(new Metal("Zinco (íon)", "Zn2+", -0.76, "aq"));
        lista.add(new Metal("Ferro (íon)", "Fe2+", -0.44, "aq"));
        lista.add(new Metal("Níquel (íon)", "Ni2+", -0.23, "aq"));
        lista.add(new Metal("Estanho (íon)", "Sn2+", -0.14, "aq"));
        lista.add(new Metal("Chumbo (íon)", "Pb2+", -0.13, "aq"));
        lista.add(new Metal("Cobre (íon)", "Cu2+", 0.34, "aq"));
        lista.add(new Metal("Prata (íon)", "Ag+", 0.80, "aq"));
        lista.add(new Metal("Mercúrio (íon)", "Hg2+", 0.85, "aq"));
        lista.add(new Metal("Platina (íon)", "Pt2+", 1.20, "aq"));
        lista.add(new Metal("Ouro (íon)", "Au3+", 1.50, "aq"));

        return lista;
    }
}