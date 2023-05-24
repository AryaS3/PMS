package com.appt.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.appt.model.AssetClass;

@Repository
public interface AssetClassRepository extends JpaRepository<AssetClass, Long>{

	
	
//	@Query("select a from AssetClass a where a.theme.themeName=?1")
//	List<AssetClass> findByThemeName(String themeName);

	
}
