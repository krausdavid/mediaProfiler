package objekts;


import enums.Kind;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: krausdavid
 * Date: 24.07.11
 * Time: 22:45
 * To change this template use File | Settings | File Templates.
 * -1 is the null for integer
 */
public class MP_OB_mediaObject {

    public Kind kind;
    public long isbn;
    public String name;
    //Picture


//######By DVD######
    public ArrayList<String> actors;
    public String director;
    public String producer;
    public String format;
    public String language;
    public String subtitles;
    public String studio;
    public MP_OB_date erscheinung;
    public int year_of_production;
    public int time;
    public int age;
    public String kurzbeschreibung;


//######By Books######


    public MP_OB_mediaObject(Kind kind, long isbn, String name, ArrayList<String> actors, String director, String producer, String format, String language, String subtitles, String studio, MP_OB_date erscheinung, int year_of_production, int time, int age, String kurzbeschreibung) {

        this.kind = kind;
        this.isbn = isbn;
        this.name = name;
        this.kurzbeschreibung = kurzbeschreibung;


        if(kind == Kind.DVD || kind == Kind.BLUERAY){
            this.actors = actors;
            this.director = director;
            this.producer = producer;
            this.format = format;
            this.language = language;
            this.subtitles = subtitles;
            this.studio = studio;
            this.erscheinung = erscheinung;
            this.year_of_production = year_of_production;
            this.time = time;
            this.age = age;
        }else{
            this.actors = null;
            this.director = null;
            this.producer = null;
            this.format = null;
            this.language = null;
            this.subtitles = null;
            this.studio = null;
            this.erscheinung = null;
            this.year_of_production = -1;
            this.time = -1;
            this.age = -1;

        }

        if(kind == Kind.BOOK){

        }

        if(kind == Kind.CD){

        }

    }
}
