import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

import login from "@/views/login/login.vue";
import register from "@/views/login/register.vue";
import Home from "@/views/Home/home.vue";
import ShoppingCart from "@/views/ShoppingCart/ShoppingCart.vue";
<<<<<<< HEAD
import xiangxi from "@/views/xiangxi/xiangxi.vue";

const router = new VueRouter({
    routes: [{
            path: "/login",
            component: login,
        },
        {
            path: "/register",
            component: register,
        },
        {
            path: "/",
            component: Home,
        },
        {
            path: "/ShoppingCart",
            component: ShoppingCart,
        },
        {
            path: "/xiangxi",
            component: xiangxi,
        }
    ],
=======
import adminLogin from "@/views/admin/adminLogin.vue";

const router = new VueRouter({
  routes: [
    {
      path: "/login",
      component: login,
    },
    {
      path: "/register",
      component: register,
    },
    {
      path: "/",
      component: Home,
    },
    {
      path: "/ShoppingCart",
      component: ShoppingCart,
    },
    {
      path: "/adminLogin",
      component: adminLogin,
    },
  ],
>>>>>>> master
});

export default router;