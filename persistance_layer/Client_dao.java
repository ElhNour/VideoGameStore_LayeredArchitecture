package persistance_layer;

import java.util.ArrayList;
import java.util.HashMap;

import entities.Client;

public class Client_dao extends Objects{
    private EntityManager entityManager;

    public Client_dao(EntityManager e) {
        this.entityManager = e;
    }

    public void persist(Client client) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(client);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(E entity) {
        entityManager.remove(entity);
    }

    public HashMap<String,Client> getAll() {

        Map<String,Client> result=new HashMap<String,Client>();
        List res=new ArrayList<Client>();
        res=entityManager.createQuery("from Client").getResultList();
        Iterator<Client> it=res.iterator();
        while (it.hasNext()){
            Client item=it.next();
            result.put(item.getName(),item);
        }
    }
}
