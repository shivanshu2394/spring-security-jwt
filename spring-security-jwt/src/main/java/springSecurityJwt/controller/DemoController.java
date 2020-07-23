package springSecurityJwt.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoController {
    @ApiOperation(value = "", authorizations = {@Authorization(value = "jwtToken")})
    @RequestMapping({"/home"})
    public String homePage() {
        return "Hello i am on home page";
    }
}
