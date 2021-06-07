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

    public HashMap<String,StockItem> getAll() {

        Map<String,StockItem> result=new HashMap<String,StockItem>();
        List res=new ArrayList<StockItem>();
        res=entityManager.createQuery("from StockItem").getResultList();
        Iterator<StockItem> it=res.iterator();
        while (it.hasNext()){
            StockItem item=it.next();
            result.put(item.getName(),item);
        }
    }
}
