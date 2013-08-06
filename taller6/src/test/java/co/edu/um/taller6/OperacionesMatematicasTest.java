package co.edu.um.taller6;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Realiza las pruebas unitarias para la clases OperacionesMatematicas
 */
public class OperacionesMatematicasTest {
    @Test
    public void testSuma() throws Exception {
        OperacionesMatematicas op = new OperacionesMatematicas();
        Assert.assertNotNull(op);
        Assert.assertEquals(5,op.suma(3,2));
        Assert.assertEquals(-3,op.suma(-2,-1));


    }

    @Test
    public void testResta() throws Exception {
        OperacionesMatematicas op = new OperacionesMatematicas();
        Assert.assertNotNull(op);
        Assert.assertEquals(-1,op.resta(3,2));
        Assert.assertEquals(-3,op.resta(-2,-1));

    }

    @Test
    public void testMutiplicacion() throws Exception {
        OperacionesMatematicas op = new OperacionesMatematicas();
        Assert.assertNotNull(op);
        Assert.assertEquals(6,op.mutiplicacion(3,2));
        Assert.assertEquals(-2,op.mutiplicacion(2,-1));
    }

    @Test
    public void testDivision() throws Exception {
        OperacionesMatematicas op = new OperacionesMatematicas();
        Assert.assertNotNull(op);
        // Assert.assertEquals(2,5 ,op.mutiplicacion(5,2));
        op.division(2,0) ;


    }
}
