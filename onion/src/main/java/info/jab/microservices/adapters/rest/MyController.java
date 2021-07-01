package info.jab.microservices.adapters.rest;

import info.jab.microservices.domain.model.UserDetailDTO;
import info.jab.microservices.domain.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("api")
public class MyController {

    private MyService myService;

    MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("single")
    public UserDetailDTO getSingleDTO() {
        return myService.getSingleDTO();
    }

    @GetMapping("list")
    public List<UserDetailDTO> getDTOList() {
        return myService.getDTOList();
    }

}
