package School.CityTech.CST3613.thecounter.controller;

import School.CityTech.CST3613.thecounter.service.NewAbcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alphabets")

public class ABCController {


    @GetMapping("/abc")

    public  Character[] countABC() {
        return NewAbcService.getABC();
    }
}

