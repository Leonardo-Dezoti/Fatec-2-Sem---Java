import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o valor de a: ");
        a = Integer.parseInt(sc.nextline());
        System.out.println("Digite o valor de b: ");
        b = Integer.parseInt(sc.nextLine());
        int opcao = 0;
        do{
            System.out.println("CALCULADORA");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("9. SAIR/ENCERRAR");
            System.out.println("Escolha sua opção");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    somar(a, b);
                    break;
                case 2:
                    subtrair(a, b);
                    break;
                case 3:
                    multiplicar(a, b);
                    break;
                case 4:
                    dividir(a, b);
                    break;
                case 9:
                    System.out.println("FIM");
                default:
                    System.out.println("Opção Inválida");
            }
        } while(opcao 1= 9);
    }

    private static void dividir(int a, int b) {
        System.out.println("Resultado: " + a/b);
    }

    private static void multiplicar(int a, int b) {
        System.out.println("Resultado: " + a*b);
    }

    private static void subtrair(int a, int b) {
        System.out.println("Resultado: " + (a-b));
    }

    private static void somar(int a, int b) {
        System.out.println("Resultado: ");
    }
}