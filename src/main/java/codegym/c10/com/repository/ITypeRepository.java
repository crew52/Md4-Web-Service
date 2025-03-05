package codegym.c10.com.repository;

import codegym.c10.com.model.Type;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface ITypeRepository extends CrudRepository<Type, Long> {
    @Query(nativeQuery = true, value = "CALL delete_type(:id)")
    @Transactional
    @Modifying
    void deleteTypeById(@Param("id") Long id);
}
