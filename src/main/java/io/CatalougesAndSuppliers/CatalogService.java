package io.CatalougesAndSuppliers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CatalogService {
	private List<Catalog> cat = new ArrayList<Catalog>(Arrays.asList(
			new Catalog("100","name1","Description1","Haldiram","Namkeen","1"),
			new Catalog("200","name2","Description2","Bingo","200 gm","1"),
			new Catalog("300","name3","Description3","Bingo","500 gm","1"),
			new Catalog("400","name4","Description4","Ashirvaad","Atta","2"),
			new Catalog("500","name5","Description5","Samrat","Atta","2")
			));

	public List<Catalog> getCat() {
		return cat;
	}

	public void setCat(List<Catalog> cat) {
		this.cat = cat;
	}
	
	public void addCatalog(Catalog c) {
		cat.add(c);
	}

	public Catalog getCatalog(String id) {
		return cat.stream().filter(t->t.getSku_code().equals(id)).findFirst().get();
	}

	public List<Catalog> getAllCatalog() {
		return cat;
	}

	public List<Catalog> getCatalog(String id, String text) {
		List<Catalog> res=new ArrayList<Catalog>();
		for (Catalog c : cat) {
	        if (c.getSID().equals(id)) {
	            if(c.getBrandName().contains(text) || c.getBrandDescription().contains(text)) {
	            	res.add(c);
	            }
	        }
	    }
		return res;
	}
}
