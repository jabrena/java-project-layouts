package info.jab.microservices.adapter.persistence;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("USER_DETAILS")
public record UserDetail(

    @Id
    Long user_id,
    String username,
    String first_name,
    String last_name,
    String gender,
    String password,
    Integer status
) {}