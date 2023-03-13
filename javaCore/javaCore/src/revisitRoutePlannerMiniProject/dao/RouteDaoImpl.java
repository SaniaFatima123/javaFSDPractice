package revisitRoutePlannerMiniProject.dao;

import revisitRoutePlannerMiniProject.entity.Route;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class RouteDaoImpl implements IRouteDao{
    List<Route> routeList = new ArrayList<>();
    @Override
    public List<Route> fetchDataFromCsv() {
        Reader reader = null;
        try {
            File file = new File("src/revisitRoutePlannerMiniProject/resources/routes.csv");
            reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                Route route = new Route(values[0], values[1], Double.parseDouble(values[2]), values[3], values[4]);
                Collection li = (List) route;
                List<Route> ri = new ArrayList<>(li);
                routeList.addAll(ri);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return routeList;
    }
    @Override
    public List<Route> findAll() {
        return routeList;
    }
}
