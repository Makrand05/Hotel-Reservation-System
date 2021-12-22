import org.testng.annotations.Test;

public class HotelReservationTest {
    @Test
    public void givenHotelName_whenNameAndRate_shouldRerunRate() {
        HotelReservationSystem hotelReservationSystem=new HotelReservationSystem();
        hotelReservationSystem.setName("Lakewood,");
        hotelReservationSystem.setRateForRegularCustomers(90);
    }



}
