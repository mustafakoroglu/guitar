package repo;

import Enums.Color;
import Enums.Type;
import entity.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GuitarRepository extends JpaRepository<Guitar, Long> {

    @Query(value = "SELECT g FROM GUITAR g WHERE g.colorIds like %,?1,% AND g.typeId = ?2")
    List<Guitar> findByColorAndType(String colorId, Long typeId);
}
