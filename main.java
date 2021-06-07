import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import persistance_layer.IDAO;
import persistance_layer.Objects;

public class main {
    public static void main(String[] args) {
        //persistance layer
        IDAO dao=new Objects();

        //business layer
        IXQP queryprocessor=new QP(dao);
        IXTP transactprocessor=new TP(dao);

        //presentation layer
        IXGUI gui=new GUI(queryprocessor,transactprocessor);

        //call the gui main
    }
}
