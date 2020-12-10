package com.capg.greetingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.greetingapp.model.Greeting;

public interface IGreetingsRepository  extends JpaRepository<Greeting, Long> {

}
