package someshbose.github.io;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import someshbose.github.io.config.MainConfig;
import someshbose.github.io.service.HelloService;

public class Main {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        HelloService service = context.getBean(HelloService.class);

        System.out.println(service.greetings("Somesh"));
    }
}
