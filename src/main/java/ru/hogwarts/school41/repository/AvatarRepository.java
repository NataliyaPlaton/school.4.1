package ru.hogwarts.school41.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school41.model.Avatar;
import java.util.Optional;
@Repository
public interface AvatarRepository extends PagingAndSortingRepository<Avatar, Integer> {
    Optional<Avatar>findByStudentId(Long studentId);

}
