package com.optigove.project.service;

import com.optigove.project.model.TaxeBoisson;
import com.optigove.project.repository.LiquadationBoissonRepository;
import com.optigove.project.repository.TaxeBoissonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaxeBoissonServiceImpl implements TaxeBoissonService {

    private final TaxeBoissonRepository taxeBoissonRepository;
    private final LiquadationBoissonRepository liquadationBoissonRepository;

    @Override
    public TaxeBoisson create(TaxeBoisson taxeBoisson){
        TaxeBoisson taxeBoisson1 = taxeBoissonRepository.save(taxeBoisson);
        taxeBoisson1.getLiquadationBoisoons().forEach(l->{
            l.setTaxeBoisson(taxeBoisson1);
            liquadationBoissonRepository.save(l);
        });
        return taxeBoisson1;
    }

    @Override
    public List<TaxeBoisson> lire(){
        return taxeBoissonRepository.findAll();
    }

    @Override
    public String Supprimer(Long id) {
        taxeBoissonRepository.deleteById(id);
        return "Referance Suppremer";
    }


}
