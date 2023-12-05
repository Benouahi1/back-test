package com.optigove.project.service;

import com.optigove.project.model.LiquadationBoisoon;
import com.optigove.project.repository.LiquadationBoissonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LiquadationBoissonServiceImpl implements LiquadationBoissonService {

    private final LiquadationBoissonRepository liquadationBoissonRepository;

    @Override
    public LiquadationBoisoon create(LiquadationBoisoon liquadationBoisoon){
        return liquadationBoissonRepository.save(liquadationBoisoon);
    }

    @Override
    public List<LiquadationBoisoon> lire(){
        return liquadationBoissonRepository.findAll();
    }

    @Override
    public String Suppremer(Long id){
        liquadationBoissonRepository.deleteById(id);
        return "Liquadation de bien Supremer";
    }
}

