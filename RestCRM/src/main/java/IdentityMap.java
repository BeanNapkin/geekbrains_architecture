import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class IdentityMap {
    private Map<String, Guest> guestMap = new HashMap();
    private GuestMapper guestMapper;

    public IdentityMap(GuestMapper guestMapper) {
        this.guestMapper = guestMapper;
    }

    public Guest getGuestByPhone(String phone) throws SQLException {
        if(!guestMap.containsKey(phone)) {
            guestMap.put(phone,guestMapper.findByPhone(phone));
        }
        return guestMap.get(phone);
    }

    public void insert(Guest guest) throws SQLException {
        guestMapper.insert(guest);
        guestMap.put(guest.getPhone(), guest);
    }
}
