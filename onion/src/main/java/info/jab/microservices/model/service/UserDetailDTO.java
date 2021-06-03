package info.jab.microservices.model.service;

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

/*
import lombok.Data;

@Data
public class UserDetailDTO {

    private Long user_id;
    private String username;
    private String first_name;
    private String last_name;
    private String gender;
    private String password;
    private Integer status;
}
*/