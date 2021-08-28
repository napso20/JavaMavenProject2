import java.util.Optional;
import java.util.Set;

public class AbstractInMemoryDao<ID, T extends AbstractEntity> implements Dao<ID, T> {

    private Set<T> entities;

    @Override
    public void save(T entity) {

    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public Iterable<T> findAll() {
        return null;
    }

    @Override
    public void delete(T entity) throws RuntimeException {

    }

    @Override
    public int count() {
        return 0;
    }
}
