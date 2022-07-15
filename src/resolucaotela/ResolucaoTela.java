package resolucaotela;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension size = tk.getScreenSize();
        System.out.println("A resolucao do sistema e de: " + size.width + " X " + size.height);
    }
}
