package jpabook.jpashop.domain;

import javax.persistence.Embeddable;

/**
 * Created by hanmomhanda on 15. 8. 23.
 */
@Embeddable
public class Address {

    private String city;

    private String street;

    private String zipcode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
