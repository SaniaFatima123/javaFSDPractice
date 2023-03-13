package routePlannerMiniProject.service;

import routePlannerMiniProject.dao.IRouteDao;
import routePlannerMiniProject.dao.RouteDaoImpl;
import routePlannerMiniProject.entity.Route;
import routePlannerMiniProject.exceptions.InvalidNameException;
import routePlannerMiniProject.exceptions.NoRouteFoundException;



public class RouteServiceImpl implements IRouteService{
    IRouteDao iRouteDao = new RouteDaoImpl();
    public RouteServiceImpl(){
        iRouteDao.fetchDataFromCsv();
    }

    @Override
    public Route[] findDirectFlightsFromLocation(String from) throws NoRouteFoundException {
        validateName(from);
        int index = 0;
        Route[] foundRoute = new Route[5];
        Route[] routes = iRouteDao.findAll();
        for(Route route:routes){
            if(route!=null && index< foundRoute.length && route.getFrom().equalsIgnoreCase(from)){
                foundRoute[index]=route;
                index++;
            }
        }
        if(index<1){
            throw new NoRouteFoundException("Route not found from "+from);
        }
        return foundRoute;

    }

    @Override
    public Route[] findFlights(String from, String to) throws NoRouteFoundException {
        validateName(from);
        validateName(to);
        int index = 0;
        Route[] foundRoute= new Route[5];
        Route[] routes = iRouteDao.findAll();
        for(Route route:routes){
            if(route!=null && index< foundRoute.length && route.getFrom().equalsIgnoreCase(from) &&
                    route.getTo().equalsIgnoreCase(to)){
                foundRoute[index]=route;
                index++;
            }
        }
        if(index<1){
            throw new NoRouteFoundException("Route not found from "+from);
        }
        return foundRoute;

    }
    private void validateName(String name) {
        if(name.isEmpty() || name.isBlank() || name.length()<2 || name.length()>15){
            throw new InvalidNameException("Name is Invalid");
        }
    }
}
