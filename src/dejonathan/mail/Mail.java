package dejonathan.mail;

public class Mail {

    private String sender;
    private String  recipient;
    private String subject;
    private String message;
    private String attachement;

    public Mail(String sender, String recipient, String subject, String message, String attachement) {
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
        this.attachement = attachement;
    }
    public Mail (){}
    public String getSender() {
        return this.sender;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getMessage() {
        return this.message;
    }

    public String getAttachement() {
        return this.attachement;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient){
        this.recipient = recipient;
    }
    public void setSubject (String subject){
        this.subject = subject;
    }
    public void setMessage (String message){
        this.message = message;
    }
    public void setAttachement (String attachement){
        this.attachement = attachement;
    }
}

