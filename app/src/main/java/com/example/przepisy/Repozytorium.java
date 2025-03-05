package com.example.przepisy;

import java.util.ArrayList;

public class Repozytorium {
    public static ArrayList<Przepis> przepisy;
    public static void wygenrujPrzepisu(){
        przepisy = new ArrayList<Przepis>();
        przepisy.add(new Przepis(
                "Mufinki",
                "Mleko, maka, cukier, kakao, wszystko wymieszac",
                "Ciastko",
                R.drawable.mafinki,
                0
                )
        );
        przepisy.add(new Przepis(
                        "Sernik",
                        "Ser, maslo, ziemnaki, kokos",
                        "Ciasto",
                        R.drawable.sernik,
                        2
                )
        );
        przepisy.add(new Przepis(
                        "Makowiec",
                        "Mak, drodze, maka, mleko, cukier",
                        "Ciasto",
                        R.drawable.makowiec,
                        1
                )
        );
        przepisy.add(new Przepis(
                        "Kako",
                        "kakao, mleko",
                        "Napoje",
                        R.drawable.kakao,
                        0
                )
        );
    }
}
