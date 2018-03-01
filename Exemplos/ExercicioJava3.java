import java.util.Scanner;
import java.util.Random;
public class ExercicioJava3{
    public static void main(String[] args){
        int numero;
        int erros = 0;
        int num = 0;
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        numero = r.nextInt(10)+1;
        while((numero!=num) & (erros != 3)){
            System.out.println("Adivinhe o numero:");
            num = input.nextInt();
            if(num == numero){
                System.out.println("Parabens voce acertou");
            }else{
                erros++;
            }
        }
        if (erros == 3){
            System.out.println("O numero era: "+numero);
        }
    }

}
