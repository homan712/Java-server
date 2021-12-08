package School.CityTech.CST3613.thecounter.controller;

import School.CityTech.CST3613.loadxml.Property;
import School.CityTech.CST3613.loadxml.SelectProperties;
import School.CityTech.CST3613.thecounter.service.NewNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {
    @GetMapping("/")
    public List<Property> getList(){
        return  SelectProperties.findAll();
    }
}
