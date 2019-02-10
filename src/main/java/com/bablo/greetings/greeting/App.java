package com.bablo.greetings.greeting;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bablo.fruitname.helper.Fruit;
import com.bablo.fruitname.service.impl.FruitNameBean;
import com.bablo.greetings.greeting.helper.Language;
import com.bablo.greetings.greeting.service.GreetingService;
import com.bablo.greetings.service.impl.GreetingServiceImpl;
import com.bablo.service.FruitNameService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        GreetingService greetingService = context.getBean("greetingservicebean", GreetingServiceImpl.class);
        String str = greetingService.sendGreetings(Language.FRENCH);
        System.out.println("In French we say " + str);
        
        FruitNameService fruitNameService = context.getBean("fruitnamebean", FruitNameBean.class);
        List<String> strList = fruitNameService.getFruitName(Fruit.AAM);
        
        for(String str1 : strList) {
      	  System.out.println(str1);
        }
    }
}
