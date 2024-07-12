public class cifrado_cesar {

    public static String cifrar(String texto, int desplazamiento) {
        StringBuilder sb = new StringBuilder(texto);
        int ch = 0;
        String word = "";
        if (desplazamiento % 26 == 0 || desplazamiento == 0) {
            return sb.toString();
        } else {
            for (int i = 0; i < texto.length(); i++) {
                ch = sb.charAt(i);
                if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                    ch = ch + desplazamiento;
                    if (!((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))) {
                        ch = ch - 26;
                    }
                }
                word = String.valueOf(Character.toString(ch));
                sb.replace(i, i + 1, word);
            }
        }
        return sb.toString();
    }    
}
