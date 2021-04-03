import java.util.Date;
import java.util.UUID;

public class ReservationBuilder {

    private UUID idReservation;
    private ReservationType reservationType;
    private Date dateForReservation;
    private int quantityOfGuests;
    private String theme;
    private int budget;

    public Reservation build() {
        idReservation = UUID.randomUUID();
        return new Reservation(idReservation, reservationType, dateForReservation, quantityOfGuests, theme, budget);
    }

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }

    public void setDateForReservation(Date dateForReservation) {
        this.dateForReservation = dateForReservation;
    }

    public void setQuantityOfGuests(int quantityOfGuests) {
        if (reservationType == ReservationType.BANQUET && quantityOfGuests < 10) {
            throw new IllegalArgumentException("The quantity of guests for the banquet should be more than 10!");
        }
        this.quantityOfGuests = quantityOfGuests;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
