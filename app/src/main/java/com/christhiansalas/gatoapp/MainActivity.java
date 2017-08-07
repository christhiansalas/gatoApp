package com.christhiansalas.gatoapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_reset;

    int turno = 1;

    RadioButton rb_1, rb_2;

    RadioGroup rg;

    TextView tv_2, tv_3;

    Random random;

    boolean fin_juego = false;

    int jugador_1 = 0, jugador_2 = 0;

    //turno = 1 entonces TIRAN LAS X // turno = 2 entonces tiran los circulos+

    int[][] gato = new int [3][3];
    // gato = 0 Vacio
    // gato = 1 X
    // gato = 2 y

    AlertDialog.Builder alertBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);

        btn_reset = (Button) findViewById(R.id.btn_reset);


        rg = (RadioGroup) findViewById(R.id.rg);
        rb_1 = (RadioButton) findViewById(R.id.rb_1);
        rb_2 = (RadioButton) findViewById(R.id.rb_2);

        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_3 = (TextView) findViewById(R.id.tv_3);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);

        rg.setOnClickListener(this);
        rb_1.setOnClickListener(this);
        rb_2.setOnClickListener(this);


        alertBuilder = new AlertDialog.Builder(this);


        for(int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                gato[i][j]=0;

        random = new Random();

        for (int x=0; x < 20; x++)
        Log.i("Random ", ""+random.nextInt(10));


    }

    @Override
    public void onClick(View v) {

        // BUTONES INACTIVOS
        rb_1.setEnabled(false);
        rb_2.setEnabled(false);
            switch (v.getId()) {

                case R.id.btn_1:
                    if (gato[0][0] == 0) {
                        if (turno == 1) {
                            btn_1.setText("X");
                            turno = 2;
                            gato[0][0] = 1;
                            checarGanador(1);



                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        } else {
                            btn_1.setText("0");
                            turno = 1;
                            gato[0][0] = 2;
                            checarGanador(2);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Lugar ya jugado", Toast.LENGTH_LONG).show();
                    }
                    break;

                case R.id.btn_2:
                    if (gato[0][1] == 0) {
                        if (turno == 1) {
                            btn_2.setText("X");
                            turno = 2;
                            gato[0][1] = 1;
                            checarGanador(1);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        } else {
                            btn_2.setText("0");
                            turno = 1;
                            gato[0][1] = 2;
                            checarGanador(2);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Lugar ya jugado", Toast.LENGTH_LONG).show();
                    }
                    break;

                case R.id.btn_3:
                    if (gato[0][2] == 0) {
                        if (turno == 1) {
                            btn_3.setText("X");
                            turno = 2;
                            gato[0][2] = 1;
                            checarGanador(1);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        } else {
                            btn_3.setText("0");
                            turno = 1;
                            gato[0][2] = 2;
                            checarGanador(2);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Lugar ya jugado", Toast.LENGTH_LONG).show();
                    }
                    break;

                case R.id.btn_4:
                    if (gato[1][0] == 0) {
                        if (turno == 1) {
                            btn_4.setText("X");
                            turno = 2;
                            gato[1][0] = 1;
                            checarGanador(1);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        } else {
                            btn_4.setText("0");
                            turno = 1;
                            gato[1][0] = 2;
                            checarGanador(2);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Lugar ya jugado", Toast.LENGTH_LONG).show();
                    }

                    break;

                case R.id.btn_5:
                    if (gato[1][1] == 0) {
                        if (turno == 1) {
                            btn_5.setText("X");
                            turno = 2;
                            gato[1][1] = 1;
                            checarGanador(1);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        } else {
                            btn_5.setText("0");
                            turno = 1;
                            gato[1][1] = 2;
                            checarGanador(2);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Lugar ya jugado", Toast.LENGTH_LONG).show();
                    }
                    break;

                case R.id.btn_6:
                    if (gato[1][2] == 0) {
                        if (turno == 1) {
                            btn_6.setText("X");
                            turno = 2;
                            gato[1][2] = 1;
                            checarGanador(1);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        } else {
                            btn_6.setText("0");
                            turno = 1;
                            gato[1][2] = 2;
                            checarGanador(2);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Lugar ya jugado", Toast.LENGTH_LONG).show();
                    }
                    break;

                case R.id.btn_7:
                    if (gato[2][0] == 0) {
                        if (turno == 1) {
                            btn_7.setText("X");
                            turno = 2;
                            gato[2][0] = 1;
                            checarGanador(1);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        } else {
                            btn_7.setText("0");
                            turno = 1;
                            gato[2][0] = 2;
                            checarGanador(2);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Lugar ya jugado", Toast.LENGTH_LONG).show();
                    }
                    break;

                case R.id.btn_8:
                    if (gato[2][1] == 0) {
                        if (turno == 1) {
                            btn_8.setText("X");
                            turno = 2;
                            gato[2][1] = 1;
                            checarGanador(1);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        } else {
                            btn_8.setText("0");
                            turno = 1;
                            gato[2][1] = 2;
                            checarGanador(2);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Lugar ya jugado", Toast.LENGTH_LONG).show();
                    }
                    break;

                case R.id.btn_9:
                    if (gato[2][2] == 0) {
                        if (turno == 1) {
                            btn_9.setText("X");
                            turno = 2;
                            gato[2][2] = 1;
                            checarGanador(1);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        } else {
                            btn_9.setText("0");
                            turno = 1;
                            gato[2][2] = 2;
                            checarGanador(2);

                            if (rb_2.isChecked()) {
                                if (!fin_juego)
                                    jugarMaquina();
                            }
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Lugar ya jugado", Toast.LENGTH_LONG).show();
                    }
                    break;
            }

            btn_reset.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    alertBuilder
                            .setMessage("\n¿Quiéres reiniciar el juego?")
                            .setPositiveButton("Si ", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                    for (int i = 0; i < 3; i++)
                                        for (int j = 0; j < 3; j++)
                                            gato[i][j] = 0;

                                    btn_1.setText("");
                                    btn_2.setText("");
                                    btn_3.setText("");
                                    btn_4.setText("");
                                    btn_5.setText("");
                                    btn_6.setText("");
                                    btn_7.setText("");
                                    btn_8.setText("");
                                    btn_9.setText("");

                                    fin_juego = false;

                                    rb_1.setEnabled(true);
                                    rb_2.setEnabled(true);

                                    tv_2.setText("1 Jugador: ");
                                    tv_3.setText("2 Jugador: ");


                                }
                            })
                            .setNegativeButton("No ", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {


                                }
                            }).show();
                }
            }));
    }

    public void checarGanador(int turno)

    {
        Log.i("Gato ", ""+gato[0][0]+ "-"+gato[0][1]+"-"+gato[0][2]);
        Log.i("Gato ", ""+gato[1][0]+ "-"+gato[1][1]+"-"+gato[1][2]);
        Log.i("Gato ", ""+gato[2][0]+ "-"+gato[2][1]+"-"+gato[2][2]);
        Log.i("Gato ", "------------------------------------------");


        if((gato[0][0] == turno && gato[0][1] == turno && gato[0][2]== turno) ||
                (gato[1][0] == turno && gato[1][1] == turno && gato[1][2] == turno) ||
                (gato[2][0] == turno && gato[2][1] == turno && gato[2][2] == turno) ||
                (gato[0][0] == turno && gato[1][0] == turno && gato[2][0] == turno) ||
                (gato[0][1] == turno && gato[1][1] == turno && gato[2][1] == turno) ||
                (gato[0][2] == turno && gato[1][2] == turno && gato[2][2] == turno) ||
                (gato[0][0] == turno && gato[1][1] == turno && gato[2][2] == turno) ||
                (gato[2][0] == turno && gato[1][1] == turno && gato[0][2] == turno))
        {
            fin_juego = true;


            // GANADOR EN BASE A TURNO
            String ganador = (turno == 1) ? "X" : "O";

            // CONTADOR DE GANADOR
            if (turno == 1)
                jugador_1++;
            else
                jugador_2++;
            tv_2.setText("1 Jugador: " +jugador_1);
            tv_3.setText("2 Jugador: " +jugador_2);

            alertBuilder
                    .setTitle("Termino el juego")
                    .setMessage("Ganador "+ ganador + "\n¿Quiéres volver a jugar?")
                    .setIcon(R.mipmap.ic_launcher)
                    .setPositiveButton("Si ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            for(int i = 0; i < 3; i++)
                                for (int j = 0; j < 3; j++)
                                    gato[i][j]=0;

                            btn_1.setText("");
                            btn_2.setText("");
                            btn_3.setText("");
                            btn_4.setText("");
                            btn_5.setText("");
                            btn_6.setText("");
                            btn_7.setText("");
                            btn_8.setText("");
                            btn_9.setText("");

                            fin_juego = false;

                            rb_1.setEnabled(true);
                            rb_2.setEnabled(true);


                        }
                    })
                    .setNegativeButton("No ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();

                        }
                    }).show();
        }
        else {
            if (gato[0][0] != 0 && gato[0][1] != 0 &&
                    gato[0][2] != 0 && gato[1][0] != 0 &&
                    gato[1][1] != 0 && gato[1][2] != 0 &&
                    gato[2][0] != 0 && gato[2][1] != 0 &&
                    gato[2][2] != 0)
                alertBuilder
                        .setTitle("Termino el juego")
                        .setMessage("\nEmpate")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("Volver a jugar ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                for(int i = 0; i < 3; i++)
                                    for (int j = 0; j < 3; j++)
                                        gato[i][j]=0;

                                btn_1.setText("");
                                btn_2.setText("");
                                btn_3.setText("");
                                btn_4.setText("");
                                btn_5.setText("");
                                btn_6.setText("");
                                btn_7.setText("");
                                btn_8.setText("");
                                btn_9.setText("");

                                fin_juego = false;
                                rb_1.setEnabled(true);
                                rb_2.setEnabled(true);


                            }
                        })
                        .setNegativeButton("Salir ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                finish();

                            }
                        }).show();
        }


    }

    public void jugarMaquina()
    {

        if (!(gato[0][0] != 0 && gato[0][1] != 0 &&
                gato[0][2] != 0 && gato[1][0] != 0 &&
                gato[1][1] != 0 && gato[1][2] != 0 &&
                gato[2][0] != 0 && gato[2][1] != 0 &&
                gato[2][2] != 0))
        {
            int var_while;
            int var_x;
            int var_y;

            do {
                var_x = random.nextInt(3);
                var_y = random.nextInt(3);

                var_while = gato[var_x][var_y];

            } while (var_while != 0);

            if (var_x == 0 && var_y == 0)
            {
                if (turno == 1)
                {
                    btn_1.setText("X");
                    turno = 2;
                    gato[0][0] = 1;
                    checarGanador(1);
                }
                else
                {
                    btn_1.setText("0");
                    turno = 1;
                    gato[0][0] = 2;
                    checarGanador(2);
                }
            }

            if (var_x == 0 && var_y == 1)
            {
                {
                    if (turno == 1) {
                        btn_2.setText("X");
                        turno = 2;
                        gato[0][1] = 1;

                        checarGanador(1);

                    } else {
                        btn_2.setText("0");
                        turno = 1;
                        gato[0][1] = 2;
                        checarGanador(2);
                    }
                }
            }

            if (var_x == 0 && var_y == 2)
            {
                {
                    if (turno == 1) {
                        btn_3.setText("X");
                        turno = 2;
                        gato[0][2] = 1;

                        checarGanador(1);

                    } else {
                        btn_3.setText("0");
                        turno = 1;
                        gato[0][2] = 2;
                        checarGanador(2);
                    }
                }
            }

            if (var_x == 1 && var_y == 0)
            {
                {
                    if (turno == 1) {
                        btn_4.setText("X");
                        turno = 2;
                        gato[1][0] = 1;

                        checarGanador(1);

                    } else {
                        btn_4.setText("0");
                        turno = 1;
                        gato[1][0] = 2;
                        checarGanador(2);
                    }
                }
            }

            if (var_x == 1 && var_y == 1)
            {
                {
                    if (turno == 1) {
                        btn_5.setText("X");
                        turno = 2;
                        gato[1][1] = 1;

                        checarGanador(1);

                    } else {
                        btn_5.setText("0");
                        turno = 1;
                        gato[1][1] = 2;
                        checarGanador(2);
                    }
                }
            }

            if (var_x == 1 && var_y == 2)
            {
                {
                    if (turno == 1) {
                        btn_6.setText("X");
                        turno = 2;
                        gato[1][2] = 1;

                        checarGanador(1);

                    } else {
                        btn_6.setText("0");
                        turno = 1;
                        gato[1][2] = 2;
                        checarGanador(2);
                    }
                }
            }

            if (var_x == 2 && var_y == 0)
            {
                {
                    if (turno == 1) {
                        btn_7.setText("X");
                        turno = 2;
                        gato[2][0] = 1;

                        checarGanador(1);

                    } else {
                        btn_7.setText("0");
                        turno = 1;
                        gato[2][0] = 2;
                        checarGanador(2);
                    }
                }
            }

            if (var_x == 2 && var_y == 1)
            {
                {
                    if (turno == 1) {
                        btn_8.setText("X");
                        turno = 2;
                        gato[2][1] = 1;

                        checarGanador(1);

                    } else {
                        btn_8.setText("0");
                        turno = 1;
                        gato[2][1] = 2;
                        checarGanador(2);
                    }
                }
            }

            if (var_x == 2 && var_y == 2)
            {
                {
                    if (turno == 1) {
                        btn_9.setText("X");
                        turno = 2;
                        gato[2][2] = 1;

                        checarGanador(1);

                    } else {
                        btn_9.setText("0");
                        turno = 1;
                        gato[2][2] = 2;
                        checarGanador(2);
                    }
                }
            }
        }
    }




}
