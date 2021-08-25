import lombok.Data;

@Data
public class AbstractEntity<ID> {
    private ID id;
}
