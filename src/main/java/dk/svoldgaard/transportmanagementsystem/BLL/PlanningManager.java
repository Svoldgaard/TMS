package dk.svoldgaard.transportmanagementsystem.BLL;

import dk.svoldgaard.transportmanagementsystem.BE.Booking;
import dk.svoldgaard.transportmanagementsystem.BLL.Util.Search;
import dk.svoldgaard.transportmanagementsystem.DLL.PlanningDAO_DB;

import java.util.ArrayList;
import java.util.List;

public class PlanningManager {

    private Search search = new Search();

    public PlanningManager(){

    }


    public List<Booking> searchMovies(String query){
        List<Booking> allBookings = new ArrayList<>();
        List<Booking> searchResult = search.search(allBookings, query);
        return searchResult;
    }
}
