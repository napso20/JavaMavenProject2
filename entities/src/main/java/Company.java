import lombok.Data;

@Data
public class Company extends AbstractEntity<String>{
    private String name;
    private String address;
    private Long contactId;
    private Boolean active;
}
