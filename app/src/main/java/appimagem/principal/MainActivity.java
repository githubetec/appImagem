package appimagem.principal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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
        btnAnima=findViewById(R.id.btnAnima);
    }
    public void TrocarImg(View view) {
        if(imgview.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.escola1).getConstantState()) {
            imgview.setImageResource(R.drawable.escola2);
        }
        else {
            imgview.setImageResource(R.drawable.escola1);
        }
    }

    public void Animacao(View view) {
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
        btnAnima.setText("Animação");
        Toast.makeText(this, "Imagem Centralizada", Toast.LENGTH_SHORT).show();
    }
}