package com.coderwhs.init.service;

/**
 * @Author whs
 * @Date 2024/10/28 23:32
 * @description:
 */
public interface RedisService {

  /**
   * 分布式id生成
   */
  Long genDistributedId();
}
