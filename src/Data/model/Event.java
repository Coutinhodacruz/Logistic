package Data.model;

import java.time.LocalDate;

public class Event {

    private int id;

    private LocalDate when;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getWhen() {
        return when;
    }

    public void setWhen(String when) {
        When = when;
    }

    public void setWhen(LocalDate when) {
        this.when = when;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    private String who;

    private String When;
}
