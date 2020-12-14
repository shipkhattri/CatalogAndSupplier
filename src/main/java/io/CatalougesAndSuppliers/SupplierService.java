package io.CatalougesAndSuppliers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SupplierService {

	private List<Supplier> supp = new ArrayList<Supplier>(Arrays.asList(
			new Supplier("1","A"),
			new Supplier("2","B")
			));
	
	public List<Supplier> getAllSupplier() {
		return supp;
	}

	public Supplier getSupplier(String id) {
		return supp.stream().filter(t->t.getSID().equals(id)).findFirst().get();
	}

	public void addSupplier(Supplier supplier) {
		supp.add(supplier);
	}

}
