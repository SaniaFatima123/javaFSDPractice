package revisitRoutePlannerMiniProject.dao;

import revisitRoutePlannerMiniProject.entity.Route;

import java.util.List;

public interface IRouteDao {
    List<Route> fetchDataFromCsv();
    List<Route> findAll();

}
