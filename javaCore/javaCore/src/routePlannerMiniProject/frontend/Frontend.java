package routePlannerMiniProject.frontend;

import routePlannerMiniProject.entity.Route;
import routePlannerMiniProject.exceptions.InvalidNameException;
import routePlannerMiniProject.exceptions.NoRouteFoundException;
import routePlannerMiniProject.service.IRouteService;
import routePlannerMiniProject.service.RouteServiceImpl;



public class Frontend {
    public void runUI(){
        IRouteService iRouteService = new RouteServiceImpl();
        try{
            try {
                Route[] foundRoutesFrom = iRouteService.findDirectFlightsFromLocation("Rajasthan");
                display(foundRoutesFrom);
            }
            catch(InvalidNameException e){
                System.out.println(e.getMessage());
            }
            catch(NoRouteFoundException e){
                System.out.println(e.getMessage());
            }
            Route[] foundRoutesFromTo = iRouteService.findFlights("Delhi","London");
            display(foundRoutesFromTo);
        }
        catch(InvalidNameException e){
            System.out.println(e.getMessage());
        }
        catch(NoRouteFoundException e){
            System.out.println(e.getMessage());
        }

    }
    public void display(Route[] routes){
        for(Route route:routes){
            if(route!=null){
                System.out.println("Route from "+route.getFrom()+" to "+route.getTo()+
                        " Distance is "+route.getDistance()+" travell time is "+route.getTravelTime()+" fare is "+route.getFare());
            }
        }
    }

}
