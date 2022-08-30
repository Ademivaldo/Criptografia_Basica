package metodo;

class Global {

    static String texto;
}

public class decode {
    public decode(String texto, int tam) {
        char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        char[] array = texto.toCharArray();
        char[] array2 = new char[tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < 25; j++) {
                if (array[i] == '1')
                    array2[i] = ' ';

                else if (array[i] == alfabeto[j])
                    array2[i] = alfabeto[j - 2];
            }

        }
        Global.texto = new String(array2);

    }

    public String toString() {
        return Global.texto;
    }

}
