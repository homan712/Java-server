package School.NY.CS3613.thecounter.controller;


import School.NY.CS3613.thecounter.service.NewNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")

public class numberController {

    @GetMapping("/123")
    public int[] countNumber(){return NewNumber.getNumber();}


}
