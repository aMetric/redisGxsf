package com.coderwhs.init.service.impl;

import com.coderwhs.init.constant.RedisConstant;
import com.coderwhs.init.service.RedisService;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author whs
 * @Date 2024/10/28 23:33
 * @description:
 */
@Service
public class RedisServiceImpl implements RedisService {

  @Resource
  private RedissonClient redissonClient;

  /**
   * 分布式id生成
   */
  @Override
  public Long genDistributedId() {
    RAtomicLong atomicLong = redissonClient.getAtomicLong(RedisConstant.COUNTER_ORDER_REDIS_KEY);
    return atomicLong.incrementAndGet();
  }
}
