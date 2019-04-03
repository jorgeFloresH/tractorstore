package com.remedial.tractorstore.controller;


import com.remedial.tractorstore.dto.TractorDto;
import com.remedial.tractorstore.model.Tractor;
import com.remedial.tractorstore.service.GenericService;
import com.remedial.tractorstore.service.TractorService;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/tractores")
@Produces(MediaType.APPLICATION_JSON)
public class TractorController extends  GenericController<Tractor, TractorDto> {
    private TractorService service;

    public TractorController(TractorService service) {
        this.service = service;
    }
    @Override
    @GET
    public List<TractorDto> getAll(){ return  super.getAll();}

    @Override
    protected GenericService getService() {return service;}


}
