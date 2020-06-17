package io.springrestdocs.resource.repository;

import org.springframework.data.repository.CrudRepository;

import io.springrestdocs.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
