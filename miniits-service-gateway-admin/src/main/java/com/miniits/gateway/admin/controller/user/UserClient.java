package com.miniits.gateway.admin.controller.user;


import com.miniits.models.user.UserModel;
import com.miniits.utils.Result;
import com.miniits.utils.ServiceNames;
import com.miniits.utils.ServiceUrls;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author: wq
 * @Date: 2017/10/2
 * @Time: 23:06
 * <p>
 * Description:
 * ***
 */
@FeignClient(name = ServiceNames.MINIITS_SERVICE_CORE)
@RequestMapping(ServiceUrls.API_VERSION.CORE_SERVICE)
@ApiIgnore
public interface UserClient {

    @RequestMapping(value = ServiceUrls.UserUrl.USERS, method = RequestMethod.GET)
    Result<UserModel> search(
            @RequestParam(value = "filters", required = false) String filters,
            @RequestParam(value = "sorts", required = false) String sorts,
            @RequestParam(value = "size", required = false) int size,
            @RequestParam(value = "page", required = false) int page);

    @RequestMapping(value = "q", method = RequestMethod.GET)
    Result search(@RequestParam(value = "page", required = false) int page);
}
