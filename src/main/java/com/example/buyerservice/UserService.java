package com.example.buyerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    CredentialRepository credentialRepository;

    @Autowired
    UserdetailRepository userdetailRepository;

    @Autowired
    UsertypelinkRepository usertypelinkRepository;

    public User getUser(String username)
    {
        User user = new User();

        if(credentialRepository.findById(username).isPresent())
        {
            Optional<Userdetail> userdetail;
            if( ( userdetail =  userdetailRepository.findById(username)).isPresent())
            {
                user.setUserdetail(userdetail.get());

                Optional<List<Usertypelink>> usertypelinks;
                if( (usertypelinks = usertypelinkRepository.findByUsername(username)).isPresent()  )
                {
                    user.setUsertypes(usertypelinks.get());
                }

            }
        }

        return user;
    }
}
