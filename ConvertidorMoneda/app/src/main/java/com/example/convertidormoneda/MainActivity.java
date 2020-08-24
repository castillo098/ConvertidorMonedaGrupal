package com.example.convertidormoneda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public void convertir (View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
            String eurosString = editText.getText().toString();
            double euro=Double.parseDouble(eurosString);
            double dolares = euro*1.18;
            String dolaresString = String.format("%.2f",dolares);
            String mensaje = " euros " +eurosString+ " Son USD "+ dolaresString;
        Toast.makeText(this, mensaje,Toast.LENGTH_LONG).show();
    }
    EditText plainTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //plainTxt = (EditText)findViewById(R.id.editTextTextPersonName);
    }
    public boolean validar(){
        boolean retorno = true;
        String txtView = plainTxt.getText().toString();
        if(txtView.isEmpty()){
            plainTxt.setError("Ingresa un valor numerico");
            ;
            retorno = false;
        }
        return retorno;

    }
    public void Convertir (View v ) {
        if (validar()) {
        }
    }
}