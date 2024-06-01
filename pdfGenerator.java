/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;
import java.io.*;
import java.net.MalformedURLException;

/**
 *
 * @author Zaidc
 */
public class pdfGenerator {
    Image logoE = new Image(ImageDataFactory.create(getClass().getResource("/imagenes/adBB.jpg")));  
    Paragraph titulo = new Paragraph("TICKET DE COMPRA");
    Paragraph texto1 = new Paragraph("");
    Paragraph despedida = new Paragraph("¡Disfrutalo!");
    
    
    public File getTicket() throws MalformedURLException, MalformedURLException, IOException{
        File fop = new File("TicketDeCompra.pdf");
        crearPDF(fop);
        return fop;
    }
    
    public void crearPDF(File fof) throws FileNotFoundException, MalformedURLException, IOException {
     try {
 
        logoE.scaleToFit(250, 250);
        
        try (
                
                FileOutputStream fos = new FileOutputStream(fof);
                PdfWriter writer = new PdfWriter(fos);
                PdfDocument pdf = new PdfDocument(writer);
                Document document = new Document(pdf, PageSize.A5)
                ) 
        {
        

            float x = (pdf.getDefaultPageSize().getWidth() - logoE.getImageScaledWidth()) / 2;
            float y = pdf.getDefaultPageSize().getHeight() - logoE.getImageScaledHeight() - 50;

            logoE.setFixedPosition(x, y);
            

            document.add(logoE);
            document.add(new Paragraph("\n"));
            
            Div espacioDiv = new Div().setHeight(280); 
            document.add(espacioDiv);
    
            PdfFont f1 = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
            PdfFont f2 = PdfFontFactory.createFont(StandardFonts.HELVETICA);
            
            titulo.setFont(f1);
            texto1.setFont(f2);
            
            document.add(titulo);
            document.add(texto1);
            
            Div espacioDiv2 = new Div().setHeight(20);
            document.add(espacioDiv2);
            
            despedida.setFont(f1);
            document.add(despedida);
            
            document.close();
            
        }
        
        
        
    } catch (FileNotFoundException e) {
        System.out.println("Error al crear el archivo PDF: " + e.getMessage());
    }catch (IOException e){
        System.out.println("Error fatal");
    }
     
    
    //pregunta();
    
}
}
