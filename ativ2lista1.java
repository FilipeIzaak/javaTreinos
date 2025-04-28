import java.util.Scanner;

public class ativ2lista1 {

    public static void main(String [] args){

        float altura, peso, imc;

        altura = peso = imc = 0;


        
        Scanner scanner = new Scanner();

        System.out.println("Qual seu peso?");
        Float peso = scanner.nextFloat();

        System.out.println("Qaul sua altura?");
        float altura = scanner.nextFloat();

        imc = (peso * altura)/2

        if(imc < 18.5){
            System.out.println("Você está abaixo do peso");
        } else if (imc > 25,0 || imc < 29,9){
            System.out.println("Voce tem o peso adequado");
        } else if (imc > 30 || imc < 34){
            System.out.println("Voce esta acima do peso");
        } else {
            System.out.println("Voce é obeso");
        }
    }
}I