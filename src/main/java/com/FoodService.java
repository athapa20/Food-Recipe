/* handles the user request from the HTML page.
*/

package com;

import com.model.FoodType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aachal on 7/23/20.
 */
public class FoodService {
 
    public List getAvailableitems(FoodType type){

        List items = new ArrayList();

        if(type.equals(FoodType.Nepalese)){
        	items.add("<h3>Momo</h3>");
        	items.add(("<h3>Daal bhat</h3>"));
        	items.add(("<h3>Samay baji</h3>"));

        }else if(type.equals(FoodType.Italian)){
        	items.add("<h3>Lasagna</h3>");
        	items.add("<h3>Pizza</h3>");
        	items.add(("<h3>Risotto</h3>"));

        }else if(type.equals(FoodType.Thai)){
        	items.add("<h3>Red thai curry</h3>");
        	items.add(("<h3>Fried Rice</h3>"));
        	items.add(("<h3>Spring Roll</h3>"));
        
        }else if(type.equals(FoodType.Mexican)){
        	items.add("<h3>Taco</h3>");
        	items.add(("<h3>Buritto</h3>"));
        	items.add(("<h3>Cheese quesadilla</h3>"));
            
        }else {
        	items.add("No item Available");
        }
    return items;
    }
}