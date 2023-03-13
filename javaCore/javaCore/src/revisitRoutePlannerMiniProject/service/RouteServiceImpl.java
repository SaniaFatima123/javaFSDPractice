package revisitRoutePlannerMiniProject.service;

import revisitRoutePlannerMiniProject.dao.IRouteDao;
import revisitRoutePlannerMiniProject.dao.RouteDaoImpl;
import revisitRoutePlannerMiniProject.entity.Route;
import revisitRoutePlannerMiniProject.exception.NoRouteFoundException;

import java.util.ArrayList;
import java.util.List;

public class RouteServiceImpl implements IRouteService{
    IRouteDao routeDao = new RouteDaoImpl();
    @Override
    public List<Route> showDirectFlights(String fromCity) throws NoRouteFoundException {
        List<Route> foundRoute = new ArrayList<>();
        List<Route> foundList = routeDao.fetchDataFromCsv();
        for(Route route:foundList){
            if(route!=null && route.getFrom().equalsIgnoreCase(fromCity)){
                foundRoute.add(route);
            }
        }
        return foundRoute;
    }

    @Override
    public List<Route> findFlights(String fromCity, String toCity) throws NoRouteFoundException {
        List<Route> foundRoute = new ArrayList<>();
        List<Route> foundList = routeDao.fetchDataFromCsv();
        for(Route route:foundList){
            if(route!=null && route.getFrom().equalsIgnoreCase(fromCity) && route.getTo().equalsIgnoreCase(toCity)){
                foundRoute.add(route);
            }
        }
        return foundRoute;
    }
}
