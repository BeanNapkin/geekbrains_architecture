import java.util.Date;
import java.util.UUID;

public class Reservation {

    private UUID idReservation;
    private ReservationType reservationType;
    private Date dateForReservation;
    private int quantityOfGuests;
    private String theme;
    private int budget;

    public Reservation(UUID idReservation, ReservationType reservationType, Date dateForReservation, int quantityOfGuests, String theme, int budget) {
        this.idReservation = idReservation;
        this.reservationType = reservationType;
        this.dateForReservation = dateForReservation;
        this.quantityOfGuests = quantityOfGuests;
        this.theme = theme;
        this.budget = budget;
    }

    public UUID getIdReservation() {
        return idReservation;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    public Date getDateForReservation() {
        return dateForReservation;
    }

    public int getQuantityOfGuests() {
        return quantityOfGuests;
    }

    public String getTheme() {
        return theme;
    }

    public int getBudget() {
        return budget;
    }
}
