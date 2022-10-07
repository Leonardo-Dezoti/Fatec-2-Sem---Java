public class Main {
    public static void main(String[] args) {
        String strValor = "989.99";
        double desconto = Double.parseDouble(strValor) * 0.1;

        System.out.printf("Desconto: %.3f \n", desconto);

        String mensagem;
        mensagem = "O desconto é de ";
        String strDesconto = Double.toHexString(desconto);
        mensagem += strDesconto + " só para hoje";
        System.out.println(mensagem);
    }
}