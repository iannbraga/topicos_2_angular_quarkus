package iannbraga.service;

import java.util.List;

import iannbraga.dto.EstadoDTO;
import iannbraga.dto.EstadoResponseDTO;

public interface EstadoService {

        // recursos basicos
        List<EstadoResponseDTO> getAll();

        EstadoResponseDTO findById(Long id);
    
        EstadoResponseDTO create(EstadoDTO dto);
    
        EstadoResponseDTO update(Long id, EstadoDTO dto);
    
        void delete(Long id);
    
        // recursos extras
    
        List<EstadoResponseDTO> findByNome(String nome);
    
        long count();
    
}