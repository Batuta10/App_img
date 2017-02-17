package br.com.fiap.app_img;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgView;
    private int[] imgs = {R.drawable.up,
                          R.drawable.dow,
                          R.drawable.right,
                          R.drawable.leaft,
                          R.drawable.x,
                          R.drawable.github};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
        imgView = (ImageView) findViewById(R.id.imgMainView);
    }//OnCreate

    public void rolar(View v){
        int contImg = 0;
		Random r = new Random();//Função para Rodar int Aleatorias
		contImg = r.nextInt(5);
		imgView.setImageResource(imgs[contImg]);//Set Image na imgview 
    }//Rolar
}//Class