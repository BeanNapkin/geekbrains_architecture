import java.util.Date;

public class APIFacadeImpl implements APIFacade {

    private final GuestBook guestBook;

    APIFacadeImpl(GuestBook guestBook){
        this.guestBook = guestBook;
    }

    @Override
    public void book(String name, String phone, String email, ReservationType reservationType, Date time, int quantityOfGuests, String theme, int budget) {

        ReservationBuilder builder = new ReservationBuilder();

        builder.setReservationType(reservationType);
        builder.setDateForReservation(time);
        builder.setQuantityOfGuests(quantityOfGuests);
        builder.setTheme(theme);
        builder.setBudget(budget);

        Reservation reservation = builder.build();

        guestBook.getOrCreateGuest(phone, name, null).addReservation(reservation);
    }
}
