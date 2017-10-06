package com.miniits.core.controller.user;

import com.miniits.core.model.user.User;
import com.miniits.core.service.user.UserService;
import com.miniits.utils.BaseControllerUtil;
import com.miniits.utils.Result;
import com.miniits.utils.ServiceUrls;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wq
 * @Date: 2017/10/2
 * @Time: 23:06
 * <p>
 * Description:
 * ***
 */
@RestController
@RequestMapping(ServiceUrls.API_VERSION.CORE_SERVICE)
@Api(value = "user", description = "用户接口")
public class UserController extends BaseControllerUtil {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户列表")
    @RequestMapping(value = ServiceUrls.UserUrl.USERS, method = RequestMethod.GET)
    public Result<User> search(
            @ApiParam(name = "filters", value = "过滤器", defaultValue = "")
            @RequestParam(value = "filters", required = false) String filters,
            @ApiParam(name = "sorts", value = "排序", defaultValue = "")
            @RequestParam(value = "sorts", required = false) String sorts,
            @ApiParam(name = "size", value = "页数", defaultValue = "15")
            @RequestParam(value = "size", required = false) int size,
            @ApiParam(name = "page", value = "页码", defaultValue = "1")
            @RequestParam(value = "page", required = false) int page) {
        Page<User> orders = userService.searchExtendDistinct(filters, sorts, page, size);
        return getResultList(orders.getContent(), orders.getTotalElements(), page, size);
    }

    @RequestMapping(value = "q", method = RequestMethod.GET)
    Result search(@RequestParam(value = "page", required = false) int page) {
        return error(String.valueOf(page));
    }
}