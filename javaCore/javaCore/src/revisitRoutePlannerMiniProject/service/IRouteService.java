package revisitRoutePlannerMiniProject.service;

import revisitRoutePlannerMiniProject.entity.Route;
import revisitRoutePlannerMiniProject.exception.NoRouteFoundException;

import java.util.ArrayList;
import java.util.List;

public interface IRouteService {
    List<Route> showDirectFlights(String fromCity) throws NoRouteFoundException;

    List<Route> findFlights(String fromCity, String toCity) throws NoRouteFoundException;
}
