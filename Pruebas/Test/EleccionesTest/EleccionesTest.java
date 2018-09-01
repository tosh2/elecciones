package Test.EleccionesTest;
import Test.calculo.Calculo;
import org.junit.*;

public class EleccionesTest {


     /**
  Con esta prueba verificaremos que jUnit este funcionando  
 */
 @Test
 public void pruebaJUnit() {

  assertTrue(true);
 }

 @Test
 public void testGetCandidato() {
  

  System.out.println("getCandidato");
        String nombre = "Jose";
        Elecciones instance = new Elecciones();
        String expResult = "{\"nombre\":\""+"Jose"+"\"}";
        String result = instance.getCandidato(nombre);
        assertEquals(expResult, result);
        
 }

 

}