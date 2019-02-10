/**
 * 
 */
package com.bablo.fruitname;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bablo.fruitname.helper.Fruit;
import com.bablo.fruitname.service.impl.FruitNameBean;
import com.bablo.service.FruitNameService;

/**
 * @author anusharma
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
      FruitNameService fruitNameService = context.getBean("fruitnamebean", FruitNameBean.class);
      List<String> strList = fruitNameService.getFruitName(Fruit.AAM);
      
      for(String str : strList) {
    	  System.out.println(str);
      }
	}

}
