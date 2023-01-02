package QuestionC;

import QuestionB.Operation;
import QuestionB.Operations;
import QuestionB.Releve;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlTransient;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.List.*;



@WebService(serviceName = "ReleveWS")
public class ReleveWS {


        @WebMethod
        public Releve getReleve() throws ParseException {
            Operations operation = new Operations(new Date(),new Date());
            operation.getOperation().add(new Operation("CR",new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"), 7000.01, "ver"));
            operation.getOperation().add(new Operation("DB",new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"), 7000.01, "ver"));
            operation.getOperation().add(new Operation("CD", new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"), 5000.01, "ver"));
            Releve releve = new Releve("123456789", new Date(), 1200.00f, operation);
            return releve;
        }




}
