package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    Float numero1 = 0.0f;
    Float numero2 = 0.0f;
    String signo = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);

    }

    public void cero(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("0");
        }else{
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }

    public void uno(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }

    public void dos(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("2");
        }else{
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void tres(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("3");
        }else{
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    public void cuatro(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("4");
        }else{
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void cinco(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("5");
        }else{
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void seis(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("6");
        }else{
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void siete(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("7");
        }else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void ocho(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("8");
        }else{
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }


    public void nueve(View view){
        if(tvResultado.getText().toString().equals("0")){
            tvResultado.setText("9");
        }else{
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }


    public void suma(View view) {
        signo = "+";
        gNumero1(view);
    }

    public void resta(View view) {
        signo = "-";
        gNumero1(view);
    }

    public void multiplicacion(View view) {
        signo = "*";
        gNumero1(view);
    }

    public void division(View view) {
        signo = "/";
        gNumero1(view);
    }


    public void gNumero1 (View view){
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
    }

    public void borrar(View view) {
        tvResultado.setText("0");
        numero1 = 0.0f;
        numero1 = 0.0f;
        signo = "";
    }

    public void igual (View view){
        Float result = 0.0f;
        numero2 = Float.parseFloat(tvResultado.getText().toString());

        if (signo == "+"){
            result = numero1+numero2;
            String resultadostring = String.valueOf(result);
            tvResultado.setText(resultadostring);

        }
        if (signo == "-"){
            result = numero1-numero2;
            String resultadostring = String.valueOf(result);
            tvResultado.setText(resultadostring);
        }
        if (signo == "*"){
            result = numero1*numero2;
            String resultadostring = String.valueOf(result);
            tvResultado.setText(resultadostring);
        }
        if (signo == "/"){
            result = numero1/numero2;
            String resultadostring = String.valueOf(result);
            tvResultado.setText(resultadostring);
        }

    }

}