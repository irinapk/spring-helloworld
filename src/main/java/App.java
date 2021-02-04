import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat =
                (Cat) applicationContext.getBean("Catto");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("Catto");
        System.out.println("HelloWorld case - " + bean.equals(bean2));
        System.out.println("Cats case - " + beanCat.equals(beanCat2));
    }
}