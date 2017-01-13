package com.med.security.shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * @author: Administrator
 * @date : 2017/1/12 0012
 * @Description:
 */
public class MyRealm1 implements Realm {
    @Override
    public String getName() {
        return "myrealms1";
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String)authenticationToken.getPrincipal();
        String password = new String((char[])authenticationToken.getCredentials());

        if(!"zhang".equals(username)){
            throw new UnknownAccountException(); //用户名错误
        }
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
