package com.example.ppe4.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.ppe4.R;

public class Materiel extends AppCompatActivity {

    private ImageButton boutonRetour;
    private Button boutonConfirmer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materiel);
        init();
    }

    private void cliquerBouton(final ImageButton boutonClick, final Class classe) {

        boutonClick.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(Materiel.this, classe);  //Lancer l'activité DisplayVue
                startActivity(intent);    //Afficher la vue
                finish();
            }
        });
    }


    private void init(){
        boutonRetour = (ImageButton) findViewById(R.id.boutonRetour);
        boutonConfirmer = (Button) findViewById(R.id.boutonConfirmer);


        cliquerBouton(boutonRetour, Menu.class);
        //cliquerBouton(boutonConfirmer, Confirmation.class);

    }
}