package persistance_layer;

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

    public List<Client> getAll() {
        return entityManager.createQuery("from Client").getResultList();
    }
}
