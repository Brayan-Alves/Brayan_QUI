import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, Double> metais = new HashMap<>();
        String metalA = null;
        String metalB = null;

        metais.put("Zinco", -0.76);
        metais.put("Cobre", 0.34);

        System.out.println("Digite qual metal deseja: ");
        int c = 1;
        for (String chave : metais.keySet()) {
            System.out.println(c+" "+chave);
            c++;
        }
        c = LER.nextInt();
        if(c == 1){
            metalA  = "Zinco";
        }else{
            metalA = "Cobre";
        }
        
        
        System.out.println("Digite qual metal deseja: ");
        c = 1;
        for (String chave : metais.keySet()) {
            System.out.println(c+" "+chave);
            c++;
        }

        c = LER.nextInt();
        if(c == 1){
            metalB  = "Zinco";
        }else{
            metalB = "Cobre";
        }
        

        if(metais.get(metalA) > metais.get(metalB)){
            System.out.println("A espécie que oxida é "+metalA);
            System.out.println("A espécie que reduz é "+metalB);
        }else if(metais.get(metalA) < metais.get(metalB)){
            System.out.println("A espécie que oxida é "+metalB);
            System.out.println("A espécie que reduz é "+metalA);
        }else{
            System.out.println("Deu erro!");
        }
    }
}