package ru.job4j.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.job4j.rest.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("DELETE FROM User u WHERE u.id=:pId")
    int delete(@Param("pId") Long id);


    @Transactional
    @Modifying
    @Query("""
        UPDATE User u
        SET u.username = :#{#user.username},
        u.created = :#{#user.created}
        WHERE u.id=:#{#user.id}
        """)
    int update(@Param("user") User user);
}