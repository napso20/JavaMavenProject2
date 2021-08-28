import java.util.Optional;

public class CompanyFileSystemDao<String, Company extends AbstractEntity>
        extends AbstractFileSystemDao<String, Company>
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

