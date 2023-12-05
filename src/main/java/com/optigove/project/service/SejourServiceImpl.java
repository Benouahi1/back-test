package com.optigove.project.service;

import com.optigove.project.model.Sejour;
import com.optigove.project.repository.SejourRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SejourServiceImpl implements SejourService {

    private final SejourRepository sejourRepository;

    @Override
    public Sejour create(Sejour sejour){
        return  sejourRepository.save(sejour);
    }

    @Override
    public List<Sejour> lire(){
        return sejourRepository.findAll();
    }

    @Override
    public String Suppremer(Long id){
        sejourRepository.deleteById(id);
        return "Sejour de bien Supremer";
    }

}
