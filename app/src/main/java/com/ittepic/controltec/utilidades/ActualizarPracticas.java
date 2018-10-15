package com.ittepic.controltec.utilidades;

import android.content.Context;

import com.ittepic.controltec.R;

import java.util.ArrayList;

public class ActualizarPracticas {
    ArrayList<Practica> mPracticas = new ArrayList<Practica>();

    public ActualizarPracticas(ArrayList<Practica> listaPracticas)
    {
        //en caso de que se desee actualizar las practicas desde otra activity
        this.mPracticas = listaPracticas;
    }
    public ActualizarPracticas(String tipo)

    {
        switch (tipo){
            case "neumaticabasica":
                //Generacion dinamica de las practicas basicas por default
                this.mPracticas.add(new Practica("Practica 1","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",1));
                this.mPracticas.add(new Practica("Practica 2","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",2));
                this.mPracticas.add(new Practica("Practica 3","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",3));
                this.mPracticas.add(new Practica("Practica 4","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",4));
                this.mPracticas.add(new Practica("Practica 5","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",5));
                this.mPracticas.add(new Practica("Practica 6","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",6));
                this.mPracticas.add(new Practica("Practica 7","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",7));
                this.mPracticas.add(new Practica("Practica 8","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",8));
                this.mPracticas.add(new Practica("Practica 9","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",9));
                this.mPracticas.add(new Practica("Practica 10","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",10));
                this.mPracticas.add(new Practica("Practica 11","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",11));
                this.mPracticas.add(new Practica("Practica 12","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descricion","NEUMATICA BASICA",12));
                break;
            case "neumaticaavanzada":
                //Generacion dinamica de las practicas basicas por default
                this.mPracticas.add(new Practica("Practica 1","www","Descricion","NEUMATICA AVANZADA",1));
                this.mPracticas.add(new Practica("Practica 2","www","Descricion","NEUMATICA AVANZADA",2));
                this.mPracticas.add(new Practica("Practica 3","www","Descricion","NEUMATICA AVANZADA",3));
                this.mPracticas.add(new Practica("Practica 4","www","Descricion","NEUMATICA AVANZADA",4));
                this.mPracticas.add(new Practica("Practica 5","www","Descricion","NEUMATICA AVANZADA",5));
                this.mPracticas.add(new Practica("Practica 6","www","Descricion","NEUMATICA AVANZADA",6));
                this.mPracticas.add(new Practica("Practica 7","www","Descricion","NEUMATICA AVANZADA",7));
                this.mPracticas.add(new Practica("Practica 8","www","Descricion","NEUMATICA AVANZADA",8));
                break;

        }


    }



    public ArrayList<Practica> getPracticas() {
        return this.mPracticas;
    }
    public int getSize(){return this.mPracticas.size();}
    public Practica getPracticaById(int i) {return this.getPracticas().get(i);}
}
