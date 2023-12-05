package com.optigove.project.service;

import com.optigove.project.model.OccupationCommerce;
import com.optigove.project.repository.CommerceOccupRepository;
import com.optigove.project.repository.OccupationCommerceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OccupationCommerceServiceImpl implements OccupationCommerceService {

    private final CommerceOccupRepository commerceOccupRepository;
    private final OccupationCommerceRepository occupationCommerceRepository;


    @Override
    public OccupationCommerce create(OccupationCommerce occupationCommerce){
        OccupationCommerce Occup2 = occupationCommerceRepository.save(occupationCommerce);

        Occup2.getCommerceOccups().forEach(l->{
            l.setOccupationCommerce(Occup2);
            commerceOccupRepository.save(l);
        });
        return Occup2;
    }

    @Override
    public List<OccupationCommerce> lire(){
        return occupationCommerceRepository.findAll();
    }

    @Override
    public String Suppremer(Long id){
        occupationCommerceRepository.deleteById(id);
        return "Occupation Commerce de bien Supremer";
    }

}
