import java.util.Date;

public interface APIFacade {

    void book(String name, String phone, String email, ReservationType reservationType, Date time, int quantityOfGuests, String theme, int budget);

}
