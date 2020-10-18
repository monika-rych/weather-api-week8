
package com.rych.demo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "weather",
        "base",
        "main",
        "visibility",
        "wind",
        "name",
        "cod"
})

@Entity
public class WeatherDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idRecord;
    @JsonProperty("weather")
    @OneToMany(cascade = CascadeType.ALL)
    private List<WeatherDescription> weather = new ArrayList<>();
    @JsonProperty("base")
    private String base;
    @JsonProperty("main")
    @OneToOne(cascade = CascadeType.ALL)
    private Temperature temperature;
    @JsonProperty("visibility")
    private Integer visibility;
    @JsonProperty("wind")
    @OneToOne(cascade = CascadeType.ALL)
    private Wind wind;
    @JsonProperty("name")
    public String name;
    @JsonProperty("cod")
    private Integer cod;

    public Long getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(Long idRecord) {
        this.idRecord = idRecord;
    }

    @JsonProperty("weather")
    public List<WeatherDescription> getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(List<WeatherDescription> weather) {
        this.weather = weather;
    }

    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    @JsonProperty("main")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("main")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("cod")
    public Integer getCod() {
        return cod;
    }

    @JsonProperty("cod")
    public void setCod(Integer cod) {
        this.cod = cod;
    }
}
