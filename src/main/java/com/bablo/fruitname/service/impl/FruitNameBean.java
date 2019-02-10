/**
 * 
 */
package com.bablo.fruitname.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bablo.fruitname.helper.Fruit;
import com.bablo.service.FruitNameService;

/**
 * @author anusharma
 *
 */
public class FruitNameBean implements FruitNameService{

	public List<String> getFruitName(Fruit fruit) {
		List<String> strArrList = new ArrayList<String>();
		for(Fruit fruitVal : fruit.values()) {
			strArrList.add(fruitVal.toString());
		}
		return strArrList;
	}

}
