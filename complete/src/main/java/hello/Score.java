package hello;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;


public class Score implements Serializable {

    @JsonProperty
    private String name;
    @JsonProperty
    private String points;
    @JsonProperty
    private String country;
    @JsonProperty
    private String position;

    public Score() {
    }

    public Score(String name, String points, String country, String position) {
        this.name = name;
        this.points = points;
        this.country = country;
        this.position = position;
    }

    @Override
    public String toString() {
        return  "{\"name\":"+ name +",\"points\""+ points +",\"position\":"+ position +",\"country\":"+ country +"}";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
