package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale regiao = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(regiao.getDisplayLanguage());
    }
}
