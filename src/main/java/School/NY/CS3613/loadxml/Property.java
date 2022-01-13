package School.NY.CS3613.loadxml;

import org.w3c.dom.Element;

public class Property {
    private String id;
    private float cost;
    private float downPayment;
    private String state;
    private float percentage;
    private float netIncome;

    public Property(String id, float cost, float downPayment, String state, float percentage, float netIncome) {
        this.id = id;
        this.cost = cost;
        this.downPayment = downPayment;
        this.state = state;
        this.percentage = percentage;
        this.netIncome = netIncome;
    }

    public Property(Element element){
        this.id = element.getAttribute("id");
        this.cost = XMLUtility.getAttributeNumber(element, "cost");
        this.downPayment = XMLUtility.getAttributeNumber(element, "downPayment");
        this.state = element.getAttribute("state");
        this.percentage = XMLUtility.getAttributeNumber(element, "percentage");
        this.netIncome = XMLUtility.getNumberContent(element);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(float downPayment) {
        this.downPayment = downPayment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(float netIncome) {
        this.netIncome = netIncome;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "id='" + id + '\'' +
                ", cost=" + cost +
                ", downPayment=" + downPayment +
                ", state=" + state +
                ", percentage=" + percentage +
                ", netIncome=" + netIncome +
                '}';
    }
}
