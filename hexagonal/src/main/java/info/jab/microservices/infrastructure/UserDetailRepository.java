package info.jab.microservices.infrastructure;


import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends CrudRepository<UserDetail, Long> {

    @Query("SELECT * FROM USER_DETAILS WHERE USERNAME= :username")
    UserDetail getUserDetailByUserName(@Param("username") String username);
}