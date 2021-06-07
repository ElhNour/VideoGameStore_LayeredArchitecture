package persistance_layer;

import java.util.List;

public interface IDAO {
    void persist(E entity);
    void remove(E entity);
    List getAll();
}