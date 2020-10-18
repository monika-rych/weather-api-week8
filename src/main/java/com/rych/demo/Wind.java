
package com.rych.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "speed",
    "deg"
})
@Entity
public class Wind {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idRecord;
    @JsonProperty("speed")
    private Double speed;
    @JsonProperty("deg")
    private Integer deg;

    public Long getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(Long idRecord) {
        this.idRecord = idRecord;
    }

    @JsonProperty("speed")
    public Double getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    @JsonProperty("deg")
    public Integer getDeg() {
        return deg;
    }

    @JsonProperty("deg")
    public void setDeg(Integer deg) {
        this.deg = deg;
    }
}
