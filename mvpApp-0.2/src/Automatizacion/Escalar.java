package Automatizacion;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Escalar {

    public void escalarLabel(JLabel label, String rutaImagen) {
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(rutaImagen)).getImage()
                .getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
    }
}
