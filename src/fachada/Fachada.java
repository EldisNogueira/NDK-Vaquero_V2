/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import business.VaqueiroBusiness;
import java.util.ArrayList;
import model.Vaqueiros;

/**
 *
 * @author eldis
 */
public class Fachada {
    
    private static VaqueiroBusiness vaqueiroBusiness;
    
    private static Fachada fachada;
    
    public static Fachada getInstance() {
        if (fachada == null) {
            fachada = new Fachada();
        }
        return fachada;
    }
    
    private Fachada() {
        vaqueiroBusiness = new VaqueiroBusiness();
    }
    
    public Vaqueiros cadastrarVaqueiros(Vaqueiros a){
        return vaqueiroBusiness.cadastrar(a);
    }
    
    public Vaqueiros getByIdVaqueiro(int id){
        return vaqueiroBusiness.getById(id);
    }
    
     public ArrayList<Vaqueiros> getAllVaqueiros(){
        return vaqueiroBusiness.getall();
    }
}
