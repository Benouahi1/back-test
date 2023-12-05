package com.optigove.project.service;

import com.optigove.project.model.CommerceOccup;
import com.optigove.project.repository.CommerceOccupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommerceOccupServiceImpl implements CommerceOccupService{
    private final CommerceOccupRepository commerceOccupRepository;


    @Override
    public CommerceOccup create(CommerceOccup commerceOccup){
        return commerceOccupRepository.save(commerceOccup);
    }

    @Override
    public List<CommerceOccup> lire(){
        return commerceOccupRepository.findAll();
    }

    @Override
    public String Suppremer(Long id){
        commerceOccupRepository.deleteById(id);
        return "Liquadation de bien Supremer";
    }

}
