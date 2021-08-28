import java.util.Optional;

public interface PersonDao<Long,Person extends AbstractEntity> extends Dao<Long,Person>{
    public Optional<Person> findByFirstNameAndLastName(String firstName, String lastName) throws RuntimeException;
}
