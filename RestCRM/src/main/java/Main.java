import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GuestBook guestBook = new GuestBook();
        guestBook.getNewGuestSubject().registerObserver(new EmailNotifier());
        APIFacade api = new APIFacadeImpl(guestBook);
        api.book("Rita", "79999999999", "rita@rita.ru", ReservationType.TABLE, new Date(2021, 4, 30, 14, 00, 00), 4, "null", 0);
        api.book("Rita", "79999999999", "rita@rita.ru", ReservationType.TABLE, new Date(2021, 5, 1, 14, 00, 00), 4, "null", 0);
        api.book("Vasya", "70000000000", "rita@rita.ru", ReservationType.TABLE, new Date(2021, 5, 1, 14, 00, 00), 4, "null", 0);
    }
}
