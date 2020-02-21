import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<String,Double> hm=new HashMap<String,Double>();
		//LinkedHashMap<String,Double> hm=new LinkedHashMap<String,Double>();
		TreeMap<String,Double> hm=new TreeMap<String,Double>();
		hm.put("raja", 10000.0);
		hm.put("arun", 35000.0);
		hm.put("Ramesh",45000.0);
		hm.put("Ram", 25000.0);//replaces existing value
		hm.put("Arun", 350000.0);
		System.out.println(hm);
		Set<String> s=hm.keySet();
		for(String Key:s){
			System.out.println(Key);
			
		}
		Collection<Double> values=hm.values();
		for(Double val:values){
			System.out.println(val);
		}
		Set <Entry<String,Double>> setofEntries=hm.entrySet();
		for(Entry<String,Double> e: setofEntries){
			System.out.println(e.getKey()+ " = "+ e.getValue());
		}
	}

}
