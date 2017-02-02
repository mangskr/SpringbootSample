import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mangs on 17. 2. 2.
 * http://theeye.pe.kr/archives/2014
 *
 * @Configuration 태그는 현재의 클래스가 Spring의 설정 파일임을 어플리케이션 컨텍스트에게 알려주는 역할
 * @EnableAutoConfiguration 은 Spring Boot가 클래스패스 세팅, 다른 Bean들, 다양한 설정들에 의해 Bean을 추가하도록 함
 *
 * 일반적으로 기존의 Spring MVC 어플리케이션에서는 @EnableWebMvc 태그를 사용했지만
 * Spring Boot는 클래스패스에서 spring-webmvc를 발견할 경우 자동으로 추가.
 * 이러한 플래그는 DispatcherServlet을 세팅하는것과 같은 개발중인 어플리케이션을 웹어플리케이션으로 활성화 하는 핵심 키
 *
 * 기존 spring에서 설정 예(web.xml)
 * <servlet>
 *      <servlet-name>adminController</servlet-name>
 *      <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
 *      <load-on-startup>1</load-on-startup>
 * </servlet>
 *
 * @ComponentScan 은 Spring에게 hello 패키지 안에서 다른 컴포넌트, 설정, 서비스를 찾도록 함.
 * 이 설정을 통해 HelloController를 찾는것이 가능해 짐
 *
 * ex)
 * @ComponentScan({
 * "com.test.license.server.api.user",
 * "com.test.license.server.api.license",
 * "com.test.license.server.api.logger",
 * "com.test.license.server.view"
 * })
 *
 * main() 메소드는 Spring Boot의 SpringApplication.run() 메소드를 실행함으로써 어플리케이션을 시작
 * 여기까지 단 한줄의 XML 코드도 볼수 없었습니다.
 * 심지어 web.xml도 보이지 않습니다. 이 어플리케이션은 100% 순수한 Java 어플리케이션이고 이 프로젝트를 구동하기 위한
 * 어떤 인프라(WAS 설정등)의 구성 작업도 하지 않았습니다
 *
 * Application 클래스에서 마우스 오른쪽 버튼이나 Ctrl + Shift + R을 눌러 실행
 * http://localhost:8080/으로 접속해서 확인해 보면 HelloController.index()가 실행된것을 확인
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Spring Boot Started.");
    }
}
