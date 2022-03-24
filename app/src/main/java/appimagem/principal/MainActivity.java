package appimagem.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imgview; //fixar layot_width e layout_height
    Button btnAnima;
    String imgrotatacao = "D";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgview=findViewById(R.id.imgview);
        btnAnima=findViewById(R.id.btnRotacao);
    }
    public void TrocarImg(View view) {
        if(imgview.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.escola1).getConstantState()) {
            imgview.setImageResource(R.drawable.escola2);
        }
        else {
            imgview.setImageResource(R.drawable.escola1);
        }
    }

    public void Rotacao(View view) {
        if(imgrotatacao.equals("D")) {
            imgview.setRotationY(15);
            imgrotatacao="E";
            btnAnima.setText("Direita");
            Toast.makeText(this, "Imagem Rotacionada à Direita", Toast.LENGTH_SHORT).show();
        }
        else {
            imgview.setRotationY(-15);
            imgrotatacao="D";
            btnAnima.setText("Esqueda");
            Toast.makeText(this, "Imagem Rotacionada à Esquerda", Toast.LENGTH_SHORT).show();
        }
    }
    public void Centralizar(View view)  {
        imgview.setRotationY(0);
        imgview.setRotation(0);
        imgview.animate().alpha(1.0f).start();
        imgview.animate().setDuration(500);
        btnAnima.setText("Animação");
        Toast.makeText(this, "Imagem Centralizada", Toast.LENGTH_SHORT).show();
    }
    public void AnimacaoP360(View view) {
        imgview.animate().rotation(360).start();
    }

    public void AnimacaoN360(View view) {
        imgview.animate().rotation(-360).start();
        imgview.animate().setDuration(2000);
        imgview.animate().alpha(0.2f).start();
    }
}