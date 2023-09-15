package iannbraga.service;

import java.util.List;

import iannbraga.dto.CidadeDTO;
import iannbraga.dto.CidadeResponseDTO;

public interface CidadeService {

        // recursos basicos
        List<CidadeResponseDTO> getAll();

        CidadeResponseDTO findById(Long id);
    
        CidadeResponseDTO create(CidadeDTO dto);
    
        CidadeResponseDTO update(Long id, CidadeDTO dto);
    
        void delete(Long id);
    
        // recursos extras
    
        List<CidadeResponseDTO> findByNome(String nome);
    
        long count();
    
}