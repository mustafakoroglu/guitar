package service;

import Enums.Color;
import Enums.Type;
import dto.GuitarDTO;
import entity.Guitar;
import org.springframework.beans.factory.annotation.Autowired;
import repo.GuitarRepository;

import java.util.ArrayList;
import java.util.List;

public class GuitarService {

    @Autowired
    private GuitarRepository guitarRepository;

    public List<Guitar> list(){
        return guitarRepository.findAll();
    }

    public Guitar get(Long id){
        return guitarRepository.getById(id);
    }

    public Guitar create(final Guitar guitar){
        return guitarRepository.save(guitar);
    }

    public void delete(Long id){
        guitarRepository.deleteById(id);
    }

    public List<Guitar> findByColorAndType(Color color, Type type) {
        return guitarRepository.findByColorAndType(color.id,type.id);
    }

    public List<GuitarDTO> getGuitarForEnduserFieldsOnly(List<Guitar> list){
        List<GuitarDTO> guitarDTOList = new ArrayList<>();
        for(Guitar guitar : list){
            GuitarDTO dto = new GuitarDTO(guitar);
            guitarDTOList.add(dto);
        }
        return guitarDTOList;
    }
}
