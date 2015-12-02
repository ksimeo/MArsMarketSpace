package com.ksimeo.arsu.rest.dao;

import com.ksimeo.arsu.core.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * @author Ksimeo 09.11.2015.
 */
@Service
public interface IUserDao extends CrudRepository<User, Integer> {


}
