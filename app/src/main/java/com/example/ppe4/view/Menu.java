package com.example.ppe4.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.ppe4.R;

public class Menu extends AppCompatActivity {

    private ImageButton boutonEV;
    private ImageButton boutonMateriel;
    private ImageButton boutonVoierie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        init();
    }

    private void cliquerBouton(final ImageButton boutonClick, final Class classe) {

        boutonClick.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(Menu.this, classe);  //Lancer l'activité DisplayVue
                startActivity(intent);    //Afficher la vue
                finish();
            }
        });
    }


        private void init(){
         boutonEV = (ImageButton) findViewById(R.id.buttonEV);
         boutonMateriel = (ImageButton) findViewById(R.id.buttonMobilier);
         boutonVoierie = (ImageButton) findViewById(R.id.buttonVoirie);

         cliquerBouton(boutonEV, EspaceVert.class);
         cliquerBouton(boutonMateriel, Materiel.class);
         cliquerBouton(boutonVoierie, Voierie.class);

        }

    }

