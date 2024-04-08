package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ImageView titulo;
    private TextView mensaje;
    private TextView puntos1;
    private TextView contador1;
    private TextView puntos2;
    private TextView contador2;
    private int contadorJugador1 = 0;
    private int contadorJugador2 = 0;

    private ImageButton opcion1;
    private ImageButton opcion2;
    private ImageButton opcion3;
    private ImageButton opcion4;
    private ImageButton opcion5;
    private ImageButton opcion6;
    private ImageButton opcion7;
    private ImageButton opcion8;
    private ImageButton opcion9;

    boolean turnoJugadorUno = true;

    int opciones[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = findViewById(R.id.titulo);
        mensaje = findViewById(R.id.mensaje);
        puntos1 = findViewById(R.id.puntos1);
        puntos2 = findViewById(R.id.puntos2);
        contador1 = findViewById(R.id.contador1);
        contador2 = findViewById(R.id.contador2);

        opcion1 = findViewById(R.id.imagen1);
        opcion2 = findViewById(R.id.imagen2);
        opcion3 = findViewById(R.id.imagen3);
        opcion4 = findViewById(R.id.imagen4);
        opcion5 = findViewById(R.id.imagen5);
        opcion6 = findViewById(R.id.imagen6);
        opcion7 = findViewById(R.id.imagen7);
        opcion8 = findViewById(R.id.imagen8);
        opcion9 = findViewById(R.id.imagen9);

        opciones = new int[9];


        opcion1.setOnClickListener(v -> {

            if (opciones[0] == 0) {


                if (turnoJugadorUno) {
                    opcion1.setImageResource(R.drawable.x);
                    opciones[0] = 1;

                } else {
                    opcion1.setImageResource(R.drawable.o);
                    opciones[0] = 2;
                }
                turnoJugadorUno = !turnoJugadorUno;
                check();
            } else {
                Toast.makeText(getApplicationContext(), "Espacio ocupado", Toast.LENGTH_SHORT).show();
            }
        });

        opcion2.setOnClickListener(v -> {

            if (opciones[1] == 0) {
                if (turnoJugadorUno) {
                    opcion2.setImageResource(R.drawable.x);
                    opciones[1] = 1;
                } else {
                    opcion2.setImageResource(R.drawable.o);
                    opciones[1] = 2;
                }


                turnoJugadorUno = !turnoJugadorUno;
                check();
            }
        });

        opcion3.setOnClickListener(v -> {

            if (opciones[2] == 0) {
                if (turnoJugadorUno) {
                    opcion3.setImageResource(R.drawable.x);
                    opciones[2] = 1;
                } else {
                    opcion3.setImageResource(R.drawable.o);
                    opciones[2] = 2;
                }


                turnoJugadorUno = !turnoJugadorUno;
                check();
            }
        });

        opcion4.setOnClickListener(v -> {

            if (opciones[3] == 0) {
                if (turnoJugadorUno) {
                    opcion4.setImageResource(R.drawable.x);
                    opciones[3] = 1;
                } else {
                    opcion4.setImageResource(R.drawable.o);
                    opciones[3] = 2;
                }


                turnoJugadorUno = !turnoJugadorUno;
                check();
            }
        });

        opcion5.setOnClickListener(v -> {

            if (opciones[4] == 0) {
                if (turnoJugadorUno) {
                    opcion5.setImageResource(R.drawable.x);
                    opciones[4] = 1;
                } else {
                    opcion5.setImageResource(R.drawable.o);
                    opciones[4] = 2;
                }


                turnoJugadorUno = !turnoJugadorUno;
                check();
            }
        });

        opcion6.setOnClickListener(v -> {
            if (opciones[5] == 0) {
                if (turnoJugadorUno) {
                    opcion6.setImageResource(R.drawable.x);
                    opciones[5] = 1;
                } else {
                    opcion6.setImageResource(R.drawable.o);
                    opciones[5] = 2;
                }


                turnoJugadorUno = !turnoJugadorUno;
                check();
            }
        });

        opcion7.setOnClickListener(v -> {
            if (opciones[6] == 0) {
                if (turnoJugadorUno) {
                    opcion7.setImageResource(R.drawable.x);
                    opciones[6] = 1;
                } else {
                    opcion7.setImageResource(R.drawable.o);
                    opciones[6] = 2;
                }


                turnoJugadorUno = !turnoJugadorUno;
                check();
            }
        });

        opcion8.setOnClickListener(v -> {
            if (opciones[7] == 0) {
                if (turnoJugadorUno) {
                    opcion8.setImageResource(R.drawable.x);
                    opciones[7] = 1;
                } else {
                    opcion8.setImageResource(R.drawable.o);
                    opciones[7] = 2;
                }


                turnoJugadorUno = !turnoJugadorUno;
                check();
            }
        });

        opcion9.setOnClickListener(v -> {
            if (opciones[8] == 0) {
                if (turnoJugadorUno) {
                    opcion9.setImageResource(R.drawable.x);
                    opciones[8] = 1;
                } else {
                    opcion9.setImageResource(R.drawable.o);
                    opciones[8] = 2;
                }


                turnoJugadorUno = !turnoJugadorUno;
                check();
            }
        });

    }

    public void check() {


        if ((opciones[0] == 1 && opciones[1] == 1 && opciones[2] == 1)
                || (opciones[3] == 1 && opciones[4] == 1 && opciones[5] == 1)
                || (opciones[6] == 1 && opciones[7] == 1 && opciones[8] == 1)
                || (opciones[0] == 1 && opciones[3] == 1 && opciones[6] == 1)
                || (opciones[1] == 1 && opciones[4] == 1 && opciones[7] == 1)
                || (opciones[2] == 1 && opciones[5] == 1 && opciones[8] == 1)
                || (opciones[2] == 1 && opciones[4] == 1 && opciones[6] == 1)
                || (opciones[0] == 1 && opciones[4] == 1 && opciones[8] == 1)) {
            mensaje.setText("Gana el jugador 1");
            contadorJugador1++;
            contador1.setText(String.valueOf(contadorJugador1));
            reset();
        } else if ((opciones[0] == 2 && opciones[1] == 2 && opciones[2] == 2)
                || (opciones[3] == 2 && opciones[4] == 2 && opciones[5] == 2)
                || (opciones[6] == 2 && opciones[7] == 2 && opciones[8] == 2)
                || (opciones[0] == 2 && opciones[3] == 2 && opciones[6] == 2)
                || (opciones[1] == 2 && opciones[4] == 2 && opciones[7] == 2)
                || (opciones[2] == 2 && opciones[5] == 2 && opciones[8] == 2)
                || (opciones[2] == 2 && opciones[4] == 2 && opciones[6] == 2)
                || (opciones[0] == 2 && opciones[4] == 2 && opciones[8] == 2)) {
            mensaje.setText("Gana el jugador 2");
            contadorJugador2++;
            contador2.setText(String.valueOf(contadorJugador2));
            reset();


        } else {
            boolean todosOcupados = true;
            for (int i = 0; i < opciones.length; i++) {
                if (opciones[i] == 0) {
                    todosOcupados = false;
                    break;
                }
            }
            if (todosOcupados) {
                mensaje.setText("Empate");
                reset();
            }


        }
    }

    public void reset() {
        opcion1.setImageResource(R.drawable.empty);
        opcion2.setImageResource(R.drawable.empty);
        opcion3.setImageResource(R.drawable.empty);
        opcion4.setImageResource(R.drawable.empty);
        opcion5.setImageResource(R.drawable.empty);
        opcion6.setImageResource(R.drawable.empty);
        opcion7.setImageResource(R.drawable.empty);
        opcion8.setImageResource(R.drawable.empty);
        opcion9.setImageResource(R.drawable.empty);
        Arrays.fill(opciones, 0);
        turnoJugadorUno = true;

    }
}