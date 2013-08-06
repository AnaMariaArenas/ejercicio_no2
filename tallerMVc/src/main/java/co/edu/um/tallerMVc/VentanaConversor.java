package co.edu.um.tallerMVc.vista;

import co.edu.um.tallerMVc.controlador.ControlConversor;
import co.edu.um.tallerMVc.vista.InterfazVista;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Arenitas
 * Date: 3/08/13
 * Time: 20:11
 * To change this template use File | Settings | File Templates.
 */
    public class VentanaConversor extends JFrame implements InterfazVista {
    private JButton convertirApesetas;
    private JButton convertirAeuros;
    private JTextField cantidad;
    private JLabel resultado;
    public VentanaConversor () {
        super("Conversor de Euros y Pesetas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout(10,10));
        cantidad = new JTextField(8);
        JPanel panelaux = new JPanel(); panelaux.add(cantidad);
        panelPrincipal.add(panelaux, BorderLayout.NORTH);
        resultado = new JLabel("Indique una cantidad y pulse uno de los botones");
        JPanel panelaux2 = new JPanel(); panelaux2.add(resultado);
        panelPrincipal.add(panelaux2, BorderLayout.CENTER);
        convertirApesetas = new JButton("A pesetas");
        convertirApesetas.setActionCommand(APESETAS);
        convertirAeuros = new JButton("A euros");
        convertirAeuros.setActionCommand(AEUROS);
        JPanel botonera = new JPanel();
        botonera.add(convertirApesetas); botonera.add(convertirAeuros);
        panelPrincipal.add(botonera, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);
    }

    @Override
    public void setControlador(ControlConversor c) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void arranca() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getCantidad() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void escribeCambio(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}