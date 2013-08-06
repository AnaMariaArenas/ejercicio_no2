package co.edu.um.tallerMVc.modelo;
import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: ARENITA
 * Date: 3/08/13
 * Time: 06:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConversorEuros {
    private double  cambio ;



    public ConversorEuros (
            double valorCambio ) {
// valor en la moneda de 1
        double cambio = valorCambio;
    }
    public double eurosAmoneda (
            double cantidad) {
        return
                cantidad * cambio
                ;
    }
    public double monedaAeuros (
            double cantidad) {
        return
                cantidad / cambio
                ;
    }
}
