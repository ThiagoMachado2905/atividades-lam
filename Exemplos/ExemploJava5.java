import java.util.*;
public class ExemploJava5{
    public static void main(String[] args){
        double area, raio;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        raio = Double.parseDouble(teclado.next());
        area = Math.PI * Math.pow(raio,2);
        System.out.println("Área do círculo = "+ area);
    }
}
