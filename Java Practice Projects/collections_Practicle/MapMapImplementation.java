package collections_Practicle;

import java.awt.List;
import java.awt.Taskbar.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Country - State - District - City
public class MapMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList City = new ArrayList();
		City.add("Pune");
		City.add("Delhi");
		City.add("Mumbai");
		City.add("Chennai");
		City.add("Kolkatta");
		City.add("Banglore");
		System.out.println(City);
		
		
		Map District =new HashMap();
		District.put("Maharashtra",City);
		System.out.println(District);
		
		Map State =new HashMap();
		State.put("Maharashtra",District);
		System.out.println(State);
		
		
		Map Country=new HashMap();
		Country.put("India", State);
		System.out.println(Country);
		
		
	}

}
