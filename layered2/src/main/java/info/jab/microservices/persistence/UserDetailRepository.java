package info.jab.microservices.persistence;


import info.jab.microservices.model.UserDetailEntity;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends CrudRepository<UserDetailEntity, Long> {

    @Query("SELECT * FROM USER_DETAILS WHERE USERNAME= :username")
    UserDetailEntity getUserDetailByUserName(@Param("username") String username);
}