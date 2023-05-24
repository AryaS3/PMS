package com.appt.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.appt.model.InvestmentTheme;


@Repository
public interface InvestmentThemeRepository extends JpaRepository<InvestmentTheme,Long>{

	public InvestmentTheme findBythemeNameContaining(String themeName);



	
}
