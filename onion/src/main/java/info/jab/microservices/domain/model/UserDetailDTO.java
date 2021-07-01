package info.jab.microservices.domain.model;

//https://kotlinlang.org/docs/data-classes.html
// data class User(val name: String, val age: Int)

public record UserDetailDTO (

    Long user_id,
    String username,
    String first_name,
    String last_name,
    String gender,
    String password,
    Integer status

) {}