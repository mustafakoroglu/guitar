package controller;


import Enums.Color;
import Enums.Type;
import entity.Guitar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import service.GuitarService;
import Exception.GuitarException;
import Exception.GuitarExceptionCodes;

import java.util.List;

@RestController
@RequestMapping("/api/v1/guitar")
public class GuitarController {

    @Autowired
    private GuitarService guitarService;

    @GetMapping(value = "/list")
    public List<Guitar> getGuitarList() {
        List<Guitar> guitarList = guitarService.list();
        return guitarList;
    }

    @GetMapping(value = "{id}")
    public Guitar getGuitar(@PathVariable Long id) throws GuitarException{
        Guitar guitar = guitarService.get(id);
        if(guitar != null){
            return guitar;
        }
        else{
            GuitarException.throwGuitarException(GuitarExceptionCodes.GUITAR_NOT_FOUND);
            return null;
        }
    }

    @PostMapping
    public String create(@RequestBody final Guitar guitar){
        Guitar savedGuitar = guitarService.create(guitar);
        return savedGuitar.getId();
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) throws GuitarException{
        try{
            guitarService.delete(id);
        }
        catch (Exception e){
            GuitarException.throwGuitarException(GuitarExceptionCodes.GUITAR_NOT_FOUND);
        }
    }


    @GetMapping(value = "/find/{color}/{type}")
    public List<Guitar> findByColorAndType(@PathVariable Color color,@PathVariable Type type) throws GuitarException{
        List<Guitar>  guitarListByColorAndType = guitarService.findByColorAndType(color,type);
        if(!CollectionUtils.isEmpty(guitarListByColorAndType)){
            return guitarService.getGuitarForEnduserFieldsOnly(guitarListByColorAndType);
        }
        else{
            GuitarException.throwGuitarException(GuitarExceptionCodes.GUITAR_NOT_FOUND);
            return null;
        }
    }

    @PutMapping
    public String sellGuitar(@RequestBody final Guitar guitar){
        Guitar savedGuitar = guitarService.create(guitar);
        return savedGuitar.getId();
    }





}
