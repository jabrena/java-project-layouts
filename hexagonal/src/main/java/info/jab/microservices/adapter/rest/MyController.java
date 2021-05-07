package info.jab.microservices.adapter.rest;

import info.jab.microservices.application.service.MyService;
import info.jab.microservices.service.UserDetailDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("api")
public record MyController(MyService myService) {

    @GetMapping("single")
    public UserDetailDTO getSingleDTO() {
        return myService.getSingleDTO();
    }

    @GetMapping("list")
    public List<UserDetailDTO> getDTOList() {
        return myService.getDTOList();
    }

}
