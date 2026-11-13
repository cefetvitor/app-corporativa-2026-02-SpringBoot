package br.cefetrj.projetospringboot.service;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.cefetrj.projetospringboot.model.EntityGeneric;

public abstract class GenericService<T extends EntityGeneric> {
    
  protected JpaRepository<T, Long> repository;

  public GenericService(JpaRepository<T, Long> repository) {
    this.repository = repository;
  }
  public T findById(Long id) {
    return this.repository.findById(id).orElse(null);
  }
  public void save(T obj) {
    this.repository.save(obj);
  }
  public void update(T obj) {
    this.repository.save(obj);
  }
  public void delete(Long id) {
    this.repository.deleteById(id);
  }
  public List<T> findAll(){
    return this.repository.findAll();
  }
}
