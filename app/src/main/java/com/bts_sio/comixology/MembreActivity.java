package com.bts_sio.comixology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MembreActivity extends AppCompatActivity {
    
    ArrayList<Membre> listeMembre;
    Membre m1 = new Membre(1,"captain america","héros 2nd guerre mondiale", "avengers/capamerica.png");
    Membre m2 = new Membre(2,"guepe","super guepe", "avengers/guepe.png");
    Membre m3 = new Membre(3,"ironman","homme de métal", "avengers/ironman.png");
    Membre m4 = new Membre(4,"sorcière rouge","ma sorcière bien aimé ne remue pas son nez", "avengers/sorciererouge.png");
    Membre m5 = new Membre(5,"thor","un marteau, de la barbe, mais pas portugais", "avengers/thor.png");
    Membre m6 = new Membre(6,"vifargent","cours speedy cours", "avengers/vifargent.png");
    Membre m7 = new Membre(7,"vision","pas drole de mourir au début du dernier avengers", "avengers/vision.png");
    Membre m8 = new Membre(8,"ironman","home de métal", "avengers/ironman.png");
    Membre m10 = new Membre(10,"batman","j'ai pas de pouvoir mais j'ai de la thune mon frère", "jla/batman.png");
    Membre m11 = new Membre(11,"cyborg","mi-homme mi- poêle a frire", "jla/cyborg.png");
    Membre m12 = new Membre(12,"flash","le voyage dans le temps c'est cool", "jla/flash.png");
    Membre m13 = new Membre(13,"greenlantern","la puissance de l'esprit mais la limite d'un homme", "jla/greenlantern.png");
    Membre m14 = new Membre(14,"superman","immortel sauf si t'a un petit caillou vert", "jla/superman.png");
    Membre m15 = new Membre(15,"wonderwoman","demande à Ares ce qu'il a pensé de mes bracelets", "jla/wonderwoman.png");
    Membre m17 = new Membre(17,"angel","petit oiseau attention aux avions", "xmen/angel.png");
    Membre m18 = new Membre(18,"cyclope","j'ai deux yeux mais qu'un verre de lunette", "xmen/cyclope.png");
    Membre m19 = new Membre(19,"fauve","tout bleu mais pas un schtroumpf", "xmen/fauve.png");
    Membre m20 = new Membre(20,"iceberg","geoffrey remet nous des glaçons", "xmen/iceberg.png");
    Membre m21 = new Membre(21,"phenix","pas de renaissance possible, même si j'étais dans harry potter mais un pouvoir de malade", "xmen/phenix.png");






    ListView lvlisteMembre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membre);



        Intent intent = getIntent();
        int indice = intent.getIntExtra("idE",0);
        listeMembre = new ArrayList<Membre>();
        if (indice == 1){
            listeMembre.add(m1);
            listeMembre.add(m2);
            listeMembre.add(m3);
            listeMembre.add(m4);
            listeMembre.add(m5);
            listeMembre.add(m6);
            listeMembre.add(m7);
            listeMembre.add(m8);
        }
        else{
            if (indice == 2){
                listeMembre.add(m12);
                listeMembre.add(m10);
                listeMembre.add(m11);
                listeMembre.add(m13);
                listeMembre.add(m14);
                listeMembre.add(m15);
            }
            else{
                if (indice == 3){
                    listeMembre.add(m17);
                    listeMembre.add(m18);
                    listeMembre.add(m19);
                    listeMembre.add(m20);
                    listeMembre.add(m21);
                }
            }
        }

        lvlisteMembre = (ListView) findViewById(R.id.lvlisteMembre);

        lvlisteMembre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startViewActivityMember(i);
            }

        });
    }

    private void startViewActivityMember(int i){
        // partie membre startViewActivity

        Membre unMembre = listeMembre.get(i);
        Intent intent1 = new Intent(this,DescMembActivity.class);
        intent1.putExtra("idM",unMembre.getIdM());
        intent1.putExtra("imgM",unMembre.getImgM());
        startActivity(intent1);
    }




    @Override
    protected void onResume() {
        super.onResume();
        ListeAdapterM listeAdapterM = new ListeAdapterM(this, listeMembre);
        lvlisteMembre.setAdapter(listeAdapterM);

    }
}