package revisitRoutePlannerMiniProject.entity;

public class Route {
    private String from;
    private String to;
    private double fare;
    private String distance;
    private String travelTime;

    public Route() {
    }

    public Route(String from, String to, double fare, String distance, String travelTime) {
        this.from = from;
        this.to = to;
        this.fare = fare;
        this.distance = distance;
        this.travelTime = travelTime;
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

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
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
