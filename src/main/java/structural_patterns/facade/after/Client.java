package structural_patterns.facade.after;

public class Client {


    /**
     * before 패키지에 Client 코드는 메일을 보내기위한 각종 라이브러리들이 얽혀있다.
     *
     * after 패키지에서는 관심사별로 클래스를 분류하여 보낼 Message 클래스, 보낼 클래스, 세팅 클래스로 관심사를
     * 나눠서 좀더 책임을 분할하였고 각종 라이브러리들에 대한 의존성을 Sender 클래스로 몰아넣었다.
     *
     * 클라이언트 코드는 좀더 직관적으로 변했고 가독성이 좋아졌다.
     *
     * 장점
     * 1. 직관적이고 가독성이 좋다
     * 2. 코드 작성이 더 쉽다.
     *
     * 단점
     * 1. 퍼사드 클래스가 각종 라이브러리드렝 대한 의존성을 가지게된다.
     */
    public static void main(String[] args) {

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("MintKim");
        emailMessage.setTo("rlaalsxo1990");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("밖은 더 지옥이더라고..");

        EmailSender emailSender = new EmailSender(emailSettings);
        emailSender.sendEmail(emailMessage);

    }
}
