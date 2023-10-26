package com.example.contract.Controllers;

import com.example.contract.Entities.Contract;
import com.example.contract.Services.IContractService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contracts")
public class ContractRestAPI {
    IContractService contractService;



    @GetMapping("/retrieve-all-contracts")

    public List<Contract> getContracts() {
        List <Contract> listContracts = contractService.retrieveAllContracts();
        return listContracts;
    }

    @GetMapping("/retrieve-contract/{contract-id}")
    public Contract retrieveContract(@PathVariable("contract-id") Long cId) {
        Contract contract = contractService.retriveContract(cId);
        return contract;
    }

    @PostMapping("/add-contract")

    public Contract addContract(@RequestBody Contract c) {

        Contract contract = contractService.addContract(c);
        return contract;
    }


    @DeleteMapping("/remove-contract/{contract-id}")
    public void removeContract(@PathVariable("contract-id") Long cId) {
        contractService.removeContract(cId);
    }

    @PutMapping("/modify-contract")
    public Contract modifyContract(@RequestBody Contract c) {
        Contract contract = contractService.updateContract(c);
        return contract;
    }

}