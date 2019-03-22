package com.example.ppe4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button boutonEV;
    private Button boutonMateriel;
    private Button boutonVoierie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        init();
    }

    private void cliquerBouton(final Button boutonClick, final Class classe) {

        boutonClick.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(Menu.this, classe);  //Lancer l'activité DisplayVue
                startActivity(intent);    //Afficher la vue
            }
        });
    }


        private void init(){
          boutonEV = (Button) findViewById(R.id.boutonEV);
          boutonMateriel = (Button) findViewById(R.id.boutonMateriel);
          boutonVoierie = (Button) findViewById(R.id.boutonVoierie);

          cliquerBouton(boutonEV, EspaceVert.class);
          cliquerBouton(boutonMateriel, Materiel.class);
          cliquerBouton(boutonVoierie, Voierie.class);

        }

    }

