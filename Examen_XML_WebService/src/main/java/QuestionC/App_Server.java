package QuestionC;

import javax.xml.ws.Endpoint;

public class App_Server {
    public static void main(String[] args)  {
        Endpoint.publish("http://0.0.0.0:1112/",new ReleveWS());
        System.out.println("WebService démarée");

    }
}
