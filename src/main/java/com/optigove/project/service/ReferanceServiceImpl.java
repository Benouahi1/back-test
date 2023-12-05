package com.optigove.project.service;

import com.optigove.project.model.Referance;
import com.optigove.project.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReferanceServiceImpl implements ReferanceService{


    private final ImmeubleRepository immeubleRepository;
    private final TransportPublicRepository transportPublicRepository;
    private final AutreBienRepository autreBienRepository;
    private final OccupationCommerceRepository occupationCommerceRepository;
    private final TransportRepository transportRepository;
    private final SejourRepository sejourRepository;
    private final ReferanceRepository referanceRepository;
    private final TaxeBoissonRepository taxeBoissonRepository;



    @Override
    public Referance create(Referance referance) {
        Referance referance2 = referanceRepository.save(referance);
        referance2.getTaxeBoissons().forEach(k->{
            k.setReferance(referance2);
            taxeBoissonRepository.save(k);
        });
        return referance2;
    }

    @Override
    public Referance Ajouter(Referance referance) {
        Referance referance9 = referanceRepository.save(referance);
        referance9.getSejours().forEach(k->{
            k.setReferance(referance9);
            sejourRepository.save(k);
        });
          referance9.setPersoneMoral(referance9.getPersoneMoral());

        return referance9;
    }


    @Override
    public Referance AjouterTransport(Referance referance) {
        Referance referance3 = referanceRepository.save(referance);
        referance3.getTransports().forEach(k->{
            k.setReferance(referance3);
            transportRepository.save(k);
        });
        return referance3;
    }
    @Override
    public Referance AjouterOccupation(Referance referance) {
        Referance referance4 = referanceRepository.save(referance);
        referance4.getOccupationCommerces().forEach(k->{
            k.setReferance(referance4);
            occupationCommerceRepository.save(k);
        });
        return referance4;
    }
    @Override
    public Referance AjouterAutrebien(Referance referance) {
        Referance referance5 = referanceRepository.save(referance);
        referance5.getAutreBiens().forEach(k->{
            k.setReferance(referance5);
            autreBienRepository.save(k);
        });
        return referance5;
    }

    @Override
    public Referance AjouterTransportPublic(Referance referance) {
        Referance referance6 = referanceRepository.save(referance);
        referance6.getTransportPublics().forEach(k->{
            k.setReferance(referance6);
            transportPublicRepository.save(k);
        });
        return referance6;
    }

    @Override
    public Referance AjouterImmeuble(Referance referance) {
        Referance referance7 = referanceRepository.save(referance);
        referance7.getImmeubles().forEach(k->{
            k.setReferance(referance7);
            immeubleRepository.save(k);
        });
        return referance7;
    }




    @Override
    public List<Referance> lire() {
        return referanceRepository.findAll();
    }

    @Override
    public Referance modifier(Long id, Referance referance) {
        return referanceRepository.findById(id)
                .map(p-> {
                    p.setDeligataire(p.getDeligataire());
                    p.setSupport(p.getSupport());
                    p.setAdress(p.getAdress());
                    p.setLibelle(p.getLibelle());
                    p.setCin(p.getCin());

                    return referanceRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("Referance Non trouver"));
    }



    @Override
    public String supprimer(Long id) {

        referanceRepository.deleteById(id);
        return "Referance Suppremer";
    }
}
