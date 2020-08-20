
package com.bus.repository;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bus.entity.BusEntity;

@Repository
public interface BusRepository extends JpaRepository<BusEntity, Long> 
{ 
	List<BusEntity> findAll();
	
	@Query("from BusEntity where sourcecity = ?1 and destinationcity = ?2 and departuretime >= ?3 and departuretime  < ?4 order by price ")
	List<BusEntity> sourcustomSearchByPrice(String sourcecity,String destinationcity,LocalDate departuretime,LocalDate nextDate);
	
	@Query("from BusEntity where sourcecity = ?1 and destinationcity = ?2 and departuretime >= ?3 and departuretime  < ?4 order by operatorname ")
	List<BusEntity> sourcustomSearchByOperator(String sourcecity,String destinationcity,LocalDate departuretime,LocalDate nextDate);
	
	@Query("from BusEntity where sourcecity = ?1 and destinationcity = ?2 and departuretime >= ?3 and departuretime  < ?4 order by departuretime ")
	List<BusEntity> sourcustomSearchByDeparturetime(String sourcecity,String destinationcity,LocalDate departuretime,LocalDate nextDate);
	
	@Query("from BusEntity where sourcecity = ?1 and destinationcity = ?2 and departuretime >= ?3 and departuretime  < ?4 order by arrivaltime ")
	List<BusEntity> sourcustomSearchByArrivaltime(String sourcecity,String destinationcity,LocalDate departuretime,LocalDate nextDate);
	
	@Query("from BusEntity where sourcecity = ?1 and destinationcity = ?2 and departuretime >= ?3 and departuretime  < ?4 order by duration ")
	List<BusEntity> sourcustomSearchByDuration(String sourcecity,String destinationcity,LocalDate departuretime,LocalDate nextDate);
}
