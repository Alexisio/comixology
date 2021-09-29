package com.bts_sio.comixology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Equipe> listeEquipe;

    Equipe e1 = new Equipe(1,"avengers","Super héros marvel", "avengers/Avengers.jpg");
    Equipe e2 = new Equipe(1,"jla","Super héros DC", "jla/jla.png");
    Equipe e3 = new Equipe(1,"xmen","Super héros Mutants", "xmen/xmen.png");

    ListView lvliste;

    ArrayList<Membre> listeMembre;

    Membre m1 = new Membre(1,"captain america","héros 2nd guerre mondiale", "avengers/capamerica.png");
    Membre m2 = new Membre(1,"guepe","super guepe", "avengers/guepe.png");
    Membre m3 = new Membre(1,"ironman","home de métal", "avengers/ironman.png");

    ListView lvliste1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listeEquipe = new ArrayList<Equipe>();
        listeEquipe.add(e1);
        listeEquipe.add(e2);
        listeEquipe.add(e3);

        listeMembre = new ArrayList<Membre>();
        listeMembre.add(m1);
        listeMembre.add(m2);
        listeMembre.add(m3);

        lvliste = (ListView) findViewById(R.id.lvliste1);

        lvliste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startViewActivity(i);
            }
        });

    }
    private void startViewActivity(int i){
        Equipe uneEquipe = listeEquipe.get(i);
        Intent intent = new Intent(this,MembreActivity.class);
        intent.putExtra("idE", uneEquipe.getIdE());
        startActivity(intent);


        // partie membre startViewActivity

        Membre unMembre = listeMembre.get(1);
        Intent intent1 = new Intent(this,MembreActivity.class);
        intent1.putExtra("idM",unMembre.getIdM());
        StartActivity(intent1);

    }

    private void StartActivity(Intent intent1) {
    }

    @Override
    protected void onResume() {
        super.onResume();
        ListeAdapter listeAdapter = new ListeAdapter(this, listeEquipe);
        lvliste.setAdapter(listeAdapter);

        //onResume membre
        ListeAdapter listeAdapter1 = new ListeAdapter(this, listeMembre);
        lvliste1.setAdapter(listeAdapter1);
    }









}