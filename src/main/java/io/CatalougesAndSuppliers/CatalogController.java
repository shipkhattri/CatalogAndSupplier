package io.CatalougesAndSuppliers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
	
	@Autowired
	private CatalogService CatalogService;

	public CatalogService getCatalogService() {
		return CatalogService;
	}

	public void setCatalogService(CatalogService catalogService) {
		CatalogService = catalogService;
	}
	
	@RequestMapping
	public List<Catalog> getAllCatalog(){
		return CatalogService.getAllCatalog();
	}
	
	@RequestMapping("/{foo}")
	public Catalog getCatalog(@PathVariable("foo") String id) {
		return CatalogService.getCatalog(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void addCatalog(@RequestBody Catalog catalog) {
		CatalogService.addCatalog(catalog);
	}
	
	@RequestMapping("/{id}/{text}")
	public List<Catalog> getCatalog(@PathVariable("id") String id, @PathVariable("text") String text){
		return CatalogService.getCatalog(id,text);
	}
}