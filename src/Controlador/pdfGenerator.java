/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

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
    Paragraph titulo = new Paragraph("TICKET DE COMPRA");
    Paragraph texto1 = new Paragraph("");
    Paragraph despedida = new Paragraph("¡Vuelve pronto! ;)");
    
    public void addText(String nuevaLinea){
        texto1.add(nuevaLinea+'\n');
    }
    
    public File getTicket() throws MalformedURLException, MalformedURLException, IOException{
        File fop = new File("TicketDeCompra.pdf");
        return crearPDF(fop);
        
    }
    
    public File crearPDF(File fof) throws FileNotFoundException, MalformedURLException, IOException {
     try {
 
        
        try (
                
                FileOutputStream fos = new FileOutputStream(fof);
                PdfWriter writer = new PdfWriter(fos);
                PdfDocument pdf = new PdfDocument(writer);
                Document document = new Document(pdf, PageSize.A4)
                ) 
        {
        

            
            document.add(new Paragraph("\n"));
            
            Div espacioDiv = new Div().setHeight(0); 
            document.add(espacioDiv);
    
            PdfFont f1 = PdfFontFactory.createFont(StandardFonts.COURIER_BOLD);
            PdfFont f2 = PdfFontFactory.createFont(StandardFonts.COURIER);
            
            titulo.setFont(f1);
            texto1.setFont(f2);
            
            document.add(titulo);
            document.add(texto1);
            
            Div espacioDiv2 = new Div().setHeight(10);
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
     
    return fof;
    //pregunta();
    
}
}
