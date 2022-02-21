package com.liveasy.liveasy_internshipassignment.Service;


import com.liveasy.liveasy_internshipassignment.Model.Data;
import com.liveasy.liveasy_internshipassignment.Repository.ShippingRepository;
import com.liveasy.liveasy_internshipassignment.Response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingServices {


    @Autowired
    ShippingRepository shippingRepository;


    public List<Data> getShippingData(String shipperId) {

        return (List<Data>) shippingRepository.findOneById(Long.valueOf(shipperId));



    }
}
