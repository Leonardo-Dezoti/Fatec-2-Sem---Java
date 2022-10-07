public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.setMarca("HP");
        computador1.setCor("Prata");
        computador1.setModelo("Pavilon");
        computador1.setNumeroSerie(123);
        computador1.setPreco(5000);
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.setMarca("IBM");
        computador2.setCor("Preto");
        computador2.setModelo("New");
        computador2.setNumeroSerie(234);
        computador2.setPreco(10000);
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();
        int valorDeRetorno = computador2.alterarValor(6000);
        if(valorDeRetorno ==1){
            System.out.println("Valor alterado");
        }
        else {
            System.out.println("Valor não alterado");
        }
        computador2.imprimir();
    }
}