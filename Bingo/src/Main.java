import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int bingo[][] = new int[5][5];
        int cont = 0;
        do {
            Random aleatorio = new Random();
            int gerado = aleatorio.nextInt(15) + 1;
            for(int i =0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    switch(j) {
                        case 0:
                            bingo[i][j] = gerado+0;
                            break;
                        case 1:
                            bingo[i][j] = gerado+15;
                            break;
                        case 2:
                            bingo[i][j] = gerado+30;
                            break;
                        case 3:
                            bingo[i][j] = gerado+45;
                            break;
                        case 4:
                            bingo[i][j] = gerado+60;
                            break;
                    }
                    gerado
                    bingo[i][j] = gerado;
                }
            }
        cont++;
        } while (cont < 25);
        for (int i =0; i< 5; i++) {
            for(int j=0; j<5; j++) {
                System.out.println("[]");
            }
        }
    }
}