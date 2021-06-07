package persistance_layer;

public class Renteditem_dao {
    private EntityManager entityManager;

    public Renteditem_dao(EntityManager e) {
        this.entityManager = e;
    }

    public void persist(RentedItem ritem) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(ritem);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(E entity) {
        entityManager.remove(entity);
    }

    public List<RentedItem> getAll() {
        return entityManager.createQuery("from RentedItem").getResultList();
    }
}
