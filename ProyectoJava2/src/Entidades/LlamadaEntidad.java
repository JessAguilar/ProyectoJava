/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class LlamadaEntidad {
    int IDPersonaSalida;
    int IDPersonaLlegada;
    Date inicioLlamada=new Date();
    Date finLlamada=new Date();
    String tipoLlamada;
    Double costoTotal;
    
    public LlamadaEntidad(int IDPersonaSalida,int IDPersonaLlegada,Date inicioLlamada,Date finLlamada,String tipoLlamada,Double costoTotal){
    this.IDPersonaLlegada=IDPersonaLlegada;
    }
}
