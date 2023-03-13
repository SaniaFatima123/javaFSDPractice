package routePlannerMiniProject.service;

import routePlannerMiniProject.entity.Route;
import routePlannerMiniProject.exceptions.NoRouteFoundException;

public interface IRouteService {
    Route[] findDirectFlightsFromLocation(String from) throws NoRouteFoundException;
    Route[] findFlights(String from, String to) throws NoRouteFoundException;
}
