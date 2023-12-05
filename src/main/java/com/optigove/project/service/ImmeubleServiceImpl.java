package com.optigove.project.service;

import com.optigove.project.model.Immeuble;
import com.optigove.project.repository.ImmeubleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ImmeubleServiceImpl implements ImmeubleService{

    private final ImmeubleRepository immeubleRepository;


    @Override
    public Immeuble create(Immeuble immeuble){
        return immeubleRepository.save(immeuble);
    }

    @Override
    public List<Immeuble> lire(){
        return immeubleRepository.findAll();
    }

    @Override
    public String Suppremer(Long id){
        immeubleRepository.deleteById(id);
        return "Autre biet de bien supremer";
    }

}
