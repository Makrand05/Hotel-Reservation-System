package com.biz.hotel;

import com.biz.hotel.model.Hotel;

import java.util.*;

public class HotelReservationSystem {


    public static void getCheaper(List<Hotel> hotelList, int dateCount) {

     Hotel minRateHotel=hotelList.stream().min(Comparator.comparing(Hotel::getWeekdayRate)).get();

        System.out.println("Hotel name "+minRateHotel.getHotelName()+", Total Rates : $"+minRateHotel.getWeekdayRate()*dateCount);

    }
}
