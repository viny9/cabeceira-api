package cabeceira.api.domain.author;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
