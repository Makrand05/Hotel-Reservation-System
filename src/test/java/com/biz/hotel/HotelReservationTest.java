package com.biz.hotel;

import com.biz.hotel.model.Hotel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelReservationTest {
    @Test
    public void givenHotelName_whenNameAndRate_shouldRerunRate() {
        HotelReservationSystem hotelReservationSystem=new HotelReservationSystem();
        //hotelReservationSystem.setRateForRegularCustomers("Lakewood",110);
        Integer actualResult= Hotel.showRates("Lakewood");
        Integer expectedResult=90;
        Assert.assertEquals(actualResult,expectedResult);
    }
}
