//当前这个模块：api统一管理
import requests from "./request";

//三级联动接口
///api/product/getBaseCategoryList   get 无参数

export const reqCategoryList = () => {
    //发请求
    return requests({ url: "/", method: "get" });
};

//注册信息的填写
export const requser = (data) => {
    return requests({ url: "/requser", method: "post", data });
};


// 注册
export const request = (data) => {
    return requests({ url: "/" })
}