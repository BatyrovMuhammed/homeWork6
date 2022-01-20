package org.example.dao2;

public class Cities {

    private int id;
    private String name;
    private int formed_year;
    private String is_located;
    private Long live_people;

    public Cities(int id, String name, int formed_year, String is_located, Long live_people) {
        this.id = id;
        this.name = name;
        this.formed_year = formed_year;
        this.is_located = is_located;
        this.live_people = live_people;
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

    public int getFormed_year() {
        return formed_year;
    }

    public void setFormed_year(int formed_year) {
        this.formed_year = formed_year;
    }

    public String getIs_located() {
        return is_located;
    }

    public void setIs_located(String is_located) {
        this.is_located = is_located;
    }

    public Long getLive_people() {
        return live_people;
    }

    public void setLive_people(Long live_people) {
        this.live_people = live_people;
    }

    @Override
    public String toString() {
        return "Cities: " + '\n' +
                "\nid: |" + id + '\n' +
                " Aty: |" + name + '\n' +
                " Kanchanchy jyly tuzulgon? |" +  formed_year + " - jyly" + '\n' +
                " Kaisy jerde jaigashkan? |" +  is_located + "da jaigashkan" + '\n' +
                " Kalkynyn sany: |" + live_people + '\n';
    }
    public static void prn(){
        System.out.println(" 1 - id cities (~~~Shaarlardy taba alasyz~~~.)");
        System.out.println(" 2 - id countries (~~~Olkolordu taba alasyz~~~.)");
        System.out.println(" 3 - id cities (~~~Shaarlardy id menen taba alasyz~~~.)");


    }
}
