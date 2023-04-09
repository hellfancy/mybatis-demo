package test;

import entity.Flight;
import service.FlightService;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) throws IOException {
        FlightService flightService = new FlightService();
//        System.out.println(flightService.getByFlightAll());
//        System.out.println(flightService.getByFlightAll2());
//        System.out.println(flightService.getByIdFlight(2));
//        Flight flight = new Flight();
//        flight.setId(18);
//        flight.setFlightId("888");
//        flight.setCompany("中国南方航空公司");
//        flight.setDepartureAirport("广州白云机场");
//        flight.setArriveAirport("上海浦东机场");
//        flight.setDepartureTime(new Date());
//        flight.setArriveTime(new Date());
//        flight.setModel("K380");
//        flight.setIsDelete(1);
//        System.out.println(flightService.insertFlight(flight));
//        System.out.println(flightService.deleteByIdFlight(17));
//        System.out.println(flightService.updateFlight(flight));
//        Map<String, String> parameterMap = new HashMap<>();
//        parameterMap.put("company", "中国南方航空公司");
//        parameterMap.put("departureAirport", "广州白云机场");
//        parameterMap.put("arriveAirport", "上海浦东机场");
//        System.out.println(flightService.getByFlightParameterMap(parameterMap));

        System.out.println(flightService.getByFlightParameter("中国南方航空公司", "广州白云机场", "上海浦东机场"));

//        System.out.println(flightService.getByFlightPoJo(flight));
    }
}
