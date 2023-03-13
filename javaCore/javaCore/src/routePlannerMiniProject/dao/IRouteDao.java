package routePlannerMiniProject.dao;

import routePlannerMiniProject.entity.Route;

import java.io.IOException;

public interface IRouteDao {
    void fetchDataFromCsv();
    Route[] findAll();
}
