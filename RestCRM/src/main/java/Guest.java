import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Guest {
    private long idGuest;
    private String name;
    private String phone;
    private String email;
    private final List<Reservation> reservations = new ArrayList<>();

    public Guest(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Guest() {
    }

    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }

    public String getPhone() {
        return phone;
    }

    public void setIdGuest(long idGuest) {
        this.idGuest = idGuest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
