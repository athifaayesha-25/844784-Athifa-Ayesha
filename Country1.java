import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

class CountrySorter{
	//best practice is to use interface
	ArrayList<String> sortCountries(ArrayList<String> countryList)
	{
		Collections.sort(countryList);
		return countryList;
	}
}
public class Country1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> sortCountries(List<String> countryList);
		ArrayList<String> a1=new ArrayList<String>();
    a1.add("india");
	a1.add("america");
	a1.add("france");
	a1.add("australia");
	a1.add("england");
	CountrySorter obj=new CountrySorter();
	ArrayList<String> res=obj.sortCountries(a1);
	
	for(String country:res){
		System.out.println(country);
	}
    
	}

}
