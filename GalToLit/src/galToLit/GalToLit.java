package galToLit;

import java.util.Scanner;

public class GalToLit {
  
   public static void main(String[] args) {
     // declare as variaveis
     double gallons=10;
     double liters=0;
     // solicite a entrada do usuário
     System.out.println("Enter a number of gallons");
     Scanner in = new Scanner(System.in);
     // adicione o calculo aqui
     gallons=in.nextDouble();
     liters=gallons*3.785;
     // exiba o resultado para o usuario
    System.out.println(gallons+"gallons equals"+liters+"liters");
   }
  
}
