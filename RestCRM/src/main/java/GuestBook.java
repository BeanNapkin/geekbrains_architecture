import java.util.List;
import java.util.UUID;

public class GuestBook {
    public List<Guest> guests;

    public Guest searchGuest(String phone) {

        for (int i = 0; i < guests.size(); i++) {
            if (guests.get(i).getPhone() == phone)
                return guests.get(i);
        }

        return null;
    }

    public Guest getOrCreateGuest(String phone, String name, String email) {

        if (searchGuest(phone) != null) {
            return searchGuest(phone);
        }

        return new Guest(UUID.randomUUID(), name, phone, email);
    }

}
