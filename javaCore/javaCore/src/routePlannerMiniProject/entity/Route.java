package routePlannerMiniProject.entity;

public class Route {
    private String from;
    private String to;
    private String distance;
    private String travelTime;
    private String fare;


    public Route() {
    }

    public Route(String from, String to, String distance, String travelTime,  String fare) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.travelTime = travelTime;
        this.fare = fare;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public String toString() {
        return "Route{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", fare=" + fare +
                ", distance='" + distance + '\'' +
                ", travelTime='" + travelTime + '\'' +
                '}';
    }
}
