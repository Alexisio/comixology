package com.bts_sio.comixology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Equipe> listeEquipe;



    Equipe e1 = new Equipe(1,"avengers","Super héros marvel", "avengers/Avengers.jpg");
    Equipe e2 = new Equipe(2,"jla","Super héros DC", "jla/jla.png");
    Equipe e3 = new Equipe(3,"xmen","Super héros Mutants", "xmen/xmen.png");

    ListView lvliste1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listeEquipe = new ArrayList<Equipe>();
        listeEquipe.add(e1);
        listeEquipe.add(e2);
        listeEquipe.add(e3);



        lvliste1 = (ListView) findViewById(R.id.lvliste1);


        lvliste1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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


    }



    @Override
    protected void onResume() {
        super.onResume();
        ListeAdapter listeAdapter = new ListeAdapter(this, listeEquipe);
        lvliste1.setAdapter(listeAdapter);

    }












}