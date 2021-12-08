package School.CityTech.CST3613.thecounter.controller;


import School.CityTech.CST3613.thecounter.service.NewNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/numbers")

public class numberController {

    @GetMapping("/123")
    public int[] countNumber(){return NewNumber.getNumber();}


}
