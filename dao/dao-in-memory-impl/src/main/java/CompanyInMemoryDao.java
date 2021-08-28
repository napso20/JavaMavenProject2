import java.util.Optional;

public class CompanyInMemoryDao<String, Company extends AbstractEntity>
        extends AbstractInMemoryDao<String, Company>
        implements CompanyDao<String, Company> {

    @Override
    public Iterable<Company> findAllByNameLike(String name) throws RuntimeException {
        return null;
    }

    @Override
    public Optional<Company> findByContactId(Long contactId) {
        return Optional.empty();
    }
}
