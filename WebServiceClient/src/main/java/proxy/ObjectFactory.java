
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _Releve_QNAME = new QName("http://QuestionC/", "releve");
    private final static QName _GetReleve_QNAME = new QName("http://QuestionC/", "getReleve");
    private final static QName _JAXBException_QNAME = new QName("http://QuestionC/", "JAXBException");
    private final static QName _GetReleveResponse_QNAME = new QName("http://QuestionC/", "getReleveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReleve }
     * 
     */
    public GetReleve createGetReleve() {
        return new GetReleve();
    }

    /**
     * Create an instance of {@link Releve }
     * 
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link GetReleveResponse }
     * 
     */
    public GetReleveResponse createGetReleveResponse() {
        return new GetReleveResponse();
    }

    /**
     * Create an instance of {@link JAXBException }
     * 
     */
    public JAXBException createJAXBException() {
        return new JAXBException();
    }

    /**
     * Create an instance of {@link Operations }
     * 
     */
    public Operations createOperations() {
        return new Operations();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionC/", name = "releve")
    public JAXBElement<Releve> createReleve(Releve value) {
        return new JAXBElement<Releve>(_Releve_QNAME, Releve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReleve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionC/", name = "getReleve")
    public JAXBElement<GetReleve> createGetReleve(GetReleve value) {
        return new JAXBElement<GetReleve>(_GetReleve_QNAME, GetReleve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionC/", name = "JAXBException")
    public JAXBElement<JAXBException> createJAXBException(JAXBException value) {
        return new JAXBElement<JAXBException>(_JAXBException_QNAME, JAXBException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReleveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://QuestionC/", name = "getReleveResponse")
    public JAXBElement<GetReleveResponse> createGetReleveResponse(GetReleveResponse value) {
        return new JAXBElement<GetReleveResponse>(_GetReleveResponse_QNAME, GetReleveResponse.class, null, value);
    }

}
