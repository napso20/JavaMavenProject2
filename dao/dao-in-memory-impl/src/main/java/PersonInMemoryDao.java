import java.util.Optional;

public class PersonInMemoryDao<Long, Person extends AbstractEntity>
        extends AbstractInMemoryDao<Long, Person>
        implements PersonDao<Long, Person> {
    
    @Override
    public Optional<Person> findByFirstNameAndLastName(String firstName, String lastName) throws RuntimeException {
        return Optional.empty();
    }
}
