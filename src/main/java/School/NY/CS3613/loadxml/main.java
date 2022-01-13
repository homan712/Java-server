package School.NY.CS3613.loadxml;

import School.NY.CS3613.piechart.GroupByStateDAO;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args){
        GroupByStateDAO.findAll().forEach(System.out::println);
        //SelectProperties.findAll().forEach(System.out::println);
    }
    public static void loadDataFromXML() {
        List<Property> propertyList = new ArrayList<>();
        XMLUtility.process("/Users/homan/homan/data/properties.xml", "property", element -> {
            var property = new Property(element);
            propertyList.add(property);
        });
        PropertyInsert.process(propertyList);
    }

    public static void getXML() {
        XMLUtility.process("/Users/homan/homan/data/properties.xml", "property", element -> {
            var properties = new Property(element);

            System.out.println(properties);
        });
    }

}
