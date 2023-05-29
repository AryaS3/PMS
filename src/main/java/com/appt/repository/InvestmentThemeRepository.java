package com.appt.repository;





import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.appt.model.InvestmentTheme;


@Repository
public interface InvestmentThemeRepository extends JpaRepository<InvestmentTheme,Long>{

	public InvestmentTheme findBythemeNameContaining(String themeName);

//	public Optional<InvestmentTheme> findById(String themeName);



	
}
