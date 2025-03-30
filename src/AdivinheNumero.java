import java.util.Random;
import java.util.Scanner;

public class AdivinheNumero {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numGerado = new Random().nextInt(20);
        int tentativas = 0;
        int numDigitado = 0;

        while (tentativas < 5){
            System.out.println("Digite 0 a 20:");
            numDigitado = leitor.nextInt();
            tentativas++;

            if (numDigitado == numGerado){
                System.out.println("Acertou!");
                break;
            } else if (numDigitado < numGerado) {
                System.out.println("Numero digitado é menor do que Gerado.");
            }else{
                System.out.println("Número digitado é maior do que gerado.");
            }
        }
        if (tentativas == 5 && numDigitado != numGerado){
            System.out.println("Você não acertou! Tente Novamente. Correto: "+ numGerado);
        }
    }
}