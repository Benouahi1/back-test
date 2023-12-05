package com.optigove.project.service;

import com.optigove.project.model.Transport;
import com.optigove.project.repository.TransportRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class TransportServiceImpl implements TransportService {

    private final TransportRepository transportRepository;

    @Override
    public Transport create(Transport transport){
        return transportRepository.save(transport);
    }

    @Override
    public List<Transport> lire(){
        return  transportRepository.findAll();
    }

    @Override
    public String suppremer(Long id){
        transportRepository.deleteById(id);
        return "transport bon supremer";
    }



}
