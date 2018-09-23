package pl.akademiakodu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.data.GifRepository;
import pl.akademiakodu.model.Gif;

import java.util.List;

@Controller
public class GifController {

@Autowired
    GifRepository gifRepository;


    @RequestMapping("/")
    //@ResponseBody //jak nie ma modelu wiec wyswietlo to co jest tu
    public String listGifs(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.getAllGifs();
        modelMap.put("gifs",gifs);
        return "home";
    }
//<<<<<<< HEAD
//@RequestMapping("/gif")
//    public String gifDetails(ModelMap modelmap){
//        Gif gif = new Gif(true,"michalos", "android-explosin");
//        modelmap.put("gif",gif);
//        return "gif-details";
//
//}
//=======


    @RequestMapping("/gif/{name}")
    public String gifDetails( @PathVariable String name,
            ModelMap modelMap){
       // Gif gif = new Gif(true, "compiler-bot", "michalos");
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";

    }
//>>>>>>> d0fa4d780cebfa9b5e78dac6e6c654d474703b04

    @RequestMapping("/favorites")
    public String getFavorites(ModelMap modelMap){
        List<Gif> gifs = gifRepository.getFavorites();
        modelMap.put("gifs",gifs);
        return "favorites";
    }

}
