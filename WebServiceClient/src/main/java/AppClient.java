import proxy.*;

import java.util.List;

public class AppClient {
    public static void main(String[] args) throws JAXBException_Exception {

        ReleveWS ws = new ReleveWS_Service().getReleveWSPort();
        System.out.println(ws.getReleve().getRib());
        System.out.println(ws.getReleve().getSolde());
        System.out.println(ws.getReleve().getDateReleve());

        //list of Operation :
        List<Operation> operations= ws.getReleve().getOperations().getOperation();
        for(Operation op : operations){
            System.out.println("------------------");
            System.out.println(op.getDate());
            System.out.println(op.getType());
            System.out.println(op.getDescription());
            System.out.println(op.getMontant());
        }


    }
}
