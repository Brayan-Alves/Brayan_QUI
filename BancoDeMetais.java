import java.util.ArrayList;
import java.util.List;

public class BancoDeMetais {

    public static List<Metal> criarMetais() {
        List<Metal> lista = new ArrayList<>();

        lista.add(new Metal("Li(s)", "s", -3.04, -1));
        lista.add(new Metal("K(s)", "s", -2.93, -1));
        lista.add(new Metal("Ca(s)", "s", -2.87, -2));
        lista.add(new Metal("Na(s)", "s", -2.71, -1));
        lista.add(new Metal("Mg(s)", "s", -2.37, -2));
        lista.add(new Metal("Al(s)", "s", -1.66, -3));
        lista.add(new Metal("Zn(s)", "s", -0.76, -2));
        lista.add(new Metal("Fe(s)", "s", -0.44, -2));
        lista.add(new Metal("Ni(s)", "s", -0.23, -2));
        lista.add(new Metal("Sn(s)", "s", -0.14, -2));
        lista.add(new Metal("Pb(s)", "s", -0.13, -2));
        lista.add(new Metal("H2(g)", "g", 0.00, -2));
        lista.add(new Metal("Cu(s)", "s", +0.34, -2));
        lista.add(new Metal("Hg(l)", "l", +0.79, -2));
        lista.add(new Metal("Ag(s)", "s", +0.80, -1));
        lista.add(new Metal("Au(s)", "s", +1.50, -3));

        lista.add(new Metal("Li+(aq)", "aq", -3.04, +1));
        lista.add(new Metal("K+(aq)", "aq", -2.93, +1));
        lista.add(new Metal("Ca2+(aq)", "aq", -2.87, +2));
        lista.add(new Metal("Na+(aq)", "aq", -2.71, +1));
        lista.add(new Metal("Mg2+(aq)", "aq", -2.37, +2));
        lista.add(new Metal("Al3+(aq)", "aq", -1.66, +3));
        lista.add(new Metal("Zn2+(aq)", "aq", -0.76, +2));
        lista.add(new Metal("Fe2+(aq)", "aq", -0.44, +2));
        lista.add(new Metal("Ni2+(aq)", "aq", -0.23, +2));
        lista.add(new Metal("Sn2+(aq)", "aq", -0.14, +2));
        lista.add(new Metal("Pb2+(aq)", "aq", -0.13, +2));
        lista.add(new Metal("H+(aq)", "aq", 0.00, +1));
        lista.add(new Metal("Cu2+(aq)", "aq", +0.34, +2));
        lista.add(new Metal("Ag+(aq)", "aq", +1.67, +1));
        lista.add(new Metal("Hg2+(aq)", "aq", +0.79, +2));
        lista.add(new Metal("Au3+(aq)", "aq", +1.50, +3));

        return lista;
    }
}