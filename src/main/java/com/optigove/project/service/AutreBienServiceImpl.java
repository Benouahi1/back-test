package com.optigove.project.service;


import com.optigove.project.model.AutreBien;
import com.optigove.project.repository.AutreBienRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AutreBienServiceImpl implements AutreBienService{
    private final AutreBienRepository autreBienRepository;

    @Override
    public AutreBien create(AutreBien autreBien){
        return autreBienRepository.save(autreBien);
    }

    @Override
    public List<AutreBien> lire(){
        return autreBienRepository.findAll();
    }

    @Override
    public String Suppremer(Long id){
        autreBienRepository.deleteById(id);
        return "Autre biet de bien supremer";
    }


}
