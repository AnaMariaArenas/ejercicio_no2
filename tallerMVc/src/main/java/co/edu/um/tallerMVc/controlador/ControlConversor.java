package co.edu.um.tallerMVc.controlador;

import co.edu.um.tallerMVc.modelo.ConversorEurosPesetas;
import co.edu.um.tallerMVc.vista.InterfazVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: ARENITA
 * Date: 3/08/13
 * Time: 09:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class ControlConversor implements ActionListener {

        private InterfazVista vista;
        private ConversorEurosPesetas modelo ;
        public ControlConversor(InterfazVista vista, ConversorEurosPesetas modelo)
        {
            this.vista = vista;
            this.modelo= modelo;
        }
        public void actionPerformed(ActionEvent evento)
        {
            double cantidad = vista.getCantidad();

         if( evento.getActionCommand().equals(InterfazVista.AEUROS )
           ) {
            vista.escribeCambio( cantidad + " pesetas son: "+ modelo.pesetasAeuros(cantidad) + " euros" );
         }
         else if
                 (
                 evento.getActionCommand().equals(InterfazVista. APESETAS )
                 ) {
             vista.escribeCambio(cantidad + " euros son: " + modelo.eurosApesetas(cantidad) + " pesetas");
            }
            else
                vista .escribeCambio( "ERROR"  );



        }
    }



