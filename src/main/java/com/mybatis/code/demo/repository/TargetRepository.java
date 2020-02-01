package com.mybatis.code.demo.repository;

import com.mybatis.code.demo.entity.Target;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 他们存在继承关系：
 *
 * 　　PagingAndSortingRepository 继承 CrudRepository
 * 　　JpaRepository 继承 PagingAndSortingRepository
 *
 * 也就是说， CrudRepository 提供基本的增删改查；PagingAndSortingRepository 提供分页和排序方法；JpaRepository 提供JPA需要的方法。
 *
 * 在使用的时候，可以根据具体需要选中继承哪个接口。
 */
//public interface TargetRepository extends CrudRepository<Target,Integer> {
//}
//public interface TargetRepository extends PagingAndSortingRepository<Target,Integer> {
//}
public interface TargetRepository extends JpaRepository<Target,Integer> {
}
