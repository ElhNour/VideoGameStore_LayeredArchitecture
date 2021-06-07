package persistance_layer;

import java.util.List;

public class Jeux_dao implements IDAO {

    private EntityManager entityManager;

    public Jeux_dao(EntityManager e) {
        this.entityManager = e;
    }

    public void persist(Jeux jeu) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(jeu);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(E entity) {
        entityManager.remove(entity);
    }

    public List<Jeux> getAll() {
        return entityManager.createQuery("from Jeux").getResultList();
    }
}
