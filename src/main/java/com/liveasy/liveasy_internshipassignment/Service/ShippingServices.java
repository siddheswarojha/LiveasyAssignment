package com.liveasy.liveasy_internshipassignment.Service;


import com.liveasy.liveasy_internshipassignment.Model.Data;
import com.liveasy.liveasy_internshipassignment.Repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShippingServices {


    @Autowired
    ShippingRepository shippingRepository;


    public List<Data> getShippingData(String shipperId) {

        return (List<Data>) shippingRepository.findOneById(Long.valueOf(shipperId));



    }

    public String shaveShippingData(Data data) {
        if(data.getDate()==null)
            data.setDate(new Date());
        shippingRepository.save(data);
        return "loads details added successfully";
    }

    public void deleteShipppingData(Long loadId) {

        shippingRepository.deleteById(loadId);

    }
}
