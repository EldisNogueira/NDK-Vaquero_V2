/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;
import dao.VaqueiroDao;
import model.Vaqueiros;
import fachada.Fachada;
/**
 *
 * @author eldis
 */
public class VaqueiroBusiness {
    
    private VaqueiroDao dao;
    
    public VaqueiroBusiness() {
        this.dao = new VaqueiroDao();
    }
    
    public Vaqueiros cadastrar(Vaqueiros vaqueiros) {
//        if(Util.validarId(Util.prepararId(vaqueiros.getId()))){
            //Fachada.getInstance().cadastrarEndereco(vaqueiros.getEndereco());
//            Vaqueiros a = dao.cadastrar(vaqueiros);
//            return a;
//        }
//        vaqueiros.setId();
        return dao.cadastrar(vaqueiros);
    }
    
    public Vaqueiros getById(int id) {
        return dao.getVaqueirosById(id);
    }

    public Vaqueiros getByNome(String nome) {
        return dao.getVaqueiroByNome(nome);
    }

    public ArrayList<Vaqueiros> getall() {
        return dao.getAll();
    }
}
