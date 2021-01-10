//package com.lvyb.intelligenceAgriculture.config.service;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Component
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    /**
//     * Spring Security接收login请求调用UserDetailsService这个接口中的loadUserByUsername方法
//     * loadUserByUsername根据传进来的用户名进行校验工作，最后将查询到的用户信息封装到UserDetails这个接口的实现类中
//     *
//     * @param username 用户名
//     * @return
//     * @throws UsernameNotFoundException 登录异常类
//     */
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        log.info("登录，用户名：{}", username);
//        //根据用户名查询用户数据，比如：从数据库中查询
//        return new User(username, "123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//    }
//}