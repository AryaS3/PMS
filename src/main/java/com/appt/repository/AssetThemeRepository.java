//package com.appt.repository;
////
//import java.util.List;
//import java.util.Optional;
//
////
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
////
//import com.appt.model.AssetClass;
//import com.appt.model.AssetTheme;
//import com.appt.model.InvestmentTheme;
//
//@Repository
//public interface AssetThemeRepository extends JpaRepository<AssetTheme,String> {
//	
//	@Query("select a from AssetTheme a where a.theme.themeName=?1")
//	List<AssetTheme> findByThemeName(String themeName);
//
//	
////	@Query("select a from AssetTheme a where a.theme.themeName=?1")
////	List<AssetTheme> findByThemeName(String themeName);
//
////	Optional<AssetTheme> findById(long assetId);
//
////	public void save(InvestmentTheme theme);
//
//}
