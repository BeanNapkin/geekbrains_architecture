import java.util.List;
import java.util.UUID;

public class Guest {
    private UUID idGuest;
    private String name;
    private String phone;
    private String email;
    private List<Reservation> reservations;

    public Guest(UUID idGuest, String name, String phone, String email) {
        this.idGuest = idGuest;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }

    public String getPhone() {
        return phone;
    }
}
