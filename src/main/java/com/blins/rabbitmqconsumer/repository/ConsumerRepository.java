package com.blins.rabbitmqconsumer.repository;

import com.blins.rabbitmqconsumer.model.AccountBalanceRequestModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerRepository extends JpaRepository<AccountBalanceRequestModel, String> {
    List<AccountBalanceRequestModel> findByRequestRefID(String requestRefID);
}
