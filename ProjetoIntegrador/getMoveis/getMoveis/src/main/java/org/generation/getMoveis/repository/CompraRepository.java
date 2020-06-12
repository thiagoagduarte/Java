package org.generation.getMoveis.repository;


import org.generation.getMoveis.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long>{
<<<<<<< HEAD
	//public List<Compra> findAllByIdContainingIgnoreCase(int codigoDaCompra);
=======
	//public List<Compra> findAllByCodigoDaCompraContainingIgnoreCase(int codigoDaCompra);
>>>>>>> 9dc547098ee94d690524f66d5e5be6548a060a23
	


}