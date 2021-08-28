import java.util.Optional;

public interface CompanyDao<String, Company extends AbstractEntity> extends Dao<String,Company>{
    public Iterable<Company> findAllByNameLike(String name) throws RuntimeException;

    public Optional<Company> findByContactId(Long contactId);
}
