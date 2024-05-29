package Controlador;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailButton extends JButton implements ActionListener {

    private static final long serialVersionUID = 1L;
    private String email;
    private String subject;
    private String message;
    private File attachedFile;
    
    public EmailButton() {
        attachedFile = null;
        setText("Enviar Correo");
        setBounds(0, 0, 120, 30); // Establece un tamaño predeterminado
        addActionListener(this); // Registra el botón para escuchar eventos de acción
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAttachedFile(File attachedFile) {
        this.attachedFile = attachedFile;
    }

    
    

    public void sendEmail() throws IOException {
    // Configuración de las propiedades para la conexión con el servidor SMTP 
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com"); // Cambia "smtp.example.com" por tu servidor SMTP
    props.put("mail.smtp.port", "25"); // Puerto SMTP
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    
    //Creacion multipart (Cuerpo mensaje)
    Multipart mltprt = new MimeMultipart();
    MimeBodyPart mbp = new MimeBodyPart();
    MimeBodyPart mbpPDF = new MimeBodyPart();
    // Credenciales de autenticación
    String username = "mechatype004@gmail.com"; // Cambia por tu dirección de correo electrónico
    String password = "ecng qpjw zssp gvaz"; // Cambia por tu contraseña

    // Creación de la sesión
    Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

    try {
        // Creación del mensaje
        Message emailMessage = new MimeMessage(session);
        emailMessage.setFrom(new InternetAddress(username));
        emailMessage.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(email));
        emailMessage.setSubject(subject);
        
        mbp.setText(message, "utf-8", "html");
        
        mbp.attachFile( attachedFile,"application/pdf", null);
        
        mltprt.addBodyPart(mbp);
        emailMessage.setContent(mltprt);

        // Envío del mensaje
        Transport.send(emailMessage);

        JOptionPane.showMessageDialog(null, "Correo electrónico enviado correctamente.");

    } catch (AuthenticationFailedException ex) {
        JOptionPane.showMessageDialog(null, "Error de autenticación al enviar el correo electrónico: " + ex.getMessage());
    } catch (MessagingException ex) {
        JOptionPane.showMessageDialog(null, "Error al enviar el correo electrónico: " + ex.getMessage());
    }
}

    @Override
    public void actionPerformed(ActionEvent e) {
        // Aquí se puede agregar cualquier lógica adicional al hacer clic en el botón
        // No necesitamos hacer nada aquí para el envío de correo electrónico, ya que ese proceso se maneja en el método sendEmail().
    }
}