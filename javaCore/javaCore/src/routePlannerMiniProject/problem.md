Route{
from: String
to:String
fare: double
distance: String
travelTime: String
}
IRouteDao{
//store is route array
fetchDataFromCsv()// fetches data from csv and fill in Route store
findAll(): Route[]
}
IRouteService{
findDirectFlightsFromLocation(String from) throws NoRouteFoundException : Route[]
findFlights(String from, String to) throws NoRouteFoundException : Route[]
}
FrontEnd{
..
}