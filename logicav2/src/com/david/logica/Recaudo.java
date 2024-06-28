package com.david.logica;

public class Recaudo {
    int precioBronce=10000;
    int totaldePrecioBronce=0;
    int contadorBronce=0;
    int precioPlata=20000;
    int totalPrecioPlata=0;
    int contadorPlata=0;
    int precioOro=35000;
    int totalPrecioOro=0;
    int contadorOro=0;
    int instructorUno=0;
    int instructorDos=0;

    public void bronce(){
        totaldePrecioBronce=totaldePrecioBronce+precioBronce;
        contadorBronce++;
    }
    public void plata(){
        totalPrecioPlata=totalPrecioPlata+precioPlata;
        contadorPlata++;
    }
    public void oro(){
        totalPrecioOro=totalPrecioOro+precioOro;
        contadorOro++;
    }

    public int mostrarContadorBronce(){
        return contadorBronce;

    }
    public int mostarContadorPlata(){
        return contadorPlata;
    }
    public int mostrarContadorOro(){
        return contadorOro;
    }

    public int recaudo(){
        return totaldePrecioBronce+totalPrecioPlata+totalPrecioOro;
    }

    public void instructor(int id){
        if (id==1){
            instructorUno++;
        } else if (id==2) {
            instructorDos++;
        }
    }

    public String mejorInstructor(){
        if (instructorUno>instructorDos){
            return "Juan";
        }else {
            return "Marcos";
        }
    }

}
