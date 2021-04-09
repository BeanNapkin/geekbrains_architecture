import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GuestMapper {

    private final Connection connection;

    public GuestMapper(Connection connection) {
        this.connection = connection;
    }

    public Guest findByPhone(String phone) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT ID, NAME, PHONE, EMAIL FROM guestbook WHERE phone = ?");
        statement.setString(1, phone);

        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Guest guest = new Guest();
                guest.setIdGuest(resultSet.getLong(1));
                guest.setName(resultSet.getString(2));
                guest.setPhone(resultSet.getString(3));
                guest.setEmail(resultSet.getString(4));
                return guest;
            }
        }

        throw new RecordNotFoundException("Guest not found: " + phone);
    }

    public void insert(Guest guest) throws SQLException{
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO guestbook(NAME, PHONE, EMAIL) VALUES (?,?,?)");
        statement.setString(1,  guest.getName());
        statement.setString(2,  guest.getPhone());
        statement.setString(3,  guest.getEmail());

        statement.executeUpdate();
    }

}


