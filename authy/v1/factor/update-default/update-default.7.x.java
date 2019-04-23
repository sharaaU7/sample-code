// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.authy.v1.service.entity.Factor;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    // DANGER! This is insecure. See http://twil.io/secure
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Factor factor = Factor.updater(
                "ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "identity",
                "YFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
            .setAuthPayload("auth_payload").update();

        System.out.println(factor.getFriendlyName());
    }
}