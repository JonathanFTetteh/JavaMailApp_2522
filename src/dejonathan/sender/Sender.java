package dejonathan.sender;

import dejonathan.mail.Mail;
import dejonathan.smtp.SMTPConnection;

import javax.mail.*;
import javax.mail.internet.*;

public class Sender {
    private Session session;
    private SMTPConnection connection;
    public Sender() throws Exception{
        this.connection = new SMTPConnection();
        try {
            this.session = this.connection.getConnection();
        } catch (Exception ex) {
            System.out.println("LOG :" + ex.getMessage());
            throw new Exception("Connection failed!");
        }
    }

    public boolean send(Mail mail) throws Exception {



        Message message = new MimeMessage(this.session);
        message.setFrom(new InternetAddress(this.connection.getFrom()));
        message.setRecipients(
                Message.RecipientType.TO, InternetAddress.parse(mail.getRecipient()));
        message.setSubject(mail.getSubject());





        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(mail.getMessage(), "text/html; charset=utf-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);
        try {
            Transport.send(message);
        } catch (Exception ex){
            throw new Exception("Cannot send the mail. Connection failed!");
        }
        return true;
    }
}
