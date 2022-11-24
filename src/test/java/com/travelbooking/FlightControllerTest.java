package com.travelbooking;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.travelbooking.Model.Flight;
import com.travelbooking.dao.FlightDao;

@ExtendWith(MockitoExtension.class)
class FlightControllerTest {

	@InjectMocks
	FlightController flightController;
	
	@Mock
	FlightDao flightDao;
	
	@Test
    public void testFindAll() 
    {
        // given
		Flight flight = new Flight(new Date(),new Date(),"Pune","Delhi");
        when(flightDao.getFlight()).thenReturn(flight);
 
        // when
		ResponseEntity<Flight>  result = flightController.getflight();
        assertThat(result.getStatusCodeValue()).isEqualTo(200);
        
        Flight resultFlight = result.getBody();
        
        assertThat(resultFlight.getDepartureAirport()).isEqualTo("Pune");
        assertThat(resultFlight.getArrivalAirport()).isEqualTo("Delhi");
    }

}
