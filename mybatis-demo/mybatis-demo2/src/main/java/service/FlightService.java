package service;

import entity.Flight;
import mapper.FlightMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class FlightService {
    private FlightMapper flightMapper;
    private SqlSession sqlSession;

    public FlightService() throws IOException {
        String resource = "mybatis-config.xml";
        // 1.解析mybatis-config.xml 得到数据库相关的配置信息
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.创建得到一个sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.获取到sqlSession
        sqlSession = sqlSessionFactory.openSession();
        flightMapper = sqlSession.getMapper(FlightMapper.class);
    }

    public List<Flight> getByFlightAll() {
        return flightMapper.getByFlightAll();
    }
    public List<Flight> getByFlightAll2() {
        return flightMapper.getByFlightAll2();
    }

    public Flight getByIdFlight(Integer id) {
        return flightMapper.getByIdFlight(id);
    }

    public int insertFlight(Flight flight) {
        int res = flightMapper.insertFlight(flight);
        sqlSession.commit();
        return res;
    }

    public int deleteByIdFlight(Integer id) {
        int res = flightMapper.deleteByIdFlight(id);
        sqlSession.commit();
        return res;
    }

    public int updateFlight(Flight flight) {
        int res = flightMapper.updateFlight(flight);
        sqlSession.commit();
        return res;
    }

    public List<Flight> getByFlightParameterMap(Map<String, String> parameterMap) {
        return flightMapper.getByFlightParameterMap(parameterMap);
    }

    public List<Flight> getByFlightParameter(@Param("company") String company,
                                             @Param("departureAirport") String departureAirport,
                                             @Param("arriveAirport") String arriveAirport) {
        return flightMapper.getByFlightParameter(company, departureAirport, arriveAirport);
    }

    public List<Flight> getByFlightPoJo(Flight flight) {
        return flightMapper.getByFlightPoJo(flight);
    }
}
