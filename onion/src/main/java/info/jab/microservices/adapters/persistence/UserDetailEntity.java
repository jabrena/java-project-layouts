package info.jab.microservices.adapters.persistence;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("USER_DETAILS")
public record UserDetailEntity(

    @Id
    Long user_id,
    String username,
    String first_name,
    String last_name,
    String gender,
    String password,
    Integer status
    
) {}