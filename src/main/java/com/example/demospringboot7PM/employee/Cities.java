package com.example.demospringboot7PM.employee;

import java.util.Objects;

public class Cities {
    String cityName, stateName;
    int cityPopulation;

    public Cities(String cityName, String stateName, int cityPopulation) {
        this.cityName = cityName;
        this.stateName = stateName;
        this.cityPopulation = cityPopulation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cities)) return false;
        Cities cities = (Cities) o;
        return getCityPopulation() == cities.getCityPopulation() && getCityName().equals(cities.getCityName()) && getStateName().equals(cities.getStateName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCityName(), getStateName(), getCityPopulation());
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }
}
