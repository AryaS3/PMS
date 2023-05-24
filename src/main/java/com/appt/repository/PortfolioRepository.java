package com.appt.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appt.dto.PortfolioDto;
import com.appt.model.PortfolioHeader;

@Repository
public interface PortfolioRepository extends JpaRepository<PortfolioHeader, String>{

	@Modifying
	@Query("delete from PortfolioHeader where portfolioName=:portfolioName")
	public int deletePortfolioByName(@Param("portfolioName") String portfolioName);


	public PortfolioHeader save(PortfolioDto portfolioDto);


	public PortfolioHeader findByPortfolioNameContaining(String portfolioName);
}
