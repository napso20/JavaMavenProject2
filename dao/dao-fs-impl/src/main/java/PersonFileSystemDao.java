import java.util.Optional;

public class PersonFileSystemDao<Long, Person extends AbstractEntity>
        extends AbstractFileSystemDao<Long, Person>
        implements PersonDao<Long, Person> {
    @Override
    public Optional<Person> findByFirstNameAndLastName(String firstName, String lastName) throws RuntimeException {
        return Optional.empty();
    }
}

