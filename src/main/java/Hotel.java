public class Hotel {
    public static Integer showRates(String lakewood) {
        Integer rates=HotelReservationSystem.hotelMap.get(lakewood);
        return rates;
    }
}
