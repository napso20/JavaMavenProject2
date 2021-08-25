import lombok.Data;

@Data
public class Person extends AbstractEntity<Long> {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
