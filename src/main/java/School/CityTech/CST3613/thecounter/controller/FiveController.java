package School.CityTech.CST3613.thecounter.controller;


import School.CityTech.CST3613.thecounter.service.NewFive;
import School.CityTech.CST3613.thecounter.service.NewNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")

public class FiveController {

    @GetMapping("/5")
    public int[] countNumber(){return NewFive.getNumber();}

}
