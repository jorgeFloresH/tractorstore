package com.remedial.tractorstore.bootstrap;

import com.remedial.tractorstore.model.Catalogo;
import com.remedial.tractorstore.model.Foto;
import com.remedial.tractorstore.model.Tractor;
import com.remedial.tractorstore.repositories.CatalogoRepository;
import com.remedial.tractorstore.repositories.FotoRepository;
import com.remedial.tractorstore.repositories.TractorRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sun.applet.AppletListener;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private CatalogoRepository catalogoRepository;
    private FotoRepository fotoRepository;
    private TractorRepository tractorRepository;

    public DevBootstrap(CatalogoRepository catalogoRepository, FotoRepository fotoRepository, TractorRepository tractorRepository) {
        this.catalogoRepository = catalogoRepository;
        this.fotoRepository = fotoRepository;
        this.tractorRepository = tractorRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        //categori
        Catalogo tractorCatalogo = new Catalogo();
        tractorCatalogo.setName("tractores");
        tractorCatalogo.setCodigo("trac");

        catalogoRepository.save(tractorCatalogo);

        //montacarga
        Catalogo montacarga = new Catalogo();
        montacarga.setName("montacarga");
        montacarga.setCodigo("mont");

        catalogoRepository.save(montacarga);

        //tractor
        Tractor caterpillar = new Tractor();
        caterpillar.setCatalogo(tractorCatalogo);
        caterpillar.setName("caterpillar 2x34");
        caterpillar.setMarca("caterpillar");
        caterpillar.setFabricacion(1994);
        caterpillar.setPrecio(11000);
        caterpillar.setDescripcion("usado");
        caterpillar.setEstado(true);

        tractorRepository.save(caterpillar);

        Tractor toyota = new Tractor();
        toyota.setCatalogo(montacarga);
        toyota.setName("caldina");
        toyota.setEstado(true);

        tractorRepository.save(toyota);

        //foto
        Foto fotoCat = new Foto();
        fotoCat.setNombre("cat");
        fotoCat.setRuta("../src");
        fotoCat.setTractor(caterpillar);

        fotoRepository.save(fotoCat);
    }
}
