import java.util.Scanner;

public class ExercicioJavaDesafio{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);        
        int num;
        int b;
        String numem = ""; 
        StringBuffer str = new StringBuffer();
        System.out.println("Digite um numero: ");
        num = input.nextInt();
        while(num!=0){
            b = num % 2;
            numem = Integer.toString(b);
            str.append(numem);
            num = num/2;
        }
        str.reverse();
        System.out.println(str);
    }
}
