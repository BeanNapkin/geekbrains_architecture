import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestBook {

    private IdentityMap identityMap;
    private SubjectImpl<Guest> newGuestSubject = new SubjectImpl<>();

    public GuestBook(IdentityMap identityMap) {
        this.identityMap = identityMap;
    }

    public Guest searchGuest(String phone) throws SQLException {
        try {
            return identityMap.getGuestByPhone(phone);
        } catch (RecordNotFoundException e) {
            return null;
        }
    }

    public Guest getOrCreateGuest(String phone, String name, String email) throws SQLException {

        if (searchGuest(phone) != null) {
            return searchGuest(phone);
        }

        Guest newGuest = new Guest(name, phone, email);

        identityMap.insert(newGuest);
        newGuestSubject.notifyObservers(newGuest);

        return newGuest;
    }

    public Subject<Guest> getNewGuestSubject() {
        return newGuestSubject;
    }
}
