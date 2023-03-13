package revisitRoutePlannerMiniProject;

import revisitRoutePlannerMiniProject.entity.Route;
import revisitRoutePlannerMiniProject.service.IRouteService;
import revisitRoutePlannerMiniProject.service.RouteServiceImpl;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        IRouteService routeService = new RouteServiceImpl();
       List<Route> foundFrom =  routeService.showDirectFlights("Los Angeles");
        System.out.println(foundFrom);
    }
}
