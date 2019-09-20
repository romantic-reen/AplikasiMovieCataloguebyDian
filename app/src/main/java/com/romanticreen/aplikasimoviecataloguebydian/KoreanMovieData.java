package com.romanticreen.aplikasimoviecataloguebydian;

import java.util.ArrayList;

public class KoreanMovieData {
    public static String[][] data = new String[][]{
            {"Death Bell", "The only Korean horror film released over the summer of 2008, it is the first feature by former music video director Chang (real name Yoon Hong-seung), who also co-wrote the screenplay.", "https://en.wikipedia.org/wiki/Death_Bell#/media/File:Death_Bell_film_poster.jpg"},
            {"More than Blue", "The South Korean film, directorial debut of poet Won Tae-yeon, it stars Kwon Sang-woo, Lee Bo-young and Lee Beom-soo in the lead roles. The film's Korean title translates as \"A Story Sadder Than Sadness\" in 2009.", "https://en.wikipedia.org/wiki/More_than_Blue#/media/File:More_Than_Blue_film_poster.jpg"},
            {"Mr. Idol", "A South Korean film written and directed by Ra Hee-chan. Ra called it, \"a movie that captures young people's dreams through music on 2011.", "https://en.wikipedia.org/wiki/Mr._Idol#/media/File:Mr._Idol_poster.jpg"},
            {"Top Star", "A South Korean film directed, co-written and produced by veteran actor Park Joong-hoon, in his directorial debut on 2013. It stars Uhm Tae-woong as the manager of a top actor who dreams of someday becoming famous like his client, but when a twist of fate grants his wish, his life completely changes. The film premiered at the 18th Busan International Film Festival.", "https://en.wikipedia.org/wiki/Top_Star#/media/File:TOP_STAR_poster.jpg"},
            {"Mad Sad Bad", "Based on a true murder case. Two teenagers, hooked on an online video game, is asked to kill the boyfriend of a fellow online gamer. The teenagers decide to take action.", "http://asianwiki.com/File:Mad_Sad_Bad-p1.jpg"},
            {"Deja Vu", "When Ji-Min (Nam Gyu-Ri) is in a car with her fiance Woo-Jin (Lee Gyu-Han) driving, Woo-Jin hits a woman. This Korean movie was released on May 30, 2018.", "http://asianwiki.com/images/6/64/Deja_Vu_%28Korean_Movie%29-p01.jpg"},
            {"A History of Jealousy", "Soo-Min (Nam Gyu-Ri), Won-Ho (Oh Ji-Ho), Jin-Sook (Jang So-Yeon), Hong (Kim Seung-Hyeon) and Sun-Gi (Jo Han-Sun) were friends when they were university students. They meet in Gunsan for the first time in 10 years. The five friends seem awkward around each other. Jin-Sook says something. This causes shocking secrets to be revealed. This Korean movie was released on March 14, 2019", "http://asianwiki.com/images/d/d3/A_History_of_Jealousy-p01.jpg"},
            {"The Battleship Island", "South Korean period action film starring Hwang Jung-min, So Ji-sub, Song Joong-ki and Lee Jung-hyun in 2017.", "https://en.wikipedia.org/wiki/The_Battleship_Island#/media/File:The_Battleship_Island_(film).jpg"},
            {"A Werewolf Boy", "South Korean fantasy romance film in 2012.", "https://en.wikipedia.org/wiki/A_Werewolf_Boy#/media/File:A_Werewolf_Boy.jpg"},
            {"Train to Busan", "South Korean zombie apocalypse action thriller film directed by Yeon Sang-ho and starring Gong Yoo, Jung Yu-mi, and Ma Dong-seok in 2016.", "https://en.wikipedia.org/wiki/Train_to_Busan#/media/File:Train_to_Busan.jpg"},
    };
    private static Object KoreanMovie;

    public static ArrayList<KoreanMovie> getListData(){
        ArrayList<KoreanMovie> list = new ArrayList<>();
        for (String[] aData : data) {
            KoreanMovie koreanMovie = new KoreanMovie();
            koreanMovie.setName(aData[0]);
            koreanMovie.setDesc(aData[1]);
            koreanMovie.setPhoto(aData[2]);
            list.add((com.romanticreen.aplikasimoviecataloguebydian.KoreanMovie) KoreanMovie);
        }
        return list;
    }
}