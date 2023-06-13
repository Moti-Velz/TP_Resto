package com.example.tp_resto.service;

import com.example.tp_resto.entity.CommandeItem;
import com.example.tp_resto.repository.ICommandeItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import java.util.List;

@Service
public class CommandeItemServiceImpl implements CommandeItemService{

    private ICommandeItemRepo commandeItemRepository;

    @Autowired
    public CommandeItemServiceImpl(ICommandeItemRepo commandeItemRepository){
        this.commandeItemRepository = commandeItemRepository;
    }



    @Override
    public CommandeItem saveItem(CommandeItem item) {
        commandeItemRepository.save(item);
        return item;
    }

    @Override
    public List<CommandeItem> findAll() {
        return commandeItemRepository.findAll();
    }

    @Override
    public void updateCommandeItemById(Integer id, CommandeItem foodItem) {

    }

    @Override
    public void deleteCommandeItemById(Integer id) {

    }

    @Override
    public Optional<CommandeItem> getById(int id) {

        return commandeItemRepository.findById(id);
    }
}
