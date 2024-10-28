package com.coderwhs.init.controller;

import com.coderwhs.init.common.BaseResponse;
import com.coderwhs.init.common.ResultUtils;
import com.coderwhs.init.model.dto.user.UserRegisterRequest;
import com.coderwhs.init.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author whs
 * @Date 2024/10/28 23:32
 * @description:
 */
@RestController
@RequestMapping("/redis")
@Slf4j
public class RedisController {

  @Resource
  private RedisService redisService;

  /**
   * 分布式id生成
   *
   * @return
   */
  @PostMapping("/genDistributedId")
  public BaseResponse<Long> userRegister() {
    Long distributedId = redisService.genDistributedId();
    return ResultUtils.success(distributedId);
  }

}
