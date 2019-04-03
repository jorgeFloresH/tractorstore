package com.remedial.tractorstore.controller;

import com.remedial.tractorstore.dto.CatalogoDto;
import com.remedial.tractorstore.model.Catalogo;
import com.remedial.tractorstore.service.CatalogoService;
import com.remedial.tractorstore.service.GenericService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/catalogos")
@Produces(MediaType.APPLICATION_JSON)
public class CatalogoController extends GenericController<Catalogo, CatalogoDto> {

    private CatalogoService service;

    public CatalogoController(CatalogoService service) {
        this.service= service;
    }

    @Override
    public GenericService getService(){return service;}

    @GET
    public List<Catalogo> getCategories(@QueryParam(value = "code") String code) {
        return StringUtils.isEmpty(code) ? service.findAll() : service.findByCode(code);
    }
}
