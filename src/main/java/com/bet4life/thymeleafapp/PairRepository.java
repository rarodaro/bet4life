package com.bet4life.thymeleafapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PairRepository extends CrudRepository<Pair, Integer> {

}