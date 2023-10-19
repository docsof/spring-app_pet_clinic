package guru.springframework.sfgpetclinic.service.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.CrudService;

public class VetServiceMap extends AbstractMapService< Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Set<Vet> finndAll() {
		return super.findAll();
	}

	@Override
	public Vet finndById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	
}
