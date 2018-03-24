package com.bhavya.cloudExample.currencyexchangeservice.repository;

import com.bhavya.cloudExample.currencyexchangeservice.controller.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    ExchangeValue findByFromAndTo(String from, String to);
}
