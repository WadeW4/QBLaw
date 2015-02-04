package com.wade.qblaw.user.service;

import com.wade.qblaw.user.dto.RegistrationForm;
import com.wade.qblaw.user.model.User;

/**
 * @author Petri Kainulainen
 */
public interface UserService {

    /**
     * Creates a new user account to the service.
     * @param userAccountData   The information of the created user account.
     * @return  The information of the created user account.
     * @throws DuplicateEmailException Thrown when the email address is found from the database.
     */
    public User registerNewUserAccount(RegistrationForm userAccountData) throws DuplicateEmailException;
}
