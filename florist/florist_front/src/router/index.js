import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

import login from "@/views/login/login.vue";
import register from "@/views/login/register.vue";
import Home from "@/views/Home/home.vue";
import ShoppingCart from "@/views/ShoppingCart/ShoppingCart.vue";

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
  ],
});

export default router;
