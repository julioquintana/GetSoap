
package serv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serv package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MultiplicaResponse_QNAME = new QName("http://serv/", "multiplicaResponse");
    private final static QName _Multiplica_QNAME = new QName("http://serv/", "multiplica");
    private final static QName _GetMessage_QNAME = new QName("http://serv/", "getMessage");
    private final static QName _GetMessageResponse_QNAME = new QName("http://serv/", "getMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Multiplica }
     * 
     */
    public Multiplica createMultiplica() {
        return new Multiplica();
    }

    /**
     * Create an instance of {@link MultiplicaResponse }
     * 
     */
    public MultiplicaResponse createMultiplicaResponse() {
        return new MultiplicaResponse();
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serv/", name = "multiplicaResponse")
    public JAXBElement<MultiplicaResponse> createMultiplicaResponse(MultiplicaResponse value) {
        return new JAXBElement<MultiplicaResponse>(_MultiplicaResponse_QNAME, MultiplicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serv/", name = "multiplica")
    public JAXBElement<Multiplica> createMultiplica(Multiplica value) {
        return new JAXBElement<Multiplica>(_Multiplica_QNAME, Multiplica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serv/", name = "getMessage")
    public JAXBElement<GetMessage> createGetMessage(GetMessage value) {
        return new JAXBElement<GetMessage>(_GetMessage_QNAME, GetMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serv/", name = "getMessageResponse")
    public JAXBElement<GetMessageResponse> createGetMessageResponse(GetMessageResponse value) {
        return new JAXBElement<GetMessageResponse>(_GetMessageResponse_QNAME, GetMessageResponse.class, null, value);
    }

}
