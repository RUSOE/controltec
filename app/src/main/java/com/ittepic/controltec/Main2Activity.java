package com.ittepic.controltec;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.ittepic.controltec.adapters.ClickItemListener;
import com.ittepic.controltec.adapters.Super_RecyclerAdapter;
import com.ittepic.controltec.utilidades.ActualizarPracticas;

public class Main2Activity extends AppCompatActivity {

    ActualizarPracticas mList;

    RecyclerView mVistaLista;
    LinearLayoutManager mManager;

    Context mContext = Main2Activity.this;

    public static final String TAG = Main2Activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initViews();
        //Se crean las practicas
        mList = new ActualizarPracticas(getString(R.string.STRING_TYPE_NEUMATICABASICA));
        //Debug para comprobar en la consola que se han creado las practicas
        for (int i = 0; i<= mList.getSize()-1; i++) { Log.d(Main2Activity.class.getSimpleName(), mList.getPracticas().get(i).mTitulo); }

        mVistaLista.setAdapter(new Super_RecyclerAdapter(mContext, mList.getPracticas(), new ClickItemListener() {
            @Override
            public void ImageViewOnClick(View v, int position, String tipo) {
                Log.d(TAG, "Imagen tocada de la posicion :  "+position);
                Intent i =  new Intent(Main2Activity.this,Main3Activity.class);
                /*
                i.putExtra("ID",position);
                i.putExtra("TIPO",tipo);
                */
                startActivity(i);
            }
        }));
    }

    private void initViews()
    {
        //Se inician las vistas de esta activity aqui para solo manejar el control en las funciones principales
        mVistaLista = (RecyclerView) findViewById(R.id.recyclerView_practicas);
        mManager = new LinearLayoutManager(Main2Activity.this);
        mVistaLista.setLayoutManager(mManager);
    }
}
