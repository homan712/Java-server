package School.NY.CS3613.property;

import School.NY.CS3613.loadxml.Property;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {
    @GetMapping("/")
    public List<Property> getList(){
        return  propertyDAO.findAll();
    }
}
