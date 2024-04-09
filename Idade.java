
import java.util.Scanner;
class Idade{

    public static void main(String[] args){

        int idade;
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        boolean resultado = idade >=18;

        if (resultado){

            System.out.println("Maior de idade");
        }else{

            System.out.println("Menor de idade");
        }




    

    }
}