package jpabook.jpashop.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by hanmomhanda on 15. 8. 23.
 */
@Entity
@DiscriminatorValue("M")
public class Movie extends Item {

    private String director;

    private String actor;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
