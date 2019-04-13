package com.example.ricardo.sistemasalrio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SalarioActivity extends AppCompatActivity {
    private TextView salario;
    private RadioButton radiobtn1;
    private RadioButton radiobtn2; ;
    private RadioButton radiobtn3;;
    private Button CalculaSalario;
    private double aumentoSalario;
    double sa;
    private double SalarioAcrescentado;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salario);
        editNome(salario) = findViewById(R.id.digsalario);
        radiobtn1 = findViewById(R.id.radioButton40%);
        radiobtn2 = findViewById(R.id.radioButton45%);
        radiobtn3 = findViewById(R.id.radioButton50%);
        View calculoTotal = findViewById(R.id.buttonCalcular);
        calculoTotal.setOnClickListener(new View.OnClickListener());
        if (radiobtn1.isChecked()) {
            SalarioAcrescentado = sa * (40 / 100);
            r.putExtra("total", "Novo salário: " + (SalarioAcrescentado + salario));
        } else {
            if (radiobtn2.isChecked()) {
                SalarioAcrescentado = sa * (45 / 100);
                r.putExtra("total", "Novo salário: " + (SalarioAcrescentado  + salario));

            } else {
                if (radiobtn3.isChecked()) {
                    SalarioAcrescentado = sa * (50 / 100);
                    o.putExtra("total", "Novo salário: " + (SalarioAcrescentado + salario);

                }
                startActivity(r);

            }

        }
    }
}