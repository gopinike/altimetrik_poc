
package com.bus.repository;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bus.entity.BookingEntity;
import com.bus.entity.BusEntity;

@Repository
public interface BookingsRepository extends JpaRepository<BookingEntity, Long> 
{ 
	List<BookingEntity> findAll();
	
	List<BookingEntity> findAllBybusID(Long busID);
	
	@Query(nativeQuery = true,value = "select s.sheetno as sheetno ,  b.status as status  from sheetings s left join bookings b on s.sheetno   = b.sheetno  where busid = 1")
	List<BookingEntity> sourcustomSearch();
}
