package com.bts_sio.comixology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class DescMembActivity extends AppCompatActivity {
    Context context;
    TextView tvMemDesc;
    ImageView imgMemDesc;
    ArrayList<Membre> listeMembre;
    ListView lvlisteMembre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_memb);
        tvMemDesc = (TextView) findViewById(R.id.tvMembreDesc);
        imgMemDesc = (ImageView) findViewById(R.id.img1);


        Intent intent = getIntent();
        int idM = intent.getIntExtra("idM", 0);
        String imgM = intent.getStringExtra("imgM");
        AssetManager manager= this.getAssets();
        InputStream open = null;
        
        try {
            open = manager.open(imgM);
            Bitmap bitmap = BitmapFactory.decodeStream(open);
            imgMemDesc.setImageBitmap(bitmap);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        if (idM == 1)
        {

            tvMemDesc.setText("Steven « Steve » Rogers, alias Captain America est un super-héros évoluant dans l'univers Marvel de la maison d'édition Marvel Comics. Créé par le scénariste Joe Simon et le dessinateur Jack Kirby, le personnage de fiction apparaît pour la première fois dans le comic book Captain America Comics #1, paru en décembre 1940n 3 mais avec la date de mars 1941 inscrite sur la couverture2.\n" +
                    "\n" +
                    "Conçu à l'origine comme une figure patriotique américaine en réaction au régime nazi, le personnage devient actif avant même l'entrée en guerre officielle des États-Unis dans la Seconde Guerre mondiale, en décembre 1941. Dès le début de sa publication, il est perçu comme le porte-drapeau des valeurs démocratiques de son pays et comme un défenseur du monde libre contre les totalitarismes, notamment le Troisième Reich3.\n" +
                    "\n" +
                    "Doté d'une condition physique au summum du potentiel humain, Captain America est un combattant hors pair, un chef-né et un stratège militaire accompli. Il porte un costume reconnaissable entre tous, inspiré du drapeau américain et est équipé d'un bouclier quasi indestructible, composé d'un alliage d'acier et du fictif vibranium, qu'il utilise comme une protection ainsi que comme une arme.\n" +
                    "\n" +
                    "Depuis les années 1960, Captain America fait partie de l'équipe de super-héros les Vengeurs (Avengers, et ses diverses versions) dont il est devenu au fil des ans l’un des piliers.\n" +
                    "\n" +
                    "En 2011, Captain America est classé par le site de référence IGN en sixième position du « Top 100 Comic Book Heroes of All Time »4, en 2012 second dans leur classement du « Top 50 Avengers »5 et en 2014 second dans leur classement du « Top 25 best Marvel superheroes »6.\n" +
                    "\n" +
                    "Dans l'univers cinématographique Marvel, le personnage de Captain America est interprété par l'acteur Chris Evans à partir du film Captain America : First Avenger (2011) jusqu'à Avengers : Endgame (2019), à la fin duquel il charge le Faucon (interprété par Anthony Mackie) de poursuivre son œuvre, ce dernier se glissant dans ce rôle au terme de la série Falcon et le Soldat de l'Hiver (2021).");
        }
        if (idM == 2){
            tvMemDesc.setText("Janet Van Dyne, alias la Guêpe (The « Wasp » en version originale) est une super-héroïne évoluant dans l'univers Marvel de la maison d'édition Marvel Comics. Créé par le scénariste Stan Lee et le dessinateur Jack Kirby, le personnage de fiction apparaît pour la première fois dans le comic book Tales to Astonish #44 en juin 1963.\n" +
                    "\n" +
                    "La Guêpe fait partie des membres fondateurs de l'équipe des Vengeurs ; c'est d'ailleurs elle qui a trouvé le nom de l'équipe.,Janet Van Dyne est la fille du professeur Van Dyne, un scientifique venu rendre visite au docteur Hank Pym ; ce dernier tombe amoureux de la jeune femme, lui rappelant sa défunte femme assassinée par les services secrets soviétiques. Le père de Janet est par la suite tué par un extra-terrestre criminel. Pym se résout à lui donner des super-pouvoirs, Janet prenant ensuite comme nom de code la Guêpe.\n" +
                    "\n" +
                    "Elle participe à la création du groupe de super-héros les Vengeurs en tant que membre fondateur. C'est elle qui est à l'origine du nom de l'équipe.\n" +
                    "\n" +
                    "Sa relation avec Hank Pym connaîtra de multiples remous.\n" +
                    "\n" +
                    "Elle a fait partie de la nouvelle équipe des Mighty Avengers menée par Iron Man. Elle est maintenant membre des Uncanny Avengers, une équipe composée de membres classiques des X-Men et des Vengeurs." +
                    "La Guêpe a reçu un traitement à base de « particules Pym », ce qui lui donne la faculté de diminuer sa taille à volonté, jusqu'à une taille minimum de 2 cm.\n" +
                    "\n" +
                    "Sous sa forme de Guêpe, elle conserve sa force et sa résistance normale et possède des ailes lui permettant de voler à 60 km/h, résultat d'une manipulation de son ADN par Pym.\n" +
                    "Elle peut communiquer télépathiquement avec les insectes.\n" +
                    "Elle peut aussi stocker son énergie bio-électrique et la relâcher sous la forme de rafales, appelés « dards de guêpe ». ");
        }
    }

}