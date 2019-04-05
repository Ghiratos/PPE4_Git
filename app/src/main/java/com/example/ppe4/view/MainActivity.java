package com.example.ppe4.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ppe4.R;


public class MainActivity extends AppCompatActivity {

    private EditText textLogin;
    private EditText textPassword;

    private void init(){
        textLogin = (EditText) findViewById(R.id.textLogin);
        textPassword = (EditText) findViewById(R.id.textPassword);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ButtonConnexion = (Button) findViewById(R.id.bouton1);   //Appel du "button1"



            ButtonConnexion.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
            {
                public void onClick(View actuelView)    //au clic sur le bouton
                {   init();
                    String login= textLogin.getText().toString();
                    String password = textPassword.getText().toString();
                    Log.d("Verification données", "données"+login+password);

                    if (login.equals("admin") && password.equals("admin")) {
                        Log.d("Passage connexion", "************************** La connexion a bien été effectuée");
                        Intent intent = new Intent(MainActivity.this, Menu.class);  //Lancer l'activité DisplayVue
                        startActivity(intent);    //Afficher la vue
                        finish();

                } else {
                        Toast.makeText(MainActivity.this, "Les données de connexion sont incorrectes", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}



