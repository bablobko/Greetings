/**
 * 
 */
package com.bablo.service;

import java.util.List;

import com.bablo.fruitname.helper.Fruit;

/**
 * @author anusharma
 *
 */
public interface FruitNameService {
	List<String> getFruitName(Fruit fruit);
}
