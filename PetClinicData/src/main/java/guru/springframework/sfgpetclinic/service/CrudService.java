package guru.springframework.sfgpetclinic.service;

import java.util.Set;

public interface CrudService<T,ID> {
	
	Set<T> finndAll();
	
	T finndById(ID id);
	
	T save(T object);
	
	void delete(T object);
	
	void deleteById(ID id);

}
