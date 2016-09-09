package com.bankdemo.bank.account;

import com.bankdemo.exceptions.ApplicationException;
import com.bankdemo.model.account.Account;

/**
 * Created by Ilyas.Kuanyshbekov on 08.09.2016.
 */
public interface AccountProcesses {

    Account openAccount(String iban, String currencyCode) throws ApplicationException;

    void deposit(String iban, Double amount) throws ApplicationException;

    Double balance(String iban) throws ApplicationException;
}
