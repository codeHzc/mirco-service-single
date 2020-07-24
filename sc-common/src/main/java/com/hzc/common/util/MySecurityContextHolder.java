//package com.hzc.common.util;
//
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @author: liuqi
// * @Date: 2019/4/2 10:56
// * @Description: 获取会话信息
// */
//public class MySecurityContextHolder {
//    /**
//     * 获取用户信息
//     *
//     * @return
//     */
//    public static UserInfoVo getUser() {
//        return ((MyAuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getDetails()).getUserInfoVo();
//    }
//
//    /**
//     * 获取用户名
//     *
//     * @return
//     */
//    public static String getUserName() {
//        return (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//    }
//
//    /**
//     * 获取jwtToken
//     *
//     * @return
//     */
//    public static String getToken() {
//        return ((MyAuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getDetails()).getJwtToken();
//
//    }
//
//    /**
//     * 用户编码
//     *
//     * @return
//     */
//    public static String getUserCode() {
//        return getUser().getCode();
//    }
//
//    public static List<String> getRoleIds() {
//        List<GrantedAuthority> list = com.scda.security.util.MySecurityContextHolder.getUser().getAuthorities();
//        if (list != null && !list.isEmpty()) {
//            return list.stream().map(vo -> vo.getAuthority()).collect(Collectors.toList());
//        }
//        return null;
//    }
//
//}
