
package archivos_ad15;


import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 *
 * @author dam2
 */
public class Archivos_AD15 {

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

        XMLInputFactory imput = XMLInputFactory.newInstance();
        XMLStreamReader leer = imput.createXMLStreamReader(new FileReader("/home/oracle/Desktop/Archivos/autores.xml"));
        
       
        
      while (leer.hasNext()) {
           leer.next();
           
           
           if (leer.getEventType() == XMLStreamReader.START_ELEMENT) {  //No hacia falta que se leyesen los atributos, esto sobra
            String lectura=leer.getAttributeLocalName(0);
            if(lectura!= null)
            System.out.println(leer.getAttributeValue(0));         
           }
           
           
           if (leer.getEventType() == XMLStreamReader.CHARACTERS) {
             System.out.println(leer.getText());  
           }
           
           
           }
           
        }
       
    }