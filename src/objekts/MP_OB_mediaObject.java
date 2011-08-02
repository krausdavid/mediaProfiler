package objekts;


import enums.Kind;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.awt.font.ImageGraphicAttribute;
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
    public long ean;
    public String name;
    public String kurzbeschreibung;
    public Image img;
    public int year_of_production;
    public String genre;

    //Vertiefung des genres

//######By DVD and Blueray######
    public ArrayList<String> actors;
    public String director;
    public String producer;
    public String format;
    public String language;
    public String subtitles;
    public String studio;
    public MP_OB_date erscheinung;
    public int time;
    public int age;
//######By Books######
    public long isbn;
    public String autor;
    public String verlag;
//######By CD#######
    ArrayList<String> interpret;
    ArrayList<String> trackList;
    String label;
    String komponist;




    public MP_OB_mediaObject(Kind kind, long ean, String name, String kurzbeschreibung,Image img, ArrayList<String> actors, String director, String producer, String format, String language, String subtitles, String studio, MP_OB_date erscheinung, int year_of_production, int time, int age,long isbn,String autor, String verlag, ArrayList<String> interpret, ArrayList<String> trackList,String label, String komponist) {

        this.kind = kind;
        this.ean = ean;
        this.name = name;
        this.kurzbeschreibung = kurzbeschreibung;
        this.img = img;
        this.year_of_production = year_of_production;

        if(kind == Kind.DVD || kind == Kind.BLUERAY){
            this.actors = actors;
            this.director = director;
            this.producer = producer;
            this.format = format;
            this.language = language;
            this.subtitles = subtitles;
            this.studio = studio;
            this.erscheinung = erscheinung;
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
            this.time = -1;
            this.age = -1;

        }

        if(kind == Kind.BOOK){
            this.isbn = isbn;
            this.autor = autor;
            this.verlag = verlag;

        }else{
            this.isbn = -1;
            this.autor = null;
            this.verlag = null;
        }

        if(kind == Kind.CD){
            this.interpret = interpret;
            this.label = label;
            this.trackList = trackList;
            this.komponist = komponist;
        }else{
            this.interpret = null;
            this.label = null;
            this.trackList = null;
            this.komponist = null;
        }

    }
}
