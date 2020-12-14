package io.CatalougesAndSuppliers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierController {

	@Autowired
	private SupplierService SupplierService;
	
	@RequestMapping("/supplier")
	public List<Supplier> getAllSupplier(){
		return SupplierService.getAllSupplier();
	}
	
	@RequestMapping("/supplier/{foo}")
	public Supplier getSupplier(@PathVariable("foo") String id) {
		return SupplierService.getSupplier(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/supplier")
	public void addSupplier(@RequestBody Supplier supplier) {
		SupplierService.addSupplier(supplier);
	}
	
}
