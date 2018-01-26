import modules.User;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public void TestUserIntoResponse (){
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject("https://api.github.com/users/Artem100", User.class);
        System.out.println(user);
        assertTrue(user.getRepos_url().contains("https://api.github.com/users/Artem100/repos"));
    }
}
