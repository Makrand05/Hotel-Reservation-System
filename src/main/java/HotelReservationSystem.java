import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelReservationSystem {


    public static Map<String,Integer> hotelMap=new HashMap<>();
    public HotelReservationSystem() {

    }

    public void setRateForRegularCustomers(String hotelType, int rate) {
        hotelMap.put(hotelType,rate);
    }

}
