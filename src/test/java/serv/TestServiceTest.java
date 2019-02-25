package serv;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

import serv.TestService;
public class TestServiceTest {

	@Test
	public void testMultiplica() {
		try {
            URL url = new URL("http://localhost:8083/TestService?wsdl");
            QName qname = new QName("http://serv/","TestServiceImplService");
              
            Service service = Service.create(url, qname);
             
            TestService servMulti = service.getPort(TestService.class);
            double ressult= servMulti.multiplica(15, 2);
            assertTrue(ressult == 30);
             
            //System.out.println(hello.getMessage());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
	}

}
