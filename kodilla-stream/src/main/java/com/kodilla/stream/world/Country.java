package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(final String countryName, final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (getCountryName() != null ? !getCountryName().equals( country.getCountryName() ) : country.getCountryName() != null)
            return false;
        return getPeopleQuantity() != null ? getPeopleQuantity().equals( country.getPeopleQuantity() ) : country.getPeopleQuantity() == null;

    }

    @Override
    public int hashCode() {
        int result = getCountryName() != null ? getCountryName().hashCode() : 0;
        result = 31 * result + (getPeopleQuantity() != null ? getPeopleQuantity().hashCode() : 0);
        return result;
    }
}
