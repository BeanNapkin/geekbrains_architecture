import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GuestBook {
    private List<Guest> guests = new ArrayList<>();
    private SubjectImpl<Guest> newGuestSubject = new SubjectImpl<>();

    public Guest searchGuest(String phone) {

        for (int i = 0; i < guests.size(); i++) {
            if (guests.get(i).getPhone().equals(phone))
                return guests.get(i);
        }

        return null;
    }

    public Guest getOrCreateGuest(String phone, String name, String email) {

        if (searchGuest(phone) != null) {
            return searchGuest(phone);
        }

        Guest newGuest = new Guest(UUID.randomUUID(), name, phone, email);
        guests.add(newGuest);
        newGuestSubject.notifyObservers(newGuest);

        return newGuest;
    }

    public Subject<Guest> getNewGuestSubject() {
        return newGuestSubject;
    }
}
