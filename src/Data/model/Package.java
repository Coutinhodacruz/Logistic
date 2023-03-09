package Data.model;

import java.time.LocalDate;
import java.util.List;

public class Package {

    private int id;
    private double weighInGrammes;
    private User sender;
    private User receiver;
    private LocalDate timeCreated;
    private List<Event> status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeighInGrammes() {
        return weighInGrammes;
    }

    public void setWeighInGrammes(double weighInGrammes) {
        this.weighInGrammes = weighInGrammes;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public LocalDate getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDate timeCreated) {
        this.timeCreated = timeCreated;
    }

    public List<Event> getStatus() {
        return status;
    }

    public void setStatus(List<Event> status) {
        this.status = status;
    }

    public boolean isPayOnDelivery() {
        return payOnDelivery;
    }

    public void setPayOnDelivery(boolean payOnDelivery) {
        this.payOnDelivery = payOnDelivery;
    }

    private boolean payOnDelivery;


}
