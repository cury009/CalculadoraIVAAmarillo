package com.example.calculadoraivaamarillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_precio;
    TextView txt_resultado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_precio = (EditText) findViewById(R.id.edtPrecio);
        txt_resultado = (TextView) findViewById(R.id.txtResultado);
    }

    public void calcularIVA(View view) {
        double precio = 0.0;
        try
        {
            precio = Double.valueOf(String.valueOf(edt_precio.getText()));
        }
        catch (NumberFormatException e)
        {
            edt_precio.setError("formaot incorrecto");
        }

        double total_con_iva = precio *1.21;
        txt_resultado.setText(String.valueOf(total_con_iva));
    }
}