import dejonathan.mail.Mail;
import dejonathan.sender.Sender;

public class Main {
    public static void main(String[] args) {
        test();
    }
        private static void test() {
            Mail mail = new Mail();

            mail.setRecipient("yuriy@solovyov.de");
            mail.setSubject("Hallo yuriy");
            mail.setMessage("Hallo von ");

            try {
                Sender sender = new Sender();
                for (int i = 0; i<1; i++){
                    sender.send(mail);
                }
                sender.send(mail);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }


