package com.appt;



import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.appt.model.Nse;
import com.appt.repository.NseRepository;
import com.appt.service.NseService;

@SpringBootTest
class ApptBackendApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	@InjectMocks
	NseService nseService;
	@Mock
	NseRepository nseRepository;
	@Test
	void findBySymbolTest() {
		String symbol = "BATAINDIA";
		List<Nse> list = new ArrayList<>();
		list.add(new Nse("500043", "878.76", "India", "INR", "NSE", "2520", "Consumer Durables", "INE176A01028", "877.76","Consumer Discretionary", "BATA INDIA LTD.", "BATAINDIA","EQ"));
		list.add(new Nse("500124", "98.76","India", "INR", "NSE", "35", "Healthcare", "INE089A01023", "97.76","Healthcare", "DR.REDDY'S LABORATORIES LTD.", "DRREDDY","EQ"));
		
		when(nseRepository.findBySymbolStartsWith(symbol))
		.thenReturn(list);	
		
		int expected = 2;
		int actual = nseService.getBySymbol(symbol).size();
		
		Assertions.assertEquals(expected,actual);
	}

}

