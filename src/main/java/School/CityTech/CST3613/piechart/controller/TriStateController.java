package School.CityTech.CST3613.piechart.controller;

import School.CityTech.CST3613.piechart.GroupByState;
import School.CityTech.CST3613.piechart.GroupByStateDAO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@RestController

public class TriStateController {
    @GetMapping("/triState")
    public List<GroupByState> triState(){
        Predicate<GroupByState> predicate = e -> e.getState().equals("NY")||
                e.getState().equals("NJ") || e.getState().equals("CT");

       var list =  GroupByStateDAO.findAll().stream().filter(predicate).toList();
       return list;
    }

    @RequestMapping(value = "/allStates")
    public List<GroupByState> getAll(@RequestParam(value="states", defaultValue = "all")String[] states){

        Predicate<GroupByState> predicateFilter = e -> false;

        if (states.length == 1 && states[0].equals("all")){
            predicateFilter = e-> true;
        }else{
            Predicate<GroupByState> predicate = e -> false;

            predicateFilter = Arrays.stream(states)
                    .map(m -> predicate.or(e -> e.getState().equals(m)))
                    .reduce((a,b) -> a.or(b)).get();
        }

        var list =  GroupByStateDAO.findAll().stream().filter(predicateFilter).toList();
        return list;
    }

}
