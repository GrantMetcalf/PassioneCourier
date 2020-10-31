package com.PassioneCourier.group2.controller.unlabeled;


import com.PassioneCourier.group2.Entity.unlabeled.CourierHistory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courierHistory")
public class CourierHistoryController {

    @PostMapping("/create")
    public CourierHistory create(@RequestBody CourierHistory courierHistory){
        return courierHistory;
    }

}
