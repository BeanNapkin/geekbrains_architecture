import java.sql.SQLException;

public class RecordNotFoundException extends SQLException {

    public RecordNotFoundException(String reason) {
        super(reason);
    }
}
