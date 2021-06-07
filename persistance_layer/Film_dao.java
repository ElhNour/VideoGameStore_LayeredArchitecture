package persistance_layer;

public class Film_dao {
    private EntityManager entityManager;

    public Film_dao(EntityManager e) {
        this.entityManager = e;
    }

    public void persist(Film film) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(film);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(E entity) {
        entityManager.remove(entity);
    }

    public List<Film> getAll() {
        return entityManager.createQuery("from Film").getResultList();
    }
}