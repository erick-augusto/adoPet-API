package br.com.alura.adopet.api.repository;

import br.com.alura.adopet.api.model.Abrigo;
import br.com.alura.adopet.api.model.Pet;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {

    Collection<Pet> findAllByAdotadoFalse();

    Collection<Pet> findByAbrigo(Abrigo abrigo);

}
