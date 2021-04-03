import java.util.Date;

public class Main {
    public static void main(String[] args) {

        APIFacade api = new APIFacadeImpl(new GuestBook());
        api.book("Rita", "79999999999", "rita@rita.ru" , ReservationType.TABLE, new Date(2021, 4, 30, 14, 00, 00),4, "null", 0);

    }
}
