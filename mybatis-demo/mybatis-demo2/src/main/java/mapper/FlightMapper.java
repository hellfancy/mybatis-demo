package mapper;

import entity.Flight;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FlightMapper {
    List<Flight> getByFlightAll();
    List<Flight> getByFlightAll2();
    Flight getByIdFlight(Integer id);
    int insertFlight(Flight flight);
    int deleteByIdFlight(Integer id);
    int updateFlight(Flight flight);
    List<Flight> getByFlightParameterMap(Map<String, String> parameterMap);
    List<Flight> getByFlightParameter(@Param("company") String company,
                                     @Param("departureAirport") String departureAirport,
                                     @Param("arriveAirport") String arriveAirport);
    List<Flight> getByFlightPoJo(Flight flight);
}
