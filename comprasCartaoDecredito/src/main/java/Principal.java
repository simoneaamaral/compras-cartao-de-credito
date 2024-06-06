import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o limite do cartão: ");
        double limite = sc.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;

        while (sair != 0) {
            System.out.println("\nDigite o nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            Compra compra1 = new Compra(nome,preco);
            boolean compraRealizada = cartao.lancaCompra(compra1);
            if (compraRealizada) {
                System.out.println("\nCompra realizada com sucesso!");
                System.out.println("\nDigite 0 sair");
                System.out.println("Digite 1 nova compra");
                sair = sc.nextInt();
            }
            else {
                System.out.println("\nCompra negada, valor ultrapassa o limite disponível");
                System.out.println("\n---------------------------------------------");
                System.out.println("COMPRAS REALIZADAS:\n");
                Collections.sort(cartao.getCompras());
                for (Compra compra : cartao.getCompras()) {
                    System.out.println(compra.getNomeProduto() + " - " + compra.getPrecoProduto());
                }
                System.out.println("\n---------------------------------------------");
                System.out.println("\nLimite disponível: R$" + cartao.getSaldoDisponivel());
                sair = 0;

            }


        }



    }
}
