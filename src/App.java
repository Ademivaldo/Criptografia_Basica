import java.util.Scanner;

import metodo.decode;
import metodo.encode;

public class App extends encode{

   

    public App(String texto) {
        super(texto);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        /*
         * String nome = sc.nextLine();
         * System.out.println(nome);
         * char[] array2 = nome.toCharArray();
         * System.out.println(array2);
         * System.out.println(array2[4]);
         */

        System.out.println("escreva algo: ");
        String nome = sc.nextLine();
        System.out.println("\n\n\n\n\n\n");
        encode encode = new encode(nome);
        System.out.println("Criptografado: " + encode.toString());
        System.out.println("\n\n\n\n\n\n");
        decode decode = new decode(encode.toString(), encode.tamanho());
        System.out.println("Descripptografado: " + decode.toString());
        System.out.println("\n\n\n\n");
        sc.close();
    }
}
