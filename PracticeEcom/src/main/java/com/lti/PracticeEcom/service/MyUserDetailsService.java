package com.lti.PracticeEcom.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lti.PracticeEcom.dao.UserRepository;
import com.lti.PracticeEcom.model.MyUserDetails;
import com.lti.PracticeEcom.model.User;



@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	
    	System.out.println("UserName from login page= "+userName);
        User user = userRepository.findByUserName(userName);
        System.out.println("Üser object from DB"+user);

      
       // user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

        return new MyUserDetails(user);
        
        //return user.map(MyUserDetails::new).get();
       
    }
}

