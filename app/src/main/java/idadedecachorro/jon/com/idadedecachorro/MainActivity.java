package idadedecachorro.jon.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.msgEResultadoId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar o que a pessoa digitou
                String textoDigitado = caixaTexto.getText().toString();

                if(textoDigitado.isEmpty()){
                    //Se a pessoa nao digitou nada
                    resultadoIdade.setText("Voce nao digitou nenhum valor!");
                }else{
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    //mostrar na tela
                    resultadoIdade.setText("A idade do cachorro em anos humanos e: " + resultadoFinal + " anos");
                }

            }
        });

    }
}
