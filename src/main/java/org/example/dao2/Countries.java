package org.example.dao2;

public class Countries {
    private int id;
    private String name;
    private String religion;
    private String neighboring_countries;
    private Long live_people;

    public Countries(int id, String name, String religion, String neighboring_countries, Long live_people) {
        this.id = id;
        this.name = name;
        this.religion = religion;
        this.neighboring_countries = neighboring_countries;
        this.live_people = live_people;
    }

    public Countries() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNeighboring_countries() {
        return neighboring_countries;
    }

    public void setNeighboring_countries(String neighboring_country) {
        this.neighboring_countries = neighboring_country;
    }

    public Long getLive_people() {
        return live_people;
    }

    public void setLive_people(Long live_people) {
        this.live_people = live_people;
    }

    @Override
    public String toString() {
        return "Countries: |" + '\n' +
                "id: |" + id + '\n' +
                " Aty: |" + name + '\n' +
                " Dini: |" + religion + '\n' +
                " Chektesh olkosu: |" + neighboring_countries + '\n' +
                " Kalkynyn sany: |" + live_people + '\n';
    }
}
