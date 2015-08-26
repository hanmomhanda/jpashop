package jpabook.jpashop.domain;

import javax.persistence.*;

/**
 * Created by hanmomhanda on 15. 8. 23.
 */
@Entity
@DiscriminatorValue("A")
public class Album extends Item {

    private String artist;

    private String etc;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
}
