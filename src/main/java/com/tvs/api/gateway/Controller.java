package com.tvs.api.gateway;


import com.tvs.api.gateway.model.Model;
import com.tvs.api.gateway.model.Resopnse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class Controller {
    @Autowired
    Service service;
    @PostMapping(value = "tvs/api/gateway")
    public Resopnse tvsAPIGateway(@Valid  @RequestBody Model model) {
          return service.tvsAPIGateway(model);
    }
}
