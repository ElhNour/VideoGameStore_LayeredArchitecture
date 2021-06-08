import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import persistance_layer.Client_dao;
import persistance_layer.IDAO;
import persistance_layer.Objects;

public class main {
    public static void main(String[] args) {
        //persistance layer
        IDAO dao=new Objects();//pour faire passer un seul objet d'une classe qui implémente DAO et non pas plusieurs c-à-d: client_dao, renteditem_dao...etc pour chaque processor.
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Books");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        IDAO client_dao=new Client_dao(entityManager);
        IDAO stockitem_dao=new Stockitem_dao(entityManager);
        IDAO renteditem_dao=new Renteditem_dao(entityManager);
        IDAO film_dao=new Film_dao(entityManager);
        IDAO jeu_dao=new Jeux_dao(entityManager);

        //business layer
        IXQP queryprocessor=new QP(dao);
        IXTP transactprocessor=new TP(dao);

        //presentation layer
        IXGUI gui=new GUI(queryprocessor,transactprocessor);

        //call the gui main
    }
}
