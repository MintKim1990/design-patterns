package structural_patterns.adapter.after;

import structural_patterns.adapter.after.security.LoginHandler;
import structural_patterns.adapter.after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {

        UserDetailsService userDetailsService = new AccountUserDetailsService(
                new AccountService()
        );

        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        loginHandler.login("test", "test");

    }
}
