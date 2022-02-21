package com.liveasy.liveasy_internshipassignment.Controllers;


import com.liveasy.liveasy_internshipassignment.Model.Data;
import com.liveasy.liveasy_internshipassignment.Response.ResponseData;
import com.liveasy.liveasy_internshipassignment.Service.ShippingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class MainController {

    @Autowired
    private ShippingServices shippingServices;


    @GetMapping("/load")
    public List<Data> getShippingData(@RequestParam String shipperId)
    {

        return shippingServices.getShippingData(shipperId);
    }



}
