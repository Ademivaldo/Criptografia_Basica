package metodo;


class Global {
    static int tam = 0;
    static String texto;
}

public class encode {

    public encode(String texto) {
        char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        char[] array = texto.toCharArray();
        char[] array2 = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j < 25; j++) {
                if (array[i] == ' ')
                    array2[i] = '1';

                else if (array[i] == alfabeto[j])
                    array2[i] = alfabeto[j + 2];
            }

        }

        Global.tam = array2.length;
        Global.texto =  new String(array2);

    }

    public int tamanho() {
        return Global.tam;
    }

    public String toString() {
        return Global.texto;
    }

}
//
// System.out.println();
// String[] array = texto.split("(?!^)");