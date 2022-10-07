import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Gerar numeros aleatorios entre
        //1 e 60 (sem repetir)
        //precisamos de 06 numeros para um vetor
        int nums[] = new int[6];
        int cont = 0;
        do{
            Random aleatorio = new Random();
            boolean tem = false;
            int gerado = (aleatorio.nextInt(60)) + 1;
            for(int i = 0; i < cont; i++) {
                if(nums[i] == gerado) {
                    tem = true;
                    break;
                }
            }
            if(tem) continue;
            nums[cont] = gerado;
            cont++;
        }while (cont < 6);
        for (int i =0;i<6;i++) {
            System.out.println("[%d]", nums[i]);

        }
    }

}