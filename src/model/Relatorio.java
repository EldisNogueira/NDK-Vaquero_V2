/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import com.sun.istack.internal.logging.Logger;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author meupc
 */
public class Relatorio {
    
    
    
   /* 
    private HttpServletResponse response;
    private FacesContext context;
    private ByteArrayOutputStream baos;
    private InputStream stream;
    
    public Relatorio() {
        this.context = FacesContext.getCurrentInstance();
        this.response = (HttpServletResponse) context.getExternalContext().getResponse();
    }
    
    public void getRelatorio(List<Vaqueiros> lista) {
        stream = this.getClass().getResourseAsStream("/report/report.jasper");
        Map<String, Object> parama = new HashMap<String, Object>();
        baos = new ByteArrayOutputStream()
        try{
            
           JasperReport report = (JasperReport) JRLoader.loadObject(stream); 
           JasperPrint print = JasperFillManager.fillReport(report, params, new JRBeanCollectionDataSource(lista));
           JasperExportManager.exportReportToPdfStream(print, baos);
           
           response.reset();
           response.setContentType("application/pdf");
           response.setContentLength(baos.size());
           response.setHeader("Content-disposition", "inline; filename=relatorio.pdf");
           response.getOutputStream().writer(baos.toByteArray());
           response.getOutputStream().flush();
           response.getOutputStream().close();
           
           Context.responseComplete();
           
        } catch (JRException ex){
           Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        */
}
