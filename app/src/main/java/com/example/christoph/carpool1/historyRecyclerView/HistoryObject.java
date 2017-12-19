package com.example.christoph.carpool1.historyRecyclerView;

/**
 * Created by christoph on 11/19/2017.
 */

public class HistoryObject  {
    private String rideId;
    private String time;

    public HistoryObject(String rideId, String time){
        this.rideId = rideId;
        this.time = time;
    }

    public String getRideId(){return rideId;}
    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getTime(){return time;}
    public void setTime(String time) {
        this.time = time;
    }


}