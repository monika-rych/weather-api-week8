
package com.rych.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "main",
    "description",
})
@Entity
public class WeatherDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idRecord;

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("main")
    private String main;
    @JsonProperty("description")
    private String description;

    public Long getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(Long idRecord) {
        this.idRecord = idRecord;
    }

    @JsonProperty("main")
    public String getMain() {
        return main;
    }

    @JsonProperty("main")
    public void setMain(String main) {
        this.main = main;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }
}
