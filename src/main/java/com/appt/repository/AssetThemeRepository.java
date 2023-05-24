package com.appt.repository;
//
import java.util.List;
//
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//
import com.appt.model.AssetClass;
import com.appt.model.AssetTheme;

@Repository
public interface AssetThemeRepository extends JpaRepository<AssetTheme,Integer> {

	
	@Query("select a from AssetTheme a where a.theme.themeName=?1")
	List<AssetTheme> findByThemeName(String themeName);

}
