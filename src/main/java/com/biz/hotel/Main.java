package com.biz.hotel;

import com.biz.hotel.model.Hotel;

import java.util.*;

public class Main {
    public static int dateCount;
    public static void main(String[] args) {
        //Use Case 1 add hotel name and hotel rates
        List<Hotel> hotelList=new ArrayList<>();
        hotelList.add(new Hotel("Lakewood",110));
        hotelList.add(new Hotel("Bridgewood",160));
        hotelList.add(new Hotel("Ridgewood",220));

        System.out.println(hotelList);

        //Use Case 2 find cheaper hotel
        findCheaperHotel(hotelList);

    }

    private static void findCheaperHotel(List<Hotel> hotelList) {
        System.out.println("Enter the dates");
        String dates[]=(new Scanner((System.in)).nextLine().split(", "));
        dateCount= dates.length;
        System.out.println("The cheaper hotel is : ");
        HotelReservationSystem.getCheaper(hotelList,dateCount);
    }
}
