package fr.unice.polytech.si5.al.creditrama.teamd.clientservice.service;

import fr.unice.polytech.si5.al.creditrama.teamd.clientservice.exception.BankAccountNotFoundException;
import fr.unice.polytech.si5.al.creditrama.teamd.clientservice.exception.ClientNotFoundException;
import fr.unice.polytech.si5.al.creditrama.teamd.clientservice.model.BankAccount;
import fr.unice.polytech.si5.al.creditrama.teamd.clientservice.model.Client;

import java.util.List;

public interface ClientService {

    Client save(Client customer);

    Client fetchById(int profileId) throws ClientNotFoundException;

    Client fetchByName(String name);

    List<Client> fetchAllClient();

    void deleteById(int userId);

    void createAccount(int id) throws ClientNotFoundException;

    BankAccount addRecipient(int id, String iban) throws ClientNotFoundException, BankAccountNotFoundException;

    void removeRecipient(Integer clientId, String recipientId) throws ClientNotFoundException;

    void initAdmin(String password);
}