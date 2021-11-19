package lab02;

import java.util.*;

public class ExchangingCardsJava {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String str;
        int num_cards_a;
        int num_cards_b;

        while (true) {
            str = teclado.nextLine();
            List<String> itens = Arrays.asList(str.split("\\s* \\s*"));
            num_cards_a = Integer.parseInt(itens.get(0));
            num_cards_b = Integer.parseInt(itens.get(1));

            if(num_cards_a == 0 && num_cards_b == 0) {
                break;
            }

            str = teclado.nextLine();
            Set<String> colecao_a = new HashSet(Arrays.asList(str.split("\\s* \\s*")));
            str = teclado.nextLine();
            Set<String> colecao_b = new HashSet(Arrays.asList(str.split("\\s* \\s*")));

            Set<String> c = colecao_b;
            int f = 0;

            if (colecao_a.size() < colecao_b.size()){
                c = colecao_a;
                colecao_a = colecao_b;
            }

            int count = 0;
            for (String x : c){
                if (!colecao_a.contains(x)) count++;
            }
            System.out.println(count);
        }
    }
}
