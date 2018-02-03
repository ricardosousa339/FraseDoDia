package adivinha.ccomp.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoFraseDoDia;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Nada lhe posso dar que já não exista em você mesmo. Não posso abrir-lhe outro mundo de imagens, além daquele que há em sua própria alma. Nada lhe posso dar a não ser a oportunidade, o impulso, a chave. Eu o ajudarei a tornar visível o seu próprio mundo, e isso é tudo." ,
            "Se você odeia alguém, é porque odeia alguma coisa nele que faz parte de você. O que não faz parte de nós não nos perturba." ,
            "O homem culto é apenas mais culto; nem sempre é mais inteligente que o homem simples." ,
            "A paz não é um estado primitivo paradisíaco, nem uma forma de convivência regulada pelo acordo. A paz é algo que não conhecemos, que apenas buscamos e imaginamos. A paz é um ideal." ,
            "A sabedoria não pode ser transmitida. A sabedoria que um sábio tenta transmitir soa mais como loucura." ,
            "Entre os seres humanos, mesmo se intimamente unidos, permanece sempre aberto um abismo que apenas o amor pode superar, e mesmo assim somente como uma passagem de emergência." ,
            "Sem amor por si mesmo, o amor pelos outros também não é possível. O ódio por si mesmo é exatamente idêntico ao flagrante egoísmo e, no final, conduz ao mesmo isolamento cruel e ao mesmo desespero." ,
            "Sem amor por si mesmo, o amor pelos outros também não é possível. O ódio por si mesmo é exatamente idêntico ao flagrante egoísmo e, no final, conduz ao mesmo isolamento cruel e ao mesmo desespero." ,
            "Quando se quer algo verdadeiramente e com suficiente força, acaba-se por consegui-lo sempre"
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoFraseDoDia = (TextView) findViewById(R.id.textoFrase);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFrase);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rndm = new Random();

                int nmr = rndm.nextInt(frases.length);

                textoFraseDoDia.setText(frases[nmr]);

            }
        });



    }
}
