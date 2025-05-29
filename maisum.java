import java.util.Scanner;


public class maisum {

  public static void main(String[] args) {

    int i, filhos, maismil;
    float sal, mediasal, mediafilhos, maiorsal, totalsal, totalfilhos, perc;
    Scanner scanner = new Scanner(System.in);

    maismil = i = filhos = 0;
    perc = sal = mediasal = mediafilhos = maiorsal = 0;

    System.out.println("Quantas pessoas voce quer cadastrar?");
    i = scanner.nextInt();
    System.out.println("Digite o salário da primeira pessoa:");
    sal = scanner.nextFloat();
    System.out.println("Quantos filhos essa pessoa tem?");
    i = i - 1;
    totalsal = sal;
    totalfilhos = filhos;

    do {
      System.out.println("Digite o salário da " + (i + 1) + " ª pessoa");
      sal = scanner.nextFloat();
      System.out.println("quantos filhos a " + (i + 1) + " ª pessoa tem?");
      filhos = scanner.nextInt();

      if (sal > maiorsal) {
        maiorsal = sal;

      }
      ;
      if (sal > 1000.0) {
        System.out.println("Esta pessoa recebe mais que 1000 reais");
        maismil++;
      }

      totalsal = totalsal + sal;
      totalfilhos = totalfilhos + filhos;
      i--;
    } while (i < 0);

    mediasal = totalsal / i;
    mediafilhos = filhos / i;
    perc = (maismil * 100) / i;

    System.out.println("A média salarial por pessoa é de " + mediasal);
    System.out.println("A média de filhos por pessoa é de " + mediafilhos);
    System.out.println("Este é o maior salário " + maiorsal);
    System.out.println("Este é o percentual de pessoas que recebem mais que mil reais" + perc);

  }

}