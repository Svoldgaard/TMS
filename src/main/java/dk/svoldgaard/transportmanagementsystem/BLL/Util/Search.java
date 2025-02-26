package dk.svoldgaard.transportmanagementsystem.BLL.Util;

import dk.svoldgaard.transportmanagementsystem.BE.Booking;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Booking> search(List<Booking> searchBase, String query) {
        List<Booking> searchResult = new ArrayList<>();

        for (Booking booking : searchBase) {
            if(compareToBookingNumber(query,booking)||
                    compareToClint(query,booking)||
                    compareToLoadingZipCode(query,booking)||
                    compareToLoadingPlace(query,booking)||
                    compareToDeliveryPlace(query,booking)||
                    compareToLoadingDate(query,booking))
            {
                searchResult.add(booking);
            }
        }
        return searchResult;
    }


    private boolean compareToBookingNumber(String query, Booking booking) {
        return Integer.toString(booking.getBookingNumber()).contains(query);
    }

    private boolean compareToClint(String query, Booking booking) {
        return booking.getClient().toLowerCase().contains(query.toLowerCase());
    }

    private boolean compareToLoadingPlace(String query, Booking booking) {
        return booking.getLoadingPlace().toLowerCase().contains(query.toLowerCase());
    }

    private boolean compareToLoadingZipCode(String query, Booking booking) {
        return booking.getLoadingPlace().toLowerCase().contains(query.toLowerCase());
    }

    private boolean compareToDeliveryPlace(String query, Booking booking) {
        return booking.getDeliveryPlace().toLowerCase().contains(query.toLowerCase());
    }

    private boolean compareToLoadingDate(String query, Booking booking) {
        return booking.getLoadingDate().toString().toLowerCase().contains(query.toLowerCase());
    }
    
}
