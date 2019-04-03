package com.remedial.tractorstore.controller;

import com.remedial.tractorstore.dto.FotoDto;
import com.remedial.tractorstore.model.Foto;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;


@Controller
@Path("/fotos")
@Produces(MediaType.APPLICATION_JSON)
public class FotoController extends GenericController<Foto, FotoDto>{
    private FotoService service;

    public FotoController(FotoService service) {
        this.service = service;
    }
    @Override
    @GET
    public List<FotoDto> getAll() {return super.getAll();}

    @Path("/{id}/image")
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON)
    public Response uploadFile(@PathParam("id") String id,
                               @FormDataParam("file") InputStream file,
                               @FormDataParam("file") FormDataContentDisposition fileDisposition) {
        service.saveImage(Long.valueOf(id), file);
        return Response.ok("Data uploaded successfully !!").build();
    }
}
