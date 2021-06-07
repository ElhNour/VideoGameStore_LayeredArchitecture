package persistance_slayer;

public class Stockitem_dao {
    private EntityManager entityManager;

    public Stockitem_dao(EntityManager e) {
        this.entityManager = e;
    }

    public void persist(StockItem sitem) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(sitem);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(E entity) {
        entityManager.remove(entity);
    }

    public List<StockItem> getAll() {
        return entityManager.createQuery("from StockItem").getResultList();
    }
}
