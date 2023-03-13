package routePlannerMiniProject.dao;

import routePlannerMiniProject.entity.Route;

import java.io.*;

public class RouteDaoImpl implements IRouteDao {

    Route[] routeInfo = new Route[5];
    @Override
    public void fetchDataFromCsv(){
        Reader reader = null;
        try {
            File myFile = new File("jobms/src/routePlannerMiniProject/resources/routes.csv");
            reader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            int index = 0;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null && index < routeInfo.length) {
                String[] values = line.split(",");
                Route route = new Route(values[0], values[1], values[2], values[3],values[4]);
                routeInfo[index] = route;
                index++;
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }

        }

    }


    @Override
    public Route[] findAll() {
        return routeInfo;
    }
}
