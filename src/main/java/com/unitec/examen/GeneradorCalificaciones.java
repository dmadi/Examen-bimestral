/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unitec.examen;

import static com.sun.org.apache.xpath.internal.XPathAPI.eval;
import static com.sun.org.apache.xpath.internal.XPathAPI.eval;
import static com.sun.org.apache.xpath.internal.XPathAPI.eval;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.Global.eval;

/**
 *
 * @author T107
 */
public class GeneradorCalificaciones {
    public static ArrayList<Evaluacion> generarcalificaciones(){
      
ArrayList<Evaluacion> eval = ArrayList<Evaluacion>();
Evaluacion a1= new Evaluacion("petra",'5.8');
Evaluacion a2= new Evaluacion("Jose",'7.4');
Evaluacion a3= new Evaluacion("Roberta",'8.6');

eval.add(a1);
eval.add(a2);
eval.add(32);

return eval;
    }


}
