package com.vision.repository;

import org.springframework.data.repository.CrudRepository;

import com.vision.entity.Timings;

public interface TimingRepo extends CrudRepository<Timings, Integer> {

}
