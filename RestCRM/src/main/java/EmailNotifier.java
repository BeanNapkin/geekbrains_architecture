public class EmailNotifier implements Observer<Guest> {

    @Override
    public void update(Guest newGuest) {
        sendNewGuestEmailNotification(newGuest);
    }

    private void sendNewGuestEmailNotification(Guest newGuest){
        System.out.println("Email send: New guest added to the guestbook!" + newGuest.getPhone());
    }
}
