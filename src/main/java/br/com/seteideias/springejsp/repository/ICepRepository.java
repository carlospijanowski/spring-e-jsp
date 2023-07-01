package br.com.seteideias.springejsp.repository;

import br.com.seteideias.springejsp.entity.Tabela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICepRepository extends JpaRepository<Tabela, String> {
}
