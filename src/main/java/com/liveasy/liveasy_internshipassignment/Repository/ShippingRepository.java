package com.liveasy.liveasy_internshipassignment.Repository;



import com.liveasy.liveasy_internshipassignment.Model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShippingRepository extends JpaRepository<Data, Long> {
    public List<Data> findAllByShipperId(String shipperId);
    public Data findOneById(Long id);
}