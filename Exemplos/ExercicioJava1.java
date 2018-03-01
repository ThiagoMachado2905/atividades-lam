import java.util.Scanner;
public class ExercicioJava1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome do funcionario:");
        String nome = "";
        nome = input.next();
        System.out.println("Informe as horas: ");
        int d;
        d = input.nextInt();
        System.out.println("Informe o valor pago por hora: ");
        int valor = 0;
        valor = input.nextInt();
        System.out.println("O funcionario "+nome+ "e ele receberá: "+ valor*d+ "R$");       
    }


}
