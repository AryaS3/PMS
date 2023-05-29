package com.appt.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.appt.model.AssetClass;
import com.appt.model.InvestmentTheme;

@Repository
public interface AssetClassRepository extends JpaRepository<AssetClass, Long>{

	public void save(InvestmentTheme theme);
	@Query("select a from AssetClass a where a.theme.themeName=?1")
	public List<AssetClass> findByThemeName(String themeName);

//	@Query("select a from AssetClass a where a.theme.themeName=?1")
//	public List<AssetClass> findByThemeName(String themeName);

	
	
//	@Query("select a from AssetClass a where a.theme.themeName=?1")
//	List<AssetClass> findByThemeName(String themeName);

	
}
