package br.com.fiap.app_img;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Animation animation;
    private ImageView imgView;
    //Array com as imagems
    private int[] imgs = {R.drawable.up,
                          R.drawable.dow,
                          R.drawable.right,
                          R.drawable.leaft,
                          R.drawable.github,
                          R.drawable.x};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (ImageView) findViewById(R.id.imgMainView);//Mapea a view
        animation = AnimationUtils.loadAnimation(this,R.anim.fade);//Mapea a animação
    }//OnCreate

    public void rolar(View v){
        //Inicializando as Variaves e animaçoes
        int contImg = 0;
        imgView.startAnimation(animation);
        //Função para Rodar int Aleatorias
        Random r = new Random();

        //Sortea o numero aleatoria e joga a posição na variavel para cetar em baixo
        contImg = r.nextInt(6);
        imgView.setImageResource(imgs[contImg]);
    }//Rolar
}//Class