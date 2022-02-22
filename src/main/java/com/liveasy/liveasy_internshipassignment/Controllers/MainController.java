package com.liveasy.liveasy_internshipassignment.Controllers;


import com.liveasy.liveasy_internshipassignment.Model.Data;
import com.liveasy.liveasy_internshipassignment.Response.ResponseData;
import com.liveasy.liveasy_internshipassignment.Service.ShippingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/load")

    public String saveShippingData(@RequestBody Data data)
    {

        return shippingServices.shaveShippingData(data);
    }


    @DeleteMapping("/load/{loadId}")
    public void deleteShippingData(@PathVariable("loadId")
                                         @RequestParam(required = false)Long loadId)
    {
        shippingServices.deleteShipppingData(loadId);
    }



}
