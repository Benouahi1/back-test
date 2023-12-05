package com.optigove.project.service;

import com.optigove.project.model.Habtion;
import com.optigove.project.repository.HabtionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HabtionServiceImpl implements HabtionService{

private final HabtionRepository habtionRepository;

@Override
    public Habtion create(Habtion habtion){
    return habtionRepository.save(habtion);
}

@Override
    public List<Habtion> lire(){
    return habtionRepository.findAll();
}

@Override
    public String Suppremer(Long id){
    habtionRepository.deleteById(id);
    return "";
}

}
