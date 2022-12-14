//当前这个模块：api统一管理
import requests from "./request";

//三级联动接口
///api/product/getBaseCategoryList   get 无参数

export const reqCategoryList = () => {
    //发请求
    return requests({ url: "/", method: "get" });
};

// 注册
export const request = (data) => {
    return requests({ url: "/user/save", method: "post", data });
};

//登录
export const login = (data) => {
    return requests({ url: "/user/login", method: "post", data });
};

//获取登录用户信息
export const getUserInfo = (data) => {
    return requests({ url: "/user/name", method: "post", data });
};

//获取首页8朵花
export const getFlower = () => {
    return requests({ url: "/flower/", method: "get" });
};

//获取详细页面的花图片
export const getFlowerview = () => {
    return requests({ url: "/flowerview/", method: "get" });
};

//获取用户购物车信息
export const getUserCar = (data) => {
    return requests({ url: "/ShopCart/", method: "post", data });
};

//插入购物车
export const addCart = (data) => {
    return requests({ url: "/ShopCart/addCart", method: "post", data });
}