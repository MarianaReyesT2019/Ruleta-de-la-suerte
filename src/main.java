import java.util.Random;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        String ca;
        String name;
        Scanner suc = new Scanner(System.in);
        System.out.println("-------------Cual es tu nombre----------------");
        name = suc.nextLine();
        System.out.println("-------------Ingresa un numero para canjear tu premio----------------");
        ca = suc.nextLine();

        String[] suerte = {"-Un dia con tu artista favorito", "-Un galon de nutella", "-Las gemas del infinito", "-Un beso de tu crush",
                "-Ya te chupo a bruja, no te toco nada :("};
        System.out.println("----------------Los premios son: -----------------");
        for (int i = 0; i < 5; i++){
            System.out.println(suerte[i]);

        }




            String carro = (suerte[new Random().nextInt(suerte.length)]);
            System.out.println("\n"+ "Tu premio es..." +"\n"+ carro);
            System.out.println("\n"+ "FELICIDADES!!" +"\n" +name);



    }

}