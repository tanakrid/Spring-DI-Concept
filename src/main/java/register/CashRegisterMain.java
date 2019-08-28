package register;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CashRegisterMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");
        CashRegister register = context.getBean("register", CashRegister.class);
        CashRegister register1 = context.getBean("Cash", CashRegister.class);

        Test test = context.getBean("test", Test.class);
        Test test1 = context.getBean("test2", Test.class);
        System.out.println(test.toString());
        test.print();
        System.out.println(test1.toString());
        test1.print();
        register.recordPurchase(160);
        System.out.println(register.getTotal());
        register1.recordPurchase(160);
        System.out.println(register1.getTotal());
        }

}