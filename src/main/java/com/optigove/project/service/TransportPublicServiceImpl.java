package com.optigove.project.service;


import com.optigove.project.model.TransportPublic;
import com.optigove.project.repository.TransportPublicRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TransportPublicServiceImpl implements TransportPublicService{

    private final TransportPublicRepository transportPublicRepository;

    @Override
    public TransportPublic create(TransportPublic transportPublic){
        return transportPublicRepository.save(transportPublic);
    }
    @Override
    public List<TransportPublic> lire(){
        return transportPublicRepository.findAll();
    }

    @Override
    public String suppremer(Long id){
        transportPublicRepository.deleteById(id);
        return  "Trenasport public bon supremer";
    }

}
