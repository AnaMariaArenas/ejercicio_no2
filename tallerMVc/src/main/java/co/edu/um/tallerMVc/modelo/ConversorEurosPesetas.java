package co.edu.um.tallerMVc.modelo;
import co.edu.um.tallerMVc.modelo.ConversorEuros;
import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: ARENITA
 * Date: 3/08/13
 * Time: 06:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConversorEurosPesetas extends  ConversorEuros{
    // Adaptador de objetos
    private  ConversorEuros conversor;




    public ConversorEurosPesetas() {
        super (166.386D);
    }
    public double eurosApesetas(
            double cantidad) {
        return
                eurosAmoneda(cantidad);
    }
    public double pesetasAeuros(
            double cantidad) {
        return
                monedaAeuros(cantidad);
    }

}
