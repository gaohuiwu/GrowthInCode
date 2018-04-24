/*
package com.grow.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

*/
/**
 * FileName:ShiroRealm
 * Author:  ghw06
 * Date:    2018/4/24 8:58
 * Description:自定义realm    shiro
 *//*

public class ShiroRealm extends AuthorizingRealm {

    */
/*
         * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用,负责在应用程序中决定用户的访问控制的方法(non-Javadoc)
         *
         * @see
         * org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache
         * .shiro.subject.PrincipalCollection)
         *//*

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("========ShiroRealm==========doGetAuthorizationInfo");
        return null;
    }

    */
/*
        * 登录信息和用户验证信息验证(non-Javadoc)
        *
        * @see
        * org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.
        * apache.shiro.authc.AuthenticationToken)
        *//*

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String userName = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());

        if (null != userName && null != password) {
            return new SimpleAuthenticationInfo(userName, password, getName());
        } else {
            return null;
        }
    }
}
*/
