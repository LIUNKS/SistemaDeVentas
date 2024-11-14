package Controlador;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Validacion {

    //PERMITE SOLO CARACTERES
    public void permitirSoloLetras(KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume(); // Ignora el evento si no es una letra o espacio
        }
    }

    //PERMITE SOLO NUMEROS
    public void permitirSoloNumeros(KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume(); // Ignora el evento si no es un número
        }
    }

    //PERMITE SOLO DECIMALES Y PUNTO DECIMAL
    public void permitirSoloDecimales(KeyEvent evt, JTextField textField) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && textField.getText().contains(".") && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume(); // Ignora el evento si no es un número o un punto decimal único
        } else if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

}
