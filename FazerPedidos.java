import java.util.Scanner;

public class FazerPedidos {

    float Hamburguer = 8.00f;

    float Cheeseburger = 12.50f;

    float Fritas = 7.50f;

    float Refrigerante = 5.00f;

    float Milkshake = 13.00f;

    float ch;
    float quantidade;
    float total;
    String again;

    Scanner sc = new Scanner(System.in);


    public void displayMenu() {
        System.out.println("1.Hambúrguer R$ 8,00");
        System.out.println("2.Cheeseburguer R$ 12,50");
        System.out.println("3.Fritas R$ 7,50");
        System.out.println("4.Refrigerante R$ 5,00");
        System.out.println("5.Milkshake R$ 13,00");
        System.out.println("6.Sair");
    }


    public void gerarConta() {
        System.out.println();
        System.out.println("Obrigado pelo pedido!");
        System.out.println("Sua conta é: " + total);
    }

    public void pedido() {
        while (true) {
            System.out.print("Faça sua escolha: ");
            ch = sc.nextInt();
            switch ((int) ch) {
                case 1 -> {
                    System.out.println("Você selecionou Hamburguer!");
                    System.out.println();
                    System.out.println("Escolha a quantidade: ");
                    quantidade = sc.nextInt();
                    total = total + quantidade * Hamburguer;
                }
                case 2 -> {
                    System.out.println("Você selecionou Cheeseburger!");
                    System.out.println();
                    System.out.println("Escolha a quantidade: ");
                    quantidade = sc.nextInt();
                    total = total + quantidade * Cheeseburger;
                }
                case 3 -> {
                    System.out.println("Você selecionou Fritas!");
                    System.out.println();
                    System.out.println("Escolha a quantidade: ");
                    quantidade = sc.nextInt();
                    total = total + quantidade * Fritas;
                }
                case 4 -> {
                    System.out.println("Você selecionou Refrigerante");
                    System.out.println();
                    System.out.println("Escolha a quantidade: ");
                    quantidade = sc.nextInt();
                    total = total + quantidade * Refrigerante;
                }
                case 5 -> {
                    System.out.println("Você selecionou Milkshake");
                    System.out.println();
                    System.out.println("Escolha a quantidade: ");
                    quantidade = sc.nextFloat();
                    total = total + quantidade * Milkshake;
                }
                case 6 -> System.exit(1);
                default -> {
                }
            }
            System.out.println();
            System.out.print("Deseja pedir mais alguma coisa? (S/N) : ");
            again = sc.next();
            if (again.equalsIgnoreCase("S")) {
                pedido();
            } else if (again.equalsIgnoreCase("N")) {
                gerarConta();
                System.exit(1);
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
}
