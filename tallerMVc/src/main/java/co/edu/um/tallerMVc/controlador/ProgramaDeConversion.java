package co.edu.um.tallerMVc.controlador;

import co.edu.um.tallerMVc.modelo.ConversorEurosPesetas;
import co.edu.um.tallerMVc.vista.InterfazVista;
import co.edu.um.tallerMVc.vista.VentanaConversor;
import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: ARENITA
 * Date: 3/08/13
 * Time: 09:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProgramaDeConversion {
    public static void main(String[] args) {
// el modelo:
        ConversorEurosPesetas modelo = new ConversorEurosPesetas();
// la vista:
        InterfazVista vista =  new VentanaConversor();
// y el control:
        ControlConversor control = new ControlConversor (vista,modelo);
        // configura la vista
        vista.setControlador(control);
// y arranca la interfaz (vista):
        vista.arranca();
    }




}
