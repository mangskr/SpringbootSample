import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mangs on 17. 2. 2.
 *
 * @RestController는 @Controller와 @ResponseBody를 합친 기능
 * 그러므로 곧바로 렌더링할 스트링을 바로 반환
 *
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
