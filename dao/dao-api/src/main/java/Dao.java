import java.util.Optional;

public interface Dao<ID, T extends  AbstractEntity> {
    public void save(T entity);

    public Optional<T> findById(ID id);

    public Iterable<T> findAll();

    public void delete(T entity) throws RuntimeException;

    public int count();
}
